package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.PrintWriter;

public class RightExpression {
    private static int rightExpressionId = 1;
    private static final String temporaryVariableName = "rightExpressionVar";

    public static String enterRightExpression(PlayPlusParser.RightExprContext context, Application application, PrintWriter writer) {
        if (context instanceof PlayPlusParser.NumberContext) {
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarInitialisation(writer,
                    NBCCodeTypes.Int,
                    variableName,
                    ((PlayPlusParser.NumberContext) context).NUMBER().getText());
            rightExpressionId++;
            return variableName;
        }

        return "";
    }

    private static String getVariableName() {
        return temporaryVariableName + rightExpressionId;
    }
}
