package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.*;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class FunctionExpression {
    /**
     * Method that parse a function definition
     * @param ctx current function definition context
     * @param application current application
     * @return the function definition context
     */
    public static Object parseFunctionDefinition(PlayPlusParser.FunctionDefinitionContext ctx, Application application) {
        application.addFunction(ctx.ID().getText(), ctx.returnType().getText());

        // Check if there is any argument
        if (ctx.children.get(4) instanceof PlayPlusParser.FunctionParametersContext){
            FunctionExpression.parseFunctionArguments((PlayPlusParser.FunctionParametersContext)ctx.argumentList(), application);
        }
        // Check if there is any instructions
        if (ctx.functionInst().size() > 0) {
            FunctionExpression.parseFunctionInstruction((PlayPlusParser.FunctionInstructionContext)ctx.functionInst().get(0), application);
        }

        application.leaveContext();

        return ctx;
    }

    /**
     * Method that parse function arguments
     * @param ctx current function argument context
     * @param application current application
     * @return the function arguments context
     */
    public static Object parseFunctionArguments(PlayPlusParser.FunctionParametersContext ctx, Application application) {
        // Parse all the arguments
        for (PlayPlusParser.ArgumentContext argument : ctx.argument()) {
            FunctionExpression.parseArgument((PlayPlusParser.FunctionParameterContext) argument, application);
        }

        return ctx;
    }

    /**
     * Method that parse an argument
     * @param ctx current argument context
     * @param application current application
     * @return the argument context
     */
    public static Object parseArgument(PlayPlusParser.FunctionParameterContext ctx, Application application){

        ArrayList<VariableBase> arguments = new ArrayList<>();

        for (TerminalNode id : ctx.ID()) {
            if (ctx.variableType() instanceof PlayPlusParser.ScalarTypeContext) {
                arguments.add(new Variable(ctx.variableType().getText(), id.getText(), false, application.getContextName()));
            } else if (ctx.variableType() instanceof PlayPlusParser.ArrayTypeContext) {
                PlayPlusParser.ArrayContext arrayType = (PlayPlusParser.ArrayContext)ctx.variableType().children.get(0);

                arguments.add(new Array(id.getText(), arrayType.SCALAR().getText(), ArrayHelper.getSize(arrayType), application.getContextName()));
            } else if (ctx.variableType() instanceof PlayPlusParser.StructureTypeContext) {
                throw new PlayPlusException("The function argument is invalid");
            }
        }

        PlayPlusParser.FunctionParametersContext ctxParent = (PlayPlusParser.FunctionParametersContext)ctx.parent;
        PlayPlusParser.FunctionDefinitionContext function = (PlayPlusParser.FunctionDefinitionContext)ctxParent.parent;

        application.getFunction(function.ID().getText()).addArguments(arguments);

        return ctx;
    }

    /**
     * Method that parse a function instruction
     * @param ctx current function instruction context
     * @param application current application
     * @return the function instruction argument
     */
    public static Object parseFunctionInstruction(PlayPlusParser.FunctionInstructionContext ctx, Application application) {
        // Handle enumeration declaration
        for (PlayPlusParser.EnumDeclarationContext enumeration : ctx.enumDeclaration()) {
            EnumExpression.parseEnumerationDeclaration(enumeration, application);
        }

        // Handle constant declaration
        for (PlayPlusParser.ConstDeclarationContext constant : ctx.constDeclaration()) {
            ConstantExpression.parseConstantDeclaration(constant, application);
        }

        // Handle structure declaration
        for (PlayPlusParser.StructureDeclarationContext structure : ctx.structureDeclaration()) {
            StructureExpression.parseStructureDeclaration(structure, application);
        }

        // Handle instruction
        for (PlayPlusParser.InstContext instruction : ctx.inst()) {
            DeclarationExpression.parseInstruction(instruction, application);
        }

        return ctx;
    }

    /**
     * Method that parse a function call instruction
     * @param ctx current function call instruction context
     * @param expectedType function expected return type
     * @param application current application
     * @return the function call instruction context
     */
    public static Object parseFunctionCallInstruction(PlayPlusParser.FunctionCallInstructionContext ctx, String expectedType, Application application) {
        FunctionExpression.parseFunctionCall(ctx.functionCall(), expectedType, application);

        return ctx;
    }

    /**
     * Method that parse a function call
     * @param ctx current function call context
     * @param expectedType the function return expected type
     * @param application current application
     * @return the function call context
     */
    public static Object parseFunctionCall(PlayPlusParser.FunctionCallContext ctx, String expectedType, Application application) {
        // Check if the return type of the function is matching
        Function function = application.getFunction(ctx.ID().getText());

        if (!function.getReturnType().equals(expectedType)) {
            throw new PlayPlusException("The function type is not matching the expected one - " + expectedType);
        }

        // Check if the parameters are matching

        if (ctx.rightExpr().size() != function.getNumberOfArguments())
        {
            throw new PlayPlusException("The number of arguments is not matching the functions argument requirement");
        }else
        {
            for (int i = 0; i < function.getNumberOfArguments(); i++)
            {
                String argumentType = function.getArgumentType(i);

                switch (argumentType) {
                    case "integer":
                        IntegerExpression.parseIntegerRightExpression(ctx.rightExpr(i), application);
                        break;
                    case "boolean":
                        BooleanExpression.parseBooleanRightExpression(ctx.rightExpr(i), application);
                        break;
                    case "char":
                        CharExpression.parseCharRightExpression(ctx.rightExpr(i), application);
                        break;
                    default:
                        throw new PlayPlusException("This argument type is not handle");
                }
            }
        }
        return ctx;
    }
}
