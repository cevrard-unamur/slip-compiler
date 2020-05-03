package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.PrintWriter;

public class LeftExpression {
    private static int leftExpressionId = 1;
    private static final String temporaryVariableName = "__leftExpressionVar";

    private static String getLeftExpressionName() {
        return temporaryVariableName + leftExpressionId;
    }

    public static String enterLeftExpression(PlayPlusParser.LeftExpressionContext context, Application application, PrintWriter writer) {
        return LeftExpression.enterLeftExpression(
                context.leftExpr(),
                application,
                writer
        );
    }

    public static String enterLeftExpression(PlayPlusParser.LeftExprContext context, Application application, PrintWriter writer) {
        if (context instanceof PlayPlusParser.LeftIdContext) {
            return ((PlayPlusParser.LeftIdContext) context).ID().getText();
        } else if (context instanceof PlayPlusParser.LeftArrayContext) {
            String indexVariable = "--";
            String variableName = getLeftExpressionName();
            // We need to get the name of the right expression and execute the code of it
            for (PlayPlusParser.RightExprContext childRightExpression : ((PlayPlusParser.LeftArrayContext) context).rightExpr()) {
                indexVariable = RightExpression.enterRightExpression(childRightExpression, application, writer);
            }

            VariableWriter.writeTemporaryScalarInitialisation(writer, NBCCodeTypes.Int, variableName);

            VariableWriter.writeExtractFromArray(
                    writer,
                    variableName,
                    ((PlayPlusParser.LeftArrayContext) context).ID().getText(),
                    indexVariable);

            LeftExpression.leftExpressionId++;
            return variableName;
        }

        return "--";
    }
}
