package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Function;
import be.unamur.info.b314.compiler.application.VariableBase;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.FunctionWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class FunctionExpression {
    /**
     * We execute the main function and it's children by calling appropriate methods
     * @param context the main context
     * @param application the application
     * @param writer the NBC writer
     */
    public static void enterMain(PlayPlusParser.MainContext context, Application application, PrintWriter writer) {
        FunctionWriter.writeMainThreadStart(writer);

        for (ParseTree child : context.mainFunctionInstruction().children) {
            if (child instanceof PlayPlusParser.DigInstructionContext) {
                ActionExpression.enterDigInstructionContext((PlayPlusParser.DigInstructionContext)child, writer);
            } else if (child instanceof PlayPlusParser.AssignationInstructionContext) {
                AssignationExpression.enterAssignationContext(((PlayPlusParser.AssignationInstructionContext) child).assignation(), application, writer);
            } else if (child instanceof PlayPlusParser.IfInstructionContext) {
                IfExpression.enterIfInstructionContext((PlayPlusParser.IfInstructionContext)child, application, writer);
            } else if (child instanceof PlayPlusParser.ActionInstructionContext) {
                ActionExpression.enterActionInstructionContext((PlayPlusParser.ActionInstructionContext)child, application, writer);
            } else if (child instanceof PlayPlusParser.VariableInstructionContext) {
                VariableExpression.enterVariableInstruction(
                        (PlayPlusParser.VariableInstructionContext)child,
                        application,
                        writer
                );
            } else if (child instanceof PlayPlusParser.FunctionCallInstructionContext) {
                FunctionExpression.enterFunctionCall(
                        ((PlayPlusParser.FunctionCallInstructionContext) child).functionCall(),
                        application,
                        writer
                );
            } else if (child instanceof PlayPlusParser.WhileInstructionContext) {
                WhileExpression.enterWhileInstruction(
                        (PlayPlusParser.WhileInstructionContext)child,
                        application,
                        writer
                );
            } else if (child instanceof PlayPlusParser.ForInstructionContext) {
                ForExpression.enterForInstruction(
                        (PlayPlusParser.ForInstructionContext)child,
                        application,
                        writer
                );
            } else if (child instanceof PlayPlusParser.RepeatInstructionContext) {
                RepeatExpression.enterRepeatInstruction(
                        (PlayPlusParser.RepeatInstructionContext)child,
                        application,
                        writer
                );
            } else if (child instanceof TerminalNode) {
                // Nothing to do in my knowledge
            } else {
                throw new PlayPlusException("This case is not managed");
            }
        }

        FunctionWriter.writeMainThreadEnd(writer);
    }

    /**
     * We execute a function and it's instruction by calling the enterFunctionInstructionContext methods
     * @param context the main context
     * @param application the application
     * @param writer the NBC writer
     */
    public static void enterFunction(PlayPlusParser.FunctionDefinitionContext context, Application application, PrintWriter writer) {
        application.enterContext(context.ID().getText());
        FunctionWriter.writeFunctionSubroutinesStart(writer, context.ID().getText());

        for (PlayPlusParser.FunctionInstContext functionContext : context.functionInst()) {
            FunctionExpression.enterFunctionInstructionContext((PlayPlusParser.FunctionInstructionContext)functionContext, application, writer);
        }

        FunctionWriter.writeFunctionSubroutinesEnd(writer);
        application.leaveContext();
    }

    /**
     * Assign the arguments to the function and call it
     * @param context the main context
     * @param application the application
     * @param writer the NBC writer
     * @return the name of the function
     */
    public static String enterFunctionCall(PlayPlusParser.FunctionCallContext context, Application application, PrintWriter writer) {
        String functionName = context.ID().getText();
        Function function = application.getFunction(functionName);
        // We set all the parameters
        for (int i = 0; i < context.rightExpr().size(); i++) {
            FunctionExpression.argumentAssignation(context.rightExpr(i), function.getArgument(i), application, writer);
        }
        // We call the function itself
        FunctionWriter.writeFunctionCall(writer, function.getName());

        return function.getVariable(function.getName()).getNameAndContext();
    }

    /**
     * Execute an instruction of a function
     * @param context the main context
     * @param application the application
     * @param writer the NBC writer
     */
    private static void enterFunctionInstructionContext(PlayPlusParser.FunctionInstructionContext context, Application application, PrintWriter writer) {
        for (PlayPlusParser.InstContext instruction : context.inst()) {
            if (instruction instanceof PlayPlusParser.AssignationInstructionContext) {
                AssignationExpression.enterAssignationContext(
                        ((PlayPlusParser.AssignationInstructionContext) instruction).assignation(),
                        application,
                        writer
                );
            } else if (instruction instanceof PlayPlusParser.VariableInstructionContext) {
                // This instruction does not need to be handle here as all variable are created at the beginning of the application
            } else if (instruction instanceof PlayPlusParser.ActionInstructionContext) {
                ActionExpression.enterActionInstructionContext(
                        (PlayPlusParser.ActionInstructionContext)instruction,
                        application,
                        writer
                );
            } else if (instruction instanceof PlayPlusParser.IfInstructionContext) {
                IfExpression.enterIfInstructionContext(
                        (PlayPlusParser.IfInstructionContext)instruction,
                        application,
                        writer
                );
            } else {
                throw new PlayPlusException("Not implemented");
            }
        }
    }

    /**
     * Assign an value to an argument
     * @param rightExpression the right context, which is the value for the argument
     * @param argument the argument
     * @param application the application
     * @param writer the NBC writer
     */
    private static void argumentAssignation(PlayPlusParser.RightExprContext rightExpression, VariableBase argument, Application application, PrintWriter writer) {
        if (rightExpression instanceof PlayPlusParser.NumberContext) {
            String argumentValue = ((PlayPlusParser.NumberContext) rightExpression).NUMBER().getText();
            VariableWriter.writeVariableSet(writer, argument.getNameAndContext(), argumentValue);
        } else if (rightExpression instanceof PlayPlusParser.CharContext) {
            String argumentValue = ((PlayPlusParser.CharContext) rightExpression).CHAR().getText();
            VariableWriter.writeVariableSet(writer, argument.getNameAndContext(), argumentValue);
        } else if (rightExpression instanceof PlayPlusParser.BooleanTrueContext) {
            VariableWriter.writeVariableSet(writer, argument.getNameAndContext(), NBCWriter.booleanTrue);
        } else if (rightExpression instanceof PlayPlusParser.BooleanFalseContext) {
            VariableWriter.writeVariableSet(writer, argument.getNameAndContext(), NBCWriter.booleanFalse);
        } else if (rightExpression instanceof PlayPlusParser.FunctionCallExpressionContext) {
            Function function = application.getFunction(
                    ((PlayPlusParser.FunctionCallExpressionContext) rightExpression).functionCall().ID().getText()
            );

            VariableBase returnVariable = function.getVariable(
                    ((PlayPlusParser.FunctionCallExpressionContext) rightExpression).functionCall().ID().getText()
            );
            // We call the function to retrieve the result of it and assign it to our argument
            FunctionExpression.enterFunctionCall(
                    ((PlayPlusParser.FunctionCallExpressionContext) rightExpression).functionCall(),
                    application,
                    writer);
            VariableWriter.writeVariableMove(writer,
                    argument.getNameAndContext(),
                    returnVariable.getNameAndContext());
        } else if (rightExpression instanceof PlayPlusParser.LeftExpressionContext) {
            // If we have a left expression, we need to check the type of it to know how to get the content of it
            PlayPlusParser.LeftExpressionContext leftExpression = ((PlayPlusParser.LeftExpressionContext) rightExpression);
            if (leftExpression.leftExpr() instanceof PlayPlusParser.LeftIdContext) {
                VariableBase targetVariable = application.getVariable(
                        ((PlayPlusParser.LeftIdContext) leftExpression.leftExpr()).ID().getText()
                );

                // If it's just an id, we need to get back the value of it and store it in the argument
                VariableWriter.writeVariableMove(
                        writer,
                        argument.getNameAndContext(),
                        targetVariable.getNameAndContext());
            } else if (leftExpression.leftExpr() instanceof PlayPlusParser.LeftArrayContext) {
                VariableBase targetVariable = application.getArray(
                        ((PlayPlusParser.LeftArrayContext) leftExpression.leftExpr()).ID().getText()
                );

                String indexVariable = "--";
                // We need to get the name of the right expression and execute the code of it
                for (PlayPlusParser.RightExprContext childRightExpression : ((PlayPlusParser.LeftArrayContext) leftExpression.leftExpr()).rightExpr()) {
                    indexVariable = RightExpression.enterRightExpression(childRightExpression, application, writer);
                }

                VariableWriter.writeExtractFromArray(
                        writer,
                        argument.getNameAndContext(),
                        targetVariable.getNameAndContext(),
                        indexVariable);
            }
        } else if (rightExpression instanceof PlayPlusParser.IntegerExpressionContext) {
            String argumentValue = IntegerExpression.enterIntegerExpression(
                    (PlayPlusParser.IntegerExpressionContext)rightExpression,
                    application,
                    writer
            );
            VariableWriter.writeVariableMove(writer, argument.getNameAndContext(), argumentValue);
        } else if (rightExpression instanceof PlayPlusParser.NegativeIntegerExpressionContext){
            String argumentValue = IntegerExpression.enterNegativeIntegerExpression(
                    (PlayPlusParser.NegativeIntegerExpressionContext)rightExpression,
                    application,
                    writer
            );
            VariableWriter.writeVariableMove(writer, argument.getNameAndContext(), argumentValue);
        } else if (rightExpression instanceof PlayPlusParser.CompExpressionContext) {
            String argumentValue = ComparisonExpression.enterCompExpression(
                    (PlayPlusParser.CompExpressionContext)rightExpression,
                    application,
                    writer
            );
            VariableWriter.writeVariableMove(writer, argument.getNameAndContext(), argumentValue);
        } else if (rightExpression instanceof PlayPlusParser.ParenthesesExpressionContext) {
            FunctionExpression.argumentAssignation(
                    ((PlayPlusParser.ParenthesesExpressionContext) rightExpression).rightExpr(),
                    argument,
                    application,
                    writer
            );
        } else if (rightExpression instanceof PlayPlusParser.BoolExpressionContext) {
            String argumentValue = ComparisonExpression.enterBoolean(
                    (PlayPlusParser.BoolExpressionContext)rightExpression,
                    application,
                    writer
            );
            VariableWriter.writeVariableMove(writer, argument.getNameAndContext(), argumentValue);
        } else {
            throw new PlayPlusException("Not implemented");
        }
    }
}
