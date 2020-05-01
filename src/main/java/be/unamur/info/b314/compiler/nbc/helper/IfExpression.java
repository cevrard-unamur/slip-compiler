package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;

import java.io.PrintWriter;

public class IfExpression {
    private static int conditionId = 1;

    public static void enterIfInstructionContext(PlayPlusParser.IfInstructionContext context, Application application, PrintWriter writer) {
        IfExpression.enterIfContext((PlayPlusParser.IfContext)context.ifBlock(), application, writer);
    }

    public static void enterIfContext(PlayPlusParser.IfContext context, Application application, PrintWriter writer) {
        if (context.rightExpr() instanceof PlayPlusParser.CompExpressionContext) {
            IfExpression.enterCompExpressionContext((PlayPlusParser.CompExpressionContext)context.rightExpr(), application, writer);
        }

        conditionId++;
    }

    private static void enterCompExpressionContext(PlayPlusParser.CompExpressionContext context, Application application, PrintWriter writer) {
        String comparisonOperator = "=";
        String leftValue = "";
        String rightValue = "";

        String jumpName = "compVariable" + conditionId;
        String jumpNameEnd = "compVariable" + conditionId + "End";

        IfWriter.writeIfCondition(writer,
                ComparisonHelper.comparisonToNbcOpCodeType(comparisonOperator),
                jumpName,
                leftValue,
                rightValue);

        // TODO Refactor
        // TODO Write Else code
        writer.format("jump %s", jumpNameEnd).println();
        writer.format("%s:", jumpName).println();
        // TODO Write Then code
        writer.format("%s:", jumpNameEnd).println();
    }
}
