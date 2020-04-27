package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.IntegerRightExpressionException;

public class CharExpression {
    // Parse char expression
    public static Object parseCharRightExpression(PlayPlusParser.RightExprContext ctx, Application application) {
        if (ctx instanceof PlayPlusParser.CharContext) {
            return CharExpression.parseCharExpression((PlayPlusParser.CharContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.FunctionCallExpressionContext) {
            return FunctionExpression.parseFunctionCall(((PlayPlusParser.FunctionCallExpressionContext) ctx).functionCall(), "char", application);
        } else if (ctx instanceof PlayPlusParser.LeftExpressionContext) {
            return GenericExpression.parseLeftExpression((PlayPlusParser.LeftExpressionContext)ctx, "char", application);
        } else {
            throw new IntegerRightExpressionException("Cannot parse this as a char expression");
        }
    }

    public static Object parseCharExpression(PlayPlusParser.CharContext ctx, Application application) {
        return ctx;
    }
}
