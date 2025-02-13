package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.PlayPlusException;

public class BooleanExpression {
    /**
     * Method that parse a boolean right expression
     * @param ctx current RightExpressionContext
     * @param application current application
     * @return appropriate context
     */
    public static Object parseBooleanRightExpression(PlayPlusParser.RightExprContext ctx, Application application) {
        if (ctx instanceof PlayPlusParser.BooleanTrueContext || ctx instanceof PlayPlusParser.BooleanFalseContext) {
            return ctx;
        } else if (ctx instanceof PlayPlusParser.LeftExpressionContext) {
            return BooleanExpression.parseBooleanLeftExpression((PlayPlusParser.LeftExpressionContext) ctx, application);
        } else if (ctx instanceof PlayPlusParser.ParenthesesExpressionContext) {
            return BooleanExpression.parseBooleanParenthesesExpression((PlayPlusParser.ParenthesesExpressionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.CompExpressionContext) {
            return GenericExpression.parseCompExpression((PlayPlusParser.CompExpressionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.BoolExpressionContext) {
            return BooleanExpression.parseBooleanExpression((PlayPlusParser.BoolExpressionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.NotExpressionContext) {
            return BooleanExpression.parseNotExpression((PlayPlusParser.NotExpressionContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.FunctionCallExpressionContext) {
            return FunctionExpression.parseFunctionCall(((PlayPlusParser.FunctionCallExpressionContext) ctx).functionCall(), "boolean", application);
        } else {
            throw new PlayPlusException("Cannot parse this as a boolean expression");
        }
    }

    /**
     * Method that parse a regular boolean expression
     * @param ctx current BooleanExpression context
     * @param application current application
     * @return current context
     */
    public static Object parseBooleanExpression(PlayPlusParser.BoolExpressionContext ctx, Application application) {
        PlayPlusParser.RightExprContext leftChild = ctx.rightExpr(0);
        PlayPlusParser.RightExprContext rightChild = ctx.rightExpr(1);

        BooleanExpression.parseBooleanRightExpression(leftChild, application);
        BooleanExpression.parseBooleanRightExpression(rightChild, application);

        return ctx;
    }

    /**
     * Method that parse left boolean expression
     * @param ctx current LeftExpressionContext
     * @param application current application
     * @return BooleanLeftExpression context
     */
    public static Object parseBooleanLeftExpression(PlayPlusParser.LeftExpressionContext ctx, Application application) {
        return GenericExpression.parseLeftExpression(ctx, "boolean", application);
    }

    /**
     * Method that parse a boolean parentheses expression
     * @param ctx current ParenthesesExpressionContext
     * @param application current application
     * @return appropriate context
     */
    public static Object parseBooleanParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx, Application application) {
        return BooleanExpression.parseBooleanRightExpression(ctx.rightExpr(), application);
    }

    /**
     * Method that parse a not expression
     * @param ctx current NotExpressionContext
     * @param application current application
     * @return appropriate context
     */
    public static Object parseNotExpression(PlayPlusParser.NotExpressionContext ctx, Application application) {
        return BooleanExpression.parseBooleanRightExpression(ctx.rightExpr(), application);
    }
}
