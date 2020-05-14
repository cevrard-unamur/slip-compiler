package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.PrintWriter;

public class RightExpression {
    /**
     * The right expression identifier for the temporary variable.
     */
    private static int rightExpressionId = 1;
    /**
     * The prefix name of the temporary variable
     */
    private static final String temporaryVariableName = "__rightExpressionVar";

    /**
     * Gets the name of the temporary variable use for the right expression.
     * @return the name of the temporary variable use for the right expression.
     */
    private static String getVariableName() {
        return temporaryVariableName + rightExpressionId;
    }

    /**
     * Enters in a right expression to generate the NBC code of it.
     * @param context the right expression context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     * @return the name of the temporary variable generated for the right expression result.
     */
    public static String enterRightExpression(PlayPlusParser.RightExprContext context, Application application, PrintWriter writer) {
        if (context instanceof PlayPlusParser.NumberContext) {
            // We create a temporary variable with the value of the number
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarDeclaration(writer,
                    NBCCodeTypes.Int,
                    variableName,
                    ((PlayPlusParser.NumberContext) context).NUMBER().getText());
            rightExpressionId++;
            return variableName;
        } else if (context instanceof PlayPlusParser.CharContext) {
            // We create a temporary variable with the value of the char
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarDeclaration(writer,
                    NBCCodeTypes.Char,
                    variableName,
                    ((PlayPlusParser.CharContext) context).CHAR().getText());
            rightExpressionId++;
            return variableName;
        } else if (context instanceof PlayPlusParser.BooleanFalseContext) {
            // We create a temporary variable with the value of the boolean false
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarDeclaration(writer,
                    NBCCodeTypes.Char,
                    variableName,
                    NBCWriter.booleanFalse);
            rightExpressionId++;
            return variableName;
        } else if (context instanceof PlayPlusParser.BooleanTrueContext) {
            // We create a temporary variable with the value of the boolean false
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarDeclaration(writer,
                    NBCCodeTypes.Char,
                    variableName,
                    NBCWriter.booleanTrue);
            rightExpressionId++;
            return variableName;
        } else if (context instanceof PlayPlusParser.IntegerExpressionContext) {
            return IntegerExpression.enterIntegerExpression(
                    (PlayPlusParser.IntegerExpressionContext) context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.NegativeIntegerExpressionContext) {
            return IntegerExpression.enterNegativeIntegerExpression(
                    (PlayPlusParser.NegativeIntegerExpressionContext) context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.ParenthesesExpressionContext) {
            return RightExpression.enterRightExpression(
                    ((PlayPlusParser.ParenthesesExpressionContext) context).rightExpr(),
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.CompExpressionContext) {
            return ComparisonExpression.enterCompExpression(
                    (PlayPlusParser.CompExpressionContext)context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.BoolExpressionContext) {
            return ComparisonExpression.enterBoolean(
                    (PlayPlusParser.BoolExpressionContext)context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.NotExpressionContext) {
            return ComparisonExpression.enterNot(
                    (PlayPlusParser.NotExpressionContext)context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.FunctionCallExpressionContext) {
            // We call the function and return the name of it
            return FunctionExpression.enterFunctionCall(
                    ((PlayPlusParser.FunctionCallExpressionContext) context).functionCall(),
                    application,
                    writer);
        } else if (context instanceof PlayPlusParser.LeftExpressionContext) {
            return LeftExpression.enterLeftExpression((PlayPlusParser.LeftExpressionContext)context, application, writer);
        } else {
            throw new PlayPlusException("Not implemented");
        }
    }
}
