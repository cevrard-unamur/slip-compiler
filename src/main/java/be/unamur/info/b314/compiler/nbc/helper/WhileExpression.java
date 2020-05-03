package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;

import java.io.PrintWriter;

public class WhileExpression {
    private static int whileId = 1;
    private static final String whileTemporaryVariable = "__whileVariable";

    private static String getJumpName() { return WhileExpression.whileTemporaryVariable + WhileExpression.whileId; }
    private static String getJumpNameEnd() { return WhileExpression.whileTemporaryVariable + WhileExpression.whileId + "End"; }

    public static void enterWhileInstruction(PlayPlusParser.WhileInstructionContext context, Application application, PrintWriter writer) {
        WhileExpression.enterWhile((PlayPlusParser.WhileContext)context.whileBlock(), application, writer);
    }

    public static void enterWhile(PlayPlusParser.WhileContext context, Application application, PrintWriter writer) {
        // Handle the right expression
        String rightExpressionVariable = RightExpression.enterRightExpression(context.rightExpr(), application, writer);

        // Write the label to restart the loop
        NBCWriter.writeLabel(writer, WhileExpression.getJumpName());

        // Write the compare condition, if the condition is false, we jump to the end
        IfWriter.writeBreakIfCondition(
                writer,
                NBCOpCodeTypes.NotEqual,
                WhileExpression.getJumpNameEnd(),
                rightExpressionVariable,
                NBCWriter.booleanTrueVariableName
        );

        // Content of the loop
        for (PlayPlusParser.InstContext instruction : context.inst()) {
            DeclarationExpression.enterInstruction(instruction, application, writer);
        }

        // Jump to the beginning of the loop
        IfWriter.writeJump(writer, WhileExpression.getJumpName());

        // End of the condition label
        NBCWriter.writeLabel(writer, WhileExpression.getJumpNameEnd());
        WhileExpression.whileId++;
    }
}
