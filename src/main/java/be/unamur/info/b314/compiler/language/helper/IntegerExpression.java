package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.PlayPlusException;

public class IntegerExpression {
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

    public static Object parseIntegerExpression(PlayPlusParser.IntegerExpressionContext ctx, Application application) {
        PlayPlusParser.RightExprContext leftChild = ctx.rightExpr(0);
        PlayPlusParser.RightExprContext rightChild = ctx.rightExpr(1);

        IntegerExpression.parseIntegerRightExpression(leftChild, application);
        IntegerExpression.parseIntegerRightExpression(rightChild, application);

        return ctx;
    }

    public static Object parseIntegerParenthesesExpression(PlayPlusParser.ParenthesesExpressionContext ctx, Application application) {
        return IntegerExpression.parseIntegerRightExpression(ctx.rightExpr(), application);
    }

    public static Object parseIntegerLeftExpression(PlayPlusParser.LeftExpressionContext ctx, Application application) {
        return GenericExpression.parseLeftExpression(ctx, "integer", application);
    }
}
