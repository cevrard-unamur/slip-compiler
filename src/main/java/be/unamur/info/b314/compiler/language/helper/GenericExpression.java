package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.Array;
import be.unamur.info.b314.compiler.application.Variable;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GenericExpression {
    /**
     * Method that parse a left expression
     * @param ctx current left expression context
     * @param expectedType expected variable type
     * @param application current application
     * @return the left expression context
     */
    public static Object parseLeftExpression(PlayPlusParser.LeftExpressionContext ctx, String expectedType, Application application) {
        PlayPlusParser.LeftExprContext leftContext = ctx.leftExpr();

        if (leftContext instanceof PlayPlusParser.LeftIdContext) {
            Variable variable = application.getVariable(leftContext.getText());

            if (!variable.getType().equals(expectedType)) {
                throw new PlayPlusException("The type of the variable " + variable.getName() + " is incorrect - ID Context");
            }
        } else if (leftContext instanceof PlayPlusParser.LeftArrayContext) {
            Array array = application.getArray(((PlayPlusParser.LeftArrayContext) leftContext).ID().getText());


            if (!array.getType().equals(expectedType)) {
                throw new PlayPlusException("The type of the variable " + array.getName() + " is incorrect - Array Context");
            }
        } else if (leftContext instanceof PlayPlusParser.LeftPropertyContext) {
            PlayPlusParser.LeftExprContext recordExpression = ((PlayPlusParser.LeftPropertyContext) leftContext).leftExpr();
            TerminalNode arrayId = ((PlayPlusParser.LeftPropertyContext) leftContext).ID();

            Variable variable  = application.getVariableOfRecord(recordExpression.getText(), arrayId.getText());

            if (!variable.getType().equals(expectedType)) {
                throw new PlayPlusException("The type of the variable " + variable.getName() + " is incorrect - Record ID Context");
            }
        } else if (leftContext instanceof PlayPlusParser.LeftPropertyArrayContext) {
            PlayPlusParser.LeftExprContext recordExpression = ((PlayPlusParser.LeftPropertyArrayContext) leftContext).leftExpr();
            TerminalNode arrayId = ((PlayPlusParser.LeftPropertyArrayContext) leftContext).ID();

            Array array = application.getArrayOfRecord(recordExpression.getText(), arrayId.getText());

            if (!array.getType().equals(expectedType)) {
                throw new PlayPlusException("The type of the variable " + array.getName() + " is incorrect - Record Array Context");
            }
        } else {
            throw new PlayPlusException("This parsing of the left expression is not handle");
        }

        return ctx;
    }

    /**
     * Method that parse a comparison expression
     * @param ctx current comparison expression context
     * @param application current application
     * @return the comparison expression
     */
    public static Object parseCompExpression(PlayPlusParser.CompExpressionContext ctx, Application application) {
        PlayPlusParser.RightExprContext leftChild = ctx.rightExpr(0);
        PlayPlusParser.RightExprContext rightChild = ctx.rightExpr(1);

        String hasIntegerError = "";
        String hasBooleanError = "";
        String hasCharError = "";

        try {
            IntegerExpression.parseIntegerRightExpression(leftChild, application);
            IntegerExpression.parseIntegerRightExpression(rightChild, application);
        } catch (Exception ex) {
            hasIntegerError = ex.getMessage();
        }

        if (hasIntegerError != "") {
            try {
                BooleanExpression.parseBooleanRightExpression(leftChild, application);
                BooleanExpression.parseBooleanRightExpression(rightChild, application);
            } catch (Exception ex) {
                hasBooleanError = ex.getMessage();
            }

            if (hasBooleanError != "") {
                try {
                    CharExpression.parseCharRightExpression(leftChild, application);
                    CharExpression.parseCharRightExpression(rightChild, application);
                } catch (Exception ex) {
                    hasCharError = ex.getMessage();
                }
            }
        }

        if (hasCharError != "") {
            throw new PlayPlusException("Cannot compare those types - " + hasIntegerError + " - " + hasBooleanError + " - " + hasCharError);
        }

        return ctx;
    }

    /**
     * Method that parse a parentheses expression
     * @param ctx current parentheses expression
     * @param expectedType expression expected type
     * @param application current application
     * @return the parentheses expression context
     */
    public static Object parseParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx, String expectedType, Application application) {
        if (ctx.rightExpr() instanceof PlayPlusParser.ParenthesesExpressionContext) {
            parseParenthesesExpression((PlayPlusParser.ParenthesesExpressionContext)ctx.rightExpr(), expectedType, application);
        } else {
            if (ctx.rightExpr() instanceof PlayPlusParser.BoolExpressionContext && expectedType.equals("boolean")) {
                BooleanExpression.parseBooleanExpression((PlayPlusParser.BoolExpressionContext)ctx.rightExpr(), application);
            } else if (ctx.rightExpr() instanceof PlayPlusParser.IntegerExpressionContext && expectedType.equals("integer")) {
                IntegerExpression.parseIntegerExpression((PlayPlusParser.IntegerExpressionContext)ctx.rightExpr(), application);
            } else if (ctx.rightExpr() instanceof PlayPlusParser.CompExpressionContext && expectedType.equals("boolean")) {
                IntegerExpression.parseIntegerRightExpression(ctx.rightExpr(), application);
            } else if (ctx.rightExpr() instanceof PlayPlusParser.NotExpressionContext && expectedType.equals("boolean")) {
                BooleanExpression.parseNotExpression((PlayPlusParser.NotExpressionContext)ctx.rightExpr(), application);
            } else {
                throw new PlayPlusException("This parentheses construction is not known");
            }
        }

        return ctx;
    }
}
