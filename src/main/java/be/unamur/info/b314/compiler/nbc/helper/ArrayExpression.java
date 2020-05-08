package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

import java.io.PrintWriter;

public class ArrayExpression {
    public static String enterInit(PlayPlusParser.ArrayInitialisationContext context, Application application, PrintWriter writer) {
        String variables = "";

        for(PlayPlusParser.InitVariableContext initVariableContext : context.initVariable()) {
            if (initVariableContext instanceof PlayPlusParser.ArrayInitialisationContext) {

                variables = variables.concat(enterInit((PlayPlusParser.ArrayInitialisationContext)initVariableContext, application, writer));

            }else if (initVariableContext instanceof PlayPlusParser.RightInitialisationContext) {

                PlayPlusParser.RightExprContext rightExprContext = ((PlayPlusParser.RightInitialisationContext) initVariableContext).rightExpr();

                variables = variables.concat(RightExpression.enterRightExpression(rightExprContext, application, writer));
                variables = variables.concat(" ,");
            }
        }
        return variables;
    }
}
