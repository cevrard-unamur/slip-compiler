package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.application.VariableBase;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintWriter;

public class If {
    private static int conditionId = 1;

    public static void enterIfInstructionContext(PlayPlusParser.IfInstructionContext context, Application application, PrintWriter writer) {
        If.enterIfContext((PlayPlusParser.IfContext)context.ifBlock(), application, writer);
    }

    public static void enterIfContext(PlayPlusParser.IfContext context, Application application, PrintWriter writer) {
        String comparisonOperator = context.rightExpr().getChild(1).getText();
        String leftValue = If.getRightExpressionId(((PlayPlusParser.CompExpressionContext)context.rightExpr()).rightExpr(0), writer);
        String rightValue = If.getRightExpressionId(((PlayPlusParser.CompExpressionContext)context.rightExpr()).rightExpr(1), writer);

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

        conditionId++;
    }

    private static String getRightExpressionId(PlayPlusParser.RightExprContext context, PrintWriter writer) {
        if (context instanceof PlayPlusParser.FunctionCallExpressionContext) {
            return If.getFunctionCallId((PlayPlusParser.FunctionCallContext)context.getChild(0));
        } else if (context instanceof PlayPlusParser.CharContext) {
            String conditionalVariableName = "compTemporaryVariableIf" + conditionId;
            NBCWriter.writeSegmentStart(writer);
            VariableWriter.writeScalarInitialisation(writer,
                    NBCCodeTypes.Char,
                    conditionalVariableName,
                    ((PlayPlusParser.CharContext) context).CHAR().getText());
            NBCWriter.writeSegmentEnd(writer);

            return conditionalVariableName;
        }

        return "";
    }

    private static String getFunctionCallId(PlayPlusParser.FunctionCallContext context) {
        return context.ID().getText();
    }
}
