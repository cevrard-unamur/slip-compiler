package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;

import java.io.PrintWriter;

public class WhileExpression {
    /**
     * The while identifier for the temporary variable.
     */
    private static int whileId = 1;
    /**
     * The prefix name of the temporary variable
     */
    private static final String whileTemporaryVariable = "__whileVariable";

    /**
     * Gets the name of the jump name use for the while.
     * @return the name of the jump name use for the while.
     */
    private static String getJumpName() { return WhileExpression.whileTemporaryVariable + WhileExpression.whileId; }
    /**
     * Gets the name of the end jump name use for the while.
     * @return the name of the end jump name use for the while.
     */
    private static String getJumpNameEnd() { return WhileExpression.whileTemporaryVariable + WhileExpression.whileId + "End"; }

    /**
     * Enters in a while instruction to generate the NBC code of it.
     * @param context the while instruction context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     */
    public static void enterWhileInstruction(PlayPlusParser.WhileInstructionContext context, Application application, PrintWriter writer) {
        WhileExpression.enterWhile((PlayPlusParser.WhileContext)context.whileBlock(), application, writer);
    }

    /**
     * Enters in a while to generate the NBC code of it.
     * @param context the while context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     */
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
