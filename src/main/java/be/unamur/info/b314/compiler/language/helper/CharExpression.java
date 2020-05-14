package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.PlayPlusException;

public class CharExpression {
    /**
     * Method that parse a char right expression
     * @param ctx current RightExpressionContext
     * @param application current application
     * @return appropriate context
     */
    public static Object parseCharRightExpression(PlayPlusParser.RightExprContext ctx, Application application) {
        if (ctx instanceof PlayPlusParser.CharContext) {
            return CharExpression.parseCharExpression((PlayPlusParser.CharContext)ctx, application);
        } else if (ctx instanceof PlayPlusParser.FunctionCallExpressionContext) {
            return FunctionExpression.parseFunctionCall(((PlayPlusParser.FunctionCallExpressionContext) ctx).functionCall(), "char", application);
        } else if (ctx instanceof PlayPlusParser.LeftExpressionContext) {
            return GenericExpression.parseLeftExpression((PlayPlusParser.LeftExpressionContext)ctx, "char", application);
        } else {
            throw new PlayPlusException("Cannot parse this as a char expression");
        }
    }

    /**
     * Method that parse a regular char expression
     * @param ctx current CharContext
     * @param application current application
     * @return CharExpression context
     */
    public static Object parseCharExpression(PlayPlusParser.CharContext ctx, Application application) {
        return ctx;
    }
}
