package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.application.VariableBase;
import be.unamur.info.b314.compiler.exception.PlayPlusException;

import org.antlr.v4.runtime.tree.TerminalNode;

public class DeclarationExpression {
    public static Object parseGlobalDeclaration(PlayPlusParser.GlobalDeclarationContext ctx, Application application) {
        Object declaration = ctx.children.get(0);

        if (declaration instanceof PlayPlusParser.VariableDefinitionContext) {
            VariableExpression.parseVariableDefinition((PlayPlusParser.VariableDefinitionContext)declaration, application);
        } else if (declaration instanceof PlayPlusParser.StructureDeclarationContext) {
            StructureExpression.parseStructureDeclaration((PlayPlusParser.StructureDeclarationContext)declaration, application);
        } else if (declaration instanceof PlayPlusParser.EnumDeclarationContext) {
            EnumExpression.parseEnumeration((PlayPlusParser.EnumerationContext)declaration, application);
        } else if (declaration instanceof PlayPlusParser.ConstantContext) {
            ConstantExpression.parseConstant((PlayPlusParser.ConstantContext)declaration, application);
        } else {
            throw new PlayPlusException("This global declaration is not managed");
        }

        // We check if we have an assignation


        return ctx;
    }

    public static Object parseAssignationInstruction(PlayPlusParser.AssignationInstructionContext ctx, Application application) {
        return DeclarationExpression.parseAssignation(ctx.assignation(), application);
    }

    public static Object parseAssignation(PlayPlusParser.AssignationContext ctx, Application application) {
        // We check the validity of both expression
        PlayPlusParser.LeftExprContext leftExpression = ctx.leftExpr();
        PlayPlusParser.RightExprContext rightExpression = ctx.rightExpr();

        VariableBase leftVariable = null;

        if (leftExpression instanceof PlayPlusParser.LeftIdContext) {
            TerminalNode id = ((PlayPlusParser.LeftIdContext) leftExpression).ID();
            leftVariable = application.getVariable(id.getText());
        } else if (leftExpression instanceof PlayPlusParser.LeftArrayContext) {
            TerminalNode id = ((PlayPlusParser.LeftArrayContext) leftExpression).ID();
            leftVariable = application.getArray(id.getText());
        } else if (leftExpression instanceof PlayPlusParser.LeftPropertyArrayContext) {
            PlayPlusParser.LeftExprContext recordExpression = ((PlayPlusParser.LeftPropertyArrayContext) leftExpression).leftExpr();
            TerminalNode arrayId = ((PlayPlusParser.LeftPropertyArrayContext) leftExpression).ID();
            leftVariable = application.getArrayOfRecord(recordExpression.getText(), arrayId.getText());
        }else if (leftExpression instanceof PlayPlusParser.LeftPropertyContext) {
            PlayPlusParser.LeftExprContext recordExpression = ((PlayPlusParser.LeftPropertyContext) leftExpression).leftExpr();
            TerminalNode arrayId = ((PlayPlusParser.LeftPropertyContext) leftExpression).ID();
            leftVariable = application.getVariableOfRecord(recordExpression.getText(), arrayId.getText());
        } else {
            throw new PlayPlusException("This left expression as an assignation is not known");
        }

        if (leftVariable instanceof Variable && ((Variable) leftVariable).getConstant()) {
            throw new PlayPlusException("Cannot assign a constant variable");
        }

        if (rightExpression instanceof PlayPlusParser.NumberContext ||
                rightExpression instanceof PlayPlusParser.IntegerExpressionContext) {
            if (!leftVariable.getType().equals("integer")) {
                throw new PlayPlusException("The left and right type are not both integer");
            }

            IntegerExpression.parseIntegerRightExpression(rightExpression, application);
        } else if (rightExpression instanceof PlayPlusParser.NegativeIntegerExpressionContext) {
            IntegerExpression.parseIntegerRightExpression(((PlayPlusParser.NegativeIntegerExpressionContext) rightExpression).rightExpr(), application);
        } else if (rightExpression instanceof PlayPlusParser.CompExpressionContext) {
            if (!leftVariable.getType().equals("boolean")) {
                throw new PlayPlusException("The left type is not a boolean but we compare the value");
            }

            IntegerExpression.parseIntegerRightExpression(rightExpression, application);
        } else if (rightExpression instanceof PlayPlusParser.BoolExpressionContext ||
                rightExpression instanceof PlayPlusParser.BooleanFalseContext ||
                rightExpression instanceof PlayPlusParser.BooleanTrueContext ||
                rightExpression instanceof PlayPlusParser.NotExpressionContext) {
            if (!leftVariable.getType().equals("boolean")) {
                throw new PlayPlusException("The left and right type are not both boolean");
            }

            BooleanExpression.parseBooleanRightExpression(rightExpression, application);
        } else if (rightExpression instanceof PlayPlusParser.ParenthesesExpressionContext) {
            GenericExpression.parseParenthesesExpression((PlayPlusParser.ParenthesesExpressionContext)rightExpression, leftVariable.getType(), application);
        } else if (rightExpression instanceof PlayPlusParser.CharContext) {
            if (!leftVariable.getType().equals("char")) {
                throw new PlayPlusException("The left and right type are not both char");
            }
        } else if (rightExpression instanceof PlayPlusParser.LeftExpressionContext) {
            GenericExpression.parseLeftExpression((PlayPlusParser.LeftExpressionContext)rightExpression, leftVariable.getType(), application);
        } else if (rightExpression instanceof PlayPlusParser.FunctionCallExpressionContext) {
            FunctionExpression.parseFunctionCall(((PlayPlusParser.FunctionCallExpressionContext) rightExpression).functionCall(), leftVariable.getType(), application);
        } else {
            throw new PlayPlusException("This right expression as an assignation is not known");
        }

        return ctx;
    }

