package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.VariableBase;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.PrintWriter;

public class LeftExpression {
    /**
     * The left identifier for the temporary variable.
     */
    private static int leftExpressionId = 1;
    /**
     * The prefix name of the temporary variable
     */
    private static final String temporaryVariableName = "__leftExpressionVar";

    /**
     * Gets the name of the temporary variable use for the left expression.
     * @return the name of the temporary variable use for the left expression.
     */
    private static String getLeftExpressionName() {
        return temporaryVariableName + leftExpressionId;
    }

    /**
     * Enters in a left expression to write the NBC code of it.
     * @param context the left expression context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the left expression result.
     */
    public static String enterLeftExpression(
            PlayPlusParser.LeftExpressionContext context,
            Application application,
            PrintWriter writer
    ) {
        return LeftExpression.enterLeftExpression(
                context.leftExpr(),
                application,
                writer
        );
    }

    /**
     * Enters in a left expression to write the NBC code of it.
     * @param context the left expression context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the left expression result.
     */
    public static String enterLeftExpression(PlayPlusParser.LeftExprContext context, Application application, PrintWriter writer) {
        if (context instanceof PlayPlusParser.LeftIdContext) {
            try {
                VariableBase variable = application.getVariable(((PlayPlusParser.LeftIdContext) context).ID().getText());
                return variable.getNameAndContext();
            } catch (PlayPlusException ex) {
                return ((PlayPlusParser.LeftIdContext) context).ID().getText();
            }
        } else if (context instanceof PlayPlusParser.LeftArrayContext) {
            VariableBase array = application.getArray(((PlayPlusParser.LeftArrayContext) context).ID().getText());

            String indexVariable = "--";
            String variableName = getLeftExpressionName();
            // We need to get the name of the right expression and execute the code of it
            for (PlayPlusParser.RightExprContext childRightExpression : ((PlayPlusParser.LeftArrayContext) context).rightExpr()) {
                indexVariable = RightExpression.enterRightExpression(childRightExpression, application, writer);
            }

            VariableWriter.writeTemporaryScalarDeclaration(writer, NBCCodeTypes.Int, variableName);

            VariableWriter.writeExtractFromArray(
                    writer,
                    variableName,
                    array.getNameAndContext(),
                    indexVariable);

            LeftExpression.leftExpressionId++;
            return variableName;
        }

        return "--";
    }
}
