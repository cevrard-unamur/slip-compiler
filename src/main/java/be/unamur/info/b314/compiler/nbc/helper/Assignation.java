package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.VariableBase;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.PrintWriter;

public class Assignation {
    public static void enterAssignationContext(PlayPlusParser.AssignationContext context, Application application, PrintWriter writer) {
        String variableId = "";

        if (context.leftExpr() instanceof PlayPlusParser.LeftIdContext) {
            variableId = ((PlayPlusParser.LeftIdContext)context.leftExpr()).ID().getText();
        }

        VariableBase variable = application.getVariable(variableId);

        if (context.rightExpr() instanceof PlayPlusParser.CharContext) {
            VariableWriter.writeVariableSet(writer, variable.getName(), ((PlayPlusParser.CharContext) context.rightExpr()).CHAR().getText());
        } else if (context.rightExpr() instanceof PlayPlusParser.LeftExpressionContext) {
            VariableBase variableSource = application.getVariable(Assignation.getLeftExpressionContextId((PlayPlusParser.LeftExpressionContext)context.rightExpr()));
            VariableWriter.writeVariableMove(writer, variable.getName(), variableSource.getName());
        }
    }

    private static String getLeftExpressionContextId(PlayPlusParser.LeftExpressionContext context) {
        if (context.leftExpr() instanceof PlayPlusParser.LeftIdContext) {
            return ((PlayPlusParser.LeftIdContext) context.leftExpr()).ID().getText();
        }

        return "";
    }
}