    public static Object parseInstruction(PlayPlusParser.InstContext ctx, Application application) {
        if (ctx instanceof PlayPlusParser.ActionInstructionContext) {
            ActionExpression.parseActionInstruction((PlayPlusParser.ActionInstructionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.AssignationInstructionContext) {
            DeclarationExpression.parseAssignationInstruction((PlayPlusParser.AssignationInstructionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.VariableInstructionContext) {
            VariableExpression.parseVariableInstruction((PlayPlusParser.VariableInstructionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.IfInstructionContext) {
            IfExpression.parseIfInstruction((PlayPlusParser.IfInstructionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.WhileInstructionContext) {
            WhileExpression.parseWhileInstruction((PlayPlusParser.WhileInstructionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.RepeatInstructionContext) {
            RepeatExpression.parseRepeatInstruction((PlayPlusParser.RepeatInstructionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.ForInstructionContext) {
            ForExpression.parseForInstruction((PlayPlusParser.ForInstructionContext)ctx, application);
        }
        return ctx;
    }

    public static Object parseMainInstructionContext(PlayPlusParser.MainInstructionContext ctx, Application application) {
        for (Object node : ctx.children) {
            if (node instanceof PlayPlusParser.ActionInstructionContext) {
                ActionExpression.parseActionInstruction((PlayPlusParser.ActionInstructionContext)node, application);
            } else if (node instanceof PlayPlusParser.AssignationInstructionContext) {
                DeclarationExpression.parseAssignationInstruction((PlayPlusParser.AssignationInstructionContext)node, application);
            } else if (node instanceof PlayPlusParser.IfInstructionContext) {
                IfExpression.parseIfInstruction((PlayPlusParser.IfInstructionContext)node, application);
            } else if (node instanceof PlayPlusParser.WhileInstructionContext) {
                WhileExpression.parseWhileInstruction((PlayPlusParser.WhileInstructionContext)node, application);
            } else if (node instanceof PlayPlusParser.ForInstructionContext) {
                ForExpression.parseForInstruction((PlayPlusParser.ForInstructionContext)node, application);
            } else if (node instanceof PlayPlusParser.RepeatInstructionContext) {
                RepeatExpression.parseRepeatInstruction((PlayPlusParser.RepeatInstructionContext)node, application);
            } else if (node instanceof PlayPlusParser.FunctionCallInstructionContext) {
                FunctionExpression.parseFunctionCallInstruction((PlayPlusParser.FunctionCallInstructionContext)node, "void", application);
            } else if (node instanceof PlayPlusParser.DigInstructionContext) {
            } else if (node instanceof TerminalNode) {
            } else {
                throw new PlayPlusException("Not manage");
            }
        }

        return ctx;
    }
}
