package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VariableExpression {
    /**
     * Method that parse a variable instruction
     * @param ctx current variable instruction context
     * @param application current application
     * @return the variable instruction context
     */
    public static Object parseVariableInstruction(PlayPlusParser.VariableInstructionContext ctx, Application application) {
        VariableExpression.parseVariableDefinition((PlayPlusParser.VariableDefinitionContext)ctx.variableDeclaration(), application);
        return ctx;
    }

    public static Object parseVariableDefinition(PlayPlusParser.VariableDefinitionContext ctx, Application application) {
        for (TerminalNode id : ctx.ID()) {
            if (ctx.variableType() instanceof PlayPlusParser.ScalarTypeContext) {
                String variableData = VariableHelper.addVariable((PlayPlusParser.ScalarTypeContext)ctx.variableType(), id, false, application);

                if (ctx.initVariable() != null) {
                    VariableExpression.parseInitializeScalarVariable(ctx.initVariable(), variableData, application);
                }
            } else if (ctx.variableType() instanceof PlayPlusParser.ArrayTypeContext) {
                Tuple<String, Integer[]> variableType = VariableHelper.addArray((PlayPlusParser.ArrayTypeContext)ctx.variableType(), id, application);

                if (ctx.initVariable() != null) {
                    VariableExpression.parseInitializeArrayVariable(ctx.initVariable(), variableType.Item1, variableType.Item2, application);
                }
            } else if (ctx.variableType() instanceof PlayPlusParser.StructureTypeContext) {
                VariableHelper.addStructure(id, application);
                StructureExpression.parseStructureDeclaration(((PlayPlusParser.StructureTypeContext)ctx.variableType()).structureDeclaration(), application);
            }
        }

        return ctx;
    }

    /**
     * Method that parse an initialisation of a scalar variable
     * @param ctx current variable initialisation context
     * @param expectedType variable expected type
     * @param application current application
     * @return InitVariable context
     */
    private static Object parseInitializeScalarVariable(PlayPlusParser.InitVariableContext ctx, String expectedType, Application application) {
        VariableExpression.parseRightInitialisation((PlayPlusParser.RightInitialisationContext)ctx, expectedType, application);

        return ctx;
    }

    /**
     * Method that parse the initialisation of a variable in an array
     * @param ctx current initialisation variable context
     * @param expectedType variable expected type
     * @param arraySize the size of the array to initialise
     * @param application current application
     * @return the context of the initialised variable
     */
    private static Object parseInitializeArrayVariable(PlayPlusParser.InitVariableContext ctx, String expectedType, Integer[] arraySize, Application application) {
        // We check if the number of argument is matching the size of the array
        checkNumberOfArrayInitialisation((PlayPlusParser.ArrayInitialisationContext)ctx, arraySize);

        // We check the value of the initialization
        VariableExpression.parseInitializeVariable(ctx, expectedType, application);

        return ctx;
    }

    /**
     * Method that parse the initialisation of a variable
     * @param ctx current init variable context
     * @param expectedType variable expected type
     * @param application current application
     * @return the init variable context
     */
    private static Object parseInitializeVariable(PlayPlusParser.InitVariableContext ctx, String expectedType, Application application) {
        if (ctx instanceof PlayPlusParser.RightInitialisationContext) {
            VariableExpression.parseRightInitialisation((PlayPlusParser.RightInitialisationContext)ctx, expectedType, application);
        } else if (ctx instanceof PlayPlusParser.ArrayInitialisationContext) {
            for (PlayPlusParser.InitVariableContext child : ((PlayPlusParser.ArrayInitialisationContext) ctx).initVariable()) {
                VariableExpression.parseInitializeVariable(child, expectedType, application);
            }
        }

        return ctx;
    }

    /**
     * Method that parse a right initialisation
     * @param ctx current right initialisation context
     * @param expectedType the variable expected type
     * @param application current application
     * @return the right initialisation context
     */
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

    /**
     * Method that check the number of array to initialise
     * @param ctx current array initialisation context
     * @param arraySize number of variable in the array to initialise
     */
    private static void checkNumberOfArrayInitialisation(PlayPlusParser.ArrayInitialisationContext ctx, Integer[] arraySize) {
        if (ctx.initVariable().size() != arraySize[0]) {
            throw new PlayPlusException("The size of the initialisation is incorrect");
        }

        // If we have 2 dimensions, we check the number of line of each variable initialisation
        if (arraySize.length == 2) {
            for (PlayPlusParser.InitVariableContext childInit : ctx.initVariable()) {
                if (!(childInit instanceof PlayPlusParser.ArrayInitialisationContext) ||
                        ((PlayPlusParser.ArrayInitialisationContext)childInit).initVariable().size() != arraySize[1]) {
                    throw new PlayPlusException("The size of the initialisation is incorrect");
                }
            }
        }
    }
}
