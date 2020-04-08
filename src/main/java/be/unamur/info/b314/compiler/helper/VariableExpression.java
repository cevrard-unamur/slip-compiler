package be.unamur.info.b314.compiler.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VariableExpression {
    public static Object parseVariableInstruction(PlayPlusParser.VariableInstructionContext ctx, Application application) {
        VariableExpression.parseVariableDefinition((PlayPlusParser.VariableDefinitionContext)ctx.variableDeclaration(), application);
        return ctx;
    }

    public static Object parseVariableDefinition(PlayPlusParser.VariableDefinitionContext ctx, Application application) {
        String variableType = "";

        for (TerminalNode id : ctx.ID()) {
            if (ctx.variableType() instanceof PlayPlusParser.ScalarTypeContext) {
                variableType = VariableHelper.addVariable((PlayPlusParser.ScalarTypeContext)ctx.variableType(), id, false, application);

                if (ctx.initVariable() != null) {
                    VariableExpression.initializeScalarVariable(ctx.initVariable(), variableType, application);
                }
            } else if (ctx.variableType() instanceof PlayPlusParser.ArrayTypeContext) {
                variableType = VariableHelper.addArray((PlayPlusParser.ArrayTypeContext)ctx.variableType(), id, application);

                if (ctx.initVariable() != null) {
                    VariableExpression.initializeArrayVariable(ctx.initVariable(), variableType, application);
                }
            } else if (ctx.variableType() instanceof PlayPlusParser.StructureTypeContext) {
                VariableHelper.addStructure(id, application);
            }
        }



        return ctx;
    }

    public static Object initializeScalarVariable(PlayPlusParser.InitVariableContext ctx, String expectedType, Application application) {
        VariableExpression.parseRightInitialisation((PlayPlusParser.RightInitialisationContext)ctx, expectedType, application);

        return ctx;
    }

    public static Object initializeArrayVariable(PlayPlusParser.InitVariableContext ctx, String expectedType, Application application) {
        if (ctx instanceof PlayPlusParser.RightInitialisationContext) {
            VariableExpression.parseRightInitialisation((PlayPlusParser.RightInitialisationContext)ctx, expectedType, application);
        } else {
            for (ParseTree child : ctx.children) {
                if (child instanceof PlayPlusParser.RightInitialisationContext) {
                    VariableExpression.parseRightInitialisation((PlayPlusParser.RightInitialisationContext)ctx, expectedType, application);
                } else if (child instanceof PlayPlusParser.InitArrayContext) {
                    for (PlayPlusParser.InitVariableContext init : ((PlayPlusParser.InitArrayContext) child).initVariable()) {
                        VariableExpression.initializeArrayVariable(init, expectedType, application);
                    }
                } else if (child instanceof TerminalNode) {
                } else {
                    throw new PlayPlusException("This variable initialisation is not handle");
                }
            }
        }

        return ctx;
    }

    private static Object parseRightInitialisation(PlayPlusParser.RightInitialisationContext ctx, String expectedType, Application application) {
        switch (expectedType) {
            case "integer":
                IntegerExpression.parseIntegerRightExpression(ctx.rightExpr(), application);
                break;
            case "boolean":
                BooleanExpression.parseBooleanRightExpression(ctx.rightExpr(), application);
                break;
            case "char":
                CharExpression.parseCharRightExpression(ctx.rightExpr() , application);
                break;
            default:
                throw new PlayPlusException("This argument type is not handle");
        }

        return ctx;
    }
}
