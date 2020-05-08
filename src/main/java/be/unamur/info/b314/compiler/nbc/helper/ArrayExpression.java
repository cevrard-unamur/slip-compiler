package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ArrayExpression {
    public static List<String> enterInit(PlayPlusParser.ArrayInitialisationContext context, Application application, PrintWriter writer) {
        List<String> variables = new ArrayList<>();

        for (PlayPlusParser.InitVariableContext initVariableContext : context.initVariable()) {
            if (initVariableContext instanceof PlayPlusParser.ArrayInitialisationContext) {
                variables.addAll(enterInit((PlayPlusParser.ArrayInitialisationContext) initVariableContext, application, writer));
            } else if (initVariableContext instanceof PlayPlusParser.RightInitialisationContext) {
                PlayPlusParser.RightExprContext rightExprContext = ((PlayPlusParser.RightInitialisationContext) initVariableContext).rightExpr();
                variables.add(RightExpression.enterRightExpression(rightExprContext, application, writer));
            }
        }

        return variables;
    }
}
