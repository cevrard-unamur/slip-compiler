package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

import java.io.PrintWriter;

public class LeftExpression {
    private static int leftExpressionId = 1;
    private static final String temporaryVariableName = "leftExpressionVar";

    private static String getVariableName() {
        return temporaryVariableName + leftExpressionId;
    }

    public static String enterLeftExpression(PlayPlusParser.LeftExpressionContext context, Application application, PrintWriter writer) {
        if (context.leftExpr() instanceof PlayPlusParser.LeftIdContext) {
            return ((PlayPlusParser.LeftIdContext) context.leftExpr()).ID().getText();
        }

        return "";
    }
}
