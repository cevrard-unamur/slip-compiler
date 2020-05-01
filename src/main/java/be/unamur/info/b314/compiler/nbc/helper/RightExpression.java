package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.PrintWriter;

public class RightExpression {
    private static int rightExpressionId = 1;
    private static final String temporaryVariableName = "__rightExpressionVar";

    private static String getVariableName() {
        return temporaryVariableName + rightExpressionId;
    }

    public static String enterRightExpression(PlayPlusParser.RightExprContext context, Application application, PrintWriter writer) {
        if (context instanceof PlayPlusParser.NumberContext) {
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarInitialisation(writer,
                    NBCCodeTypes.Int,
                    variableName);
            VariableWriter.writeVariableSet(writer,
                    variableName,
                    ((PlayPlusParser.NumberContext) context).NUMBER().getText());
            rightExpressionId++;
            return variableName;
        } else if (context instanceof PlayPlusParser.FunctionCallExpressionContext) {
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarInitialisation(writer,
                    NBCCodeTypes.Int,
                    variableName);
            VariableWriter.writeVariableMove(writer,
                    variableName,
                    ((PlayPlusParser.FunctionCallExpressionContext) context).functionCall().ID().getText());
            rightExpressionId++;
            return variableName;
        } else if (context instanceof PlayPlusParser.LeftExpressionContext) {
            return LeftExpression.enterLeftExpression((PlayPlusParser.LeftExpressionContext)context, application, writer);
        }

        return "";
    }
}
