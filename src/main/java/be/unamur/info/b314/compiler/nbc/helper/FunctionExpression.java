package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Function;
import be.unamur.info.b314.compiler.application.VariableBase;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.ActionWriter;
import be.unamur.info.b314.compiler.nbc.writer.FunctionWriter;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;

public class FunctionExpression {
    public static void enterMain(PlayPlusParser.MainContext context, Application application, PrintWriter writer) {
        FunctionWriter.writeMainThreadStart(writer);

        for (ParseTree child : context.mainFunctionInstruction().children) {
            if (child instanceof PlayPlusParser.DigInstructionContext) {
                FunctionExpression.enterDig((PlayPlusParser.DigInstructionContext)child, writer);
            } else if (child instanceof PlayPlusParser.AssignationInstructionContext) {
                AssignationExpression.enterAssignationContext(((PlayPlusParser.AssignationInstructionContext) child).assignation(), application, writer);
            } else if (child instanceof PlayPlusParser.IfInstructionContext) {
                IfExpression.enterIfInstructionContext((PlayPlusParser.IfInstructionContext)child, application, writer);
            }
        }

        FunctionWriter.writeMainThreadEnd(writer);
    }

    public static void enterFunction(PlayPlusParser.FunctionDefinitionContext context, Application application, PrintWriter writer) {
        application.enterContext(context.ID().getText());
        FunctionWriter.writeFunctionSubroutinesStart(writer, context.ID().getText());

        for (PlayPlusParser.FunctionInstContext functionContext : context.functionInst()) {
            FunctionExpression.enterFunctionInstructionContext((PlayPlusParser.FunctionInstructionContext)functionContext, application, writer);
        }

        FunctionWriter.writeFunctionSubroutinesEnd(writer);
        application.leaveContext();
    }

    public static void enterDig(PlayPlusParser.DigInstructionContext context, PrintWriter writer) {
        ActionWriter.writeDig(writer);
    }

    public static void enterJump(PlayPlusParser.DigInstructionContext context, PrintWriter writer) {
        // TODO loop on the right expression
    }

    public static void enterFight(PlayPlusParser.DigInstructionContext context, PrintWriter writer) {
        ActionWriter.writeFight(writer);
    }

    public static void enterFunctionCall(PlayPlusParser.FunctionCallContext context, Application application, PrintWriter writer) {
        Function function = application.getFunction(context.ID().getText());
        // We set all the parameters
        for (int i = 0; i < context.rightExpr().size(); i++) {
            FunctionExpression.argumentAssignation(context.rightExpr(i), function.getArgument(i), application, writer);
        }
        // We call the function itself
        FunctionWriter.writeFunctionCall(writer, context.ID().getText());
    }

    private static void enterFunctionInstructionContext(PlayPlusParser.FunctionInstructionContext context, Application application, PrintWriter writer) {
        for (PlayPlusParser.InstContext instruction : context.inst()) {
            if (instruction instanceof PlayPlusParser.AssignationInstructionContext) {
                AssignationExpression.enterAssignationContext(((PlayPlusParser.AssignationInstructionContext) instruction).assignation(), application, writer);
            }
        }
    }

    private static void argumentAssignation(PlayPlusParser.RightExprContext rightExpression, VariableBase argument, Application application, PrintWriter writer) {
        if (rightExpression instanceof PlayPlusParser.NumberContext) {
            String argumentValue = ((PlayPlusParser.NumberContext) rightExpression).NUMBER().getText();
            VariableWriter.writeVariableSet(writer, argument.getName(), argumentValue);
        } else if (rightExpression instanceof PlayPlusParser.CharContext) {
            String argumentValue = ((PlayPlusParser.CharContext) rightExpression).CHAR().getText();
            VariableWriter.writeVariableSet(writer, argument.getName(), argumentValue);
        } else if (rightExpression instanceof PlayPlusParser.BooleanTrueContext) {
            VariableWriter.writeVariableSet(writer, argument.getName(), "1");
        } else if (rightExpression instanceof PlayPlusParser.BooleanFalseContext) {
            VariableWriter.writeVariableSet(writer, argument.getName(), "0");
        } else if (rightExpression instanceof PlayPlusParser.FunctionCallExpressionContext) {
            FunctionExpression.enterFunctionCall(
                    ((PlayPlusParser.FunctionCallExpressionContext) rightExpression).functionCall(),
                    application,
                    writer);
            VariableWriter.writeVariableMove(writer,
                    argument.getName(),
                    ((PlayPlusParser.FunctionCallExpressionContext) rightExpression).functionCall().ID().getText());
        } else if (rightExpression instanceof PlayPlusParser.LeftExpressionContext) {
            PlayPlusParser.LeftExpressionContext leftExpression = ((PlayPlusParser.LeftExpressionContext) rightExpression);
            if (leftExpression.leftExpr() instanceof PlayPlusParser.LeftIdContext) {
                VariableWriter.writeVariableMove(
                        writer,
                        argument.getName(),
                        ((PlayPlusParser.LeftIdContext) leftExpression.leftExpr()).ID().getText());
            } else if (leftExpression.leftExpr() instanceof PlayPlusParser.LeftArrayContext) {
                String indexVariable = "--";
                // We need to get the name of the right expression and execute the code of it
                for (PlayPlusParser.RightExprContext childRightExpression : ((PlayPlusParser.LeftArrayContext) leftExpression.leftExpr()).rightExpr()) {
                    indexVariable = RightExpression.enterRightExpression(childRightExpression, application, writer);
                }

                VariableWriter.writeExtractFromArray(
                        writer,
                        argument.getName(),
                        ((PlayPlusParser.LeftArrayContext) leftExpression.leftExpr()).ID().getText(),
                        indexVariable);
            }
        } else {
            throw new PlayPlusException("Temp");
        }
    }
}
