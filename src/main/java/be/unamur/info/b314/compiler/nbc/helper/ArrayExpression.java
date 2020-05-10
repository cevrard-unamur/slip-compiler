package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ArrayExpression {
    /**
     * Enters in the array initialisation context to write the NBC code of it.
     * @param context the array initialisation context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return a list of all the initialize variable.
     */
    public static List<String> enterArrayInitialisation(
            PlayPlusParser.ArrayInitialisationContext context,
            Application application,
            PrintWriter writer
    ) {
        List<String> variables = new ArrayList<>();

        for (PlayPlusParser.InitVariableContext initVariableContext : context.initVariable()) {
            if (initVariableContext instanceof PlayPlusParser.ArrayInitialisationContext) {
                variables.addAll(enterArrayInitialisation((PlayPlusParser.ArrayInitialisationContext) initVariableContext, application, writer));
            } else if (initVariableContext instanceof PlayPlusParser.RightInitialisationContext) {
                PlayPlusParser.RightExprContext rightExprContext = ((PlayPlusParser.RightInitialisationContext) initVariableContext).rightExpr();
                variables.add(RightExpression.enterRightExpression(rightExprContext, application, writer));
            }
        }

        return variables;
    }
}
