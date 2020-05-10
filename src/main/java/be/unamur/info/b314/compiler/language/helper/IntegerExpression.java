package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.PlayPlusException;

public class IntegerExpression {
    /**
     * Method that parse an integer right expression
     * @param ctx current right expression context
     * @param application current application
     * @return the appropriate context
     */
    public static Object parseIntegerRightExpression(PlayPlusParser.RightExprContext ctx, Application application) {
        if (ctx instanceof PlayPlusParser.NumberContext) {
            return ctx;
        } else if (ctx instanceof PlayPlusParser.IntegerExpressionContext) {
            return IntegerExpression.parseIntegerExpression((PlayPlusParser.IntegerExpressionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.ParenthesesExpressionContext) {
            return IntegerExpression.parseIntegerParenthesesExpression((PlayPlusParser.ParenthesesExpressionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.LeftExpressionContext) {
            return IntegerExpression.parseIntegerLeftExpression((PlayPlusParser.LeftExpressionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.CompExpressionContext) {
            return GenericExpression.parseCompExpression((PlayPlusParser.CompExpressionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.NegativeIntegerExpressionContext) {
            return IntegerExpression.parseIntegerRightExpression(((PlayPlusParser.NegativeIntegerExpressionContext) ctx).rightExpr(), application);
        } else if (ctx instanceof PlayPlusParser.FunctionCallExpressionContext) {
            return FunctionExpression.parseFunctionCall(((PlayPlusParser.FunctionCallExpressionContext) ctx).functionCall(), "integer", application);
        } else {
            throw new PlayPlusException("Cannot parse this as an integer expression");
        }
    }

    /**
     * Method that parse an integer expression
     * @param ctx current context
     * @param application current application
     * @return the integer expression context
     */
    public static Object parseIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx, Application application) {
        PlayPlusParser.RightExprContext leftChild = ctx.rightExpr(0);
        PlayPlusParser.RightExprContext rightChild = ctx.rightExpr(1);

        IntegerExpression.parseIntegerRightExpression(leftChild, application);
        IntegerExpression.parseIntegerRightExpression(rightChild, application);

        return ctx;
    }

    /**
     * Method that parse an integer parentheses expression
     * @param ctx current integer parentheses expression context
     * @param application current application
     * @return the integer right expression context
     */
    public static Object parseIntegerParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx, Application application) {
        return IntegerExpression.parseIntegerRightExpression(ctx.rightExpr(), application);
    }

    /**
     * Method that parse a integer left expression context
     * @param ctx current integer left expression context
     * @param application current application
     * @return the left expression context
     */
    public static Object parseIntegerLeftExpression(PlayPlusParser.LeftExpressionContext ctx, Application application) {
        return GenericExpression.parseLeftExpression(ctx, "integer", application);
    }
}
