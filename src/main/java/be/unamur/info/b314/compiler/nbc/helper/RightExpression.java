package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;
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
            // We create a temporary variable with the value of the number
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarInitialisation(writer,
                    NBCCodeTypes.Int,
                    variableName,
                    ((PlayPlusParser.NumberContext) context).NUMBER().getText());
            rightExpressionId++;
            return variableName;
        } else if (context instanceof PlayPlusParser.CharContext) {
            // We create a temporary variable with the value of the char
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarInitialisation(writer,
                    NBCCodeTypes.Char,
                    variableName,
                    ((PlayPlusParser.CharContext) context).CHAR().getText());
            rightExpressionId++;
            return variableName;
        } else if (context instanceof PlayPlusParser.BooleanFalseContext) {
            // We create a temporary variable with the value of the boolean false
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarInitialisation(writer,
                    NBCCodeTypes.Char,
                    variableName,
                    NBCWriter.booleanFalse);
            rightExpressionId++;
            return variableName;
        } else if (context instanceof PlayPlusParser.BooleanTrueContext) {
            // We create a temporary variable with the value of the boolean false
            String variableName = RightExpression.getVariableName();
            VariableWriter.writeTemporaryScalarInitialisation(writer,
                    NBCCodeTypes.Char,
                    variableName,
                    NBCWriter.booleanTrue);
            rightExpressionId++;
            return variableName;
        } else if (context instanceof PlayPlusParser.IntegerExpressionContext) {
            // TODO Matthias
            return "";
        } else if (context instanceof PlayPlusParser.NegativeIntegerExpressionContext) {
            // TODO Matthias
            return "";
        } else if (context instanceof PlayPlusParser.ParenthesesExpressionContext) {
            return RightExpression.enterRightExpression(
                    ((PlayPlusParser.ParenthesesExpressionContext) context).rightExpr(),
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.CompExpressionContext) {
            return ComparisonExpression.enterComp(
                    (PlayPlusParser.CompExpressionContext)context,
                    application,
                    writer
            );
        } else if (context instanceof PlayPlusParser.BoolExpressionContext) {
            // TODO
            return "";
        } else if (context instanceof PlayPlusParser.NotExpressionContext) {
            // TODO
            return "";
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
