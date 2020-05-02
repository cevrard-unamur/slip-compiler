package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;

import java.io.PrintWriter;

public class IfExpression {
    private static int conditionId = 1;
    private static final String conditionTemporaryVariable = "__compVariable";

    public static void enterIfInstructionContext(PlayPlusParser.IfInstructionContext context, Application application, PrintWriter writer) {
        IfExpression.enterIfContext((PlayPlusParser.IfContext)context.ifBlock(), application, writer);
    }

    public static void enterIfContext(PlayPlusParser.IfContext context, Application application, PrintWriter writer) {
        if (context.rightExpr() instanceof PlayPlusParser.CompExpressionContext) {
            IfExpression.enterCompExpressionContext((PlayPlusParser.CompExpressionContext)context.rightExpr(), application, writer);
        } else if (context.rightExpr() instanceof PlayPlusParser.FunctionCallExpressionContext) {
            IfExpression.enterFunctionCallExpressionContext(
                    (PlayPlusParser.FunctionCallExpressionContext)context.rightExpr(),
                    application,
                    writer);
        }

        conditionId++;
    }

    private  static void enterFunctionCallExpressionContext(PlayPlusParser.FunctionCallExpressionContext context, Application application, PrintWriter writer) {
        String functionName = FunctionExpression.enterFunctionCall(
                context.functionCall(),
                application,
                writer);

        IfWriter.writeIfCondition(writer,
                NBCOpCodeTypes.Equal,
                IfExpression.getJumpName(),
                functionName,
                "1");

        // TODO Write Else code
        IfWriter.writeJump(writer, IfExpression.getJumpNameEnd());
        NBCWriter.writeLabel(writer, IfExpression.getJumpName());
        // TODO Write Then code
        NBCWriter.writeLabel(writer, IfExpression.getJumpNameEnd());
    }

    private static void enterCompExpressionContext(PlayPlusParser.CompExpressionContext context, Application application, PrintWriter writer) {
        // We retrieve the operator of comparison
        String comparisonOperator = context.getChild(1).getText();
        String leftValue = RightExpression.enterRightExpression(context.rightExpr(0), application, writer);
        String rightValue = RightExpression.enterRightExpression(context.rightExpr(1), application, writer);

        IfWriter.writeIfCondition(writer,
                ComparisonHelper.comparisonToNbcOpCodeType(comparisonOperator),
                IfExpression.getJumpName(),
                leftValue,
                rightValue);

        // TODO Write Else code
        IfWriter.writeJump(writer, IfExpression.getJumpNameEnd());
        NBCWriter.writeLabel(writer, IfExpression.getJumpName());
        // TODO Write Then code
        NBCWriter.writeLabel(writer, IfExpression.getJumpNameEnd());
    }

    private static String getJumpName() { return IfExpression.conditionTemporaryVariable + IfExpression.conditionId; }
    private static String getJumpNameEnd() { return IfExpression.conditionTemporaryVariable + IfExpression.conditionId + "End"; }
}
