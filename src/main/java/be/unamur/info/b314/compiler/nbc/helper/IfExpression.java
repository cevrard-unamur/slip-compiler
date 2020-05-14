package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;

import java.io.PrintWriter;

public class IfExpression {
    /**
     * The if identifier for the temporary variable.
     */
    private static int ifId = 1;
    /**
     * The prefix name of the temporary variable
     */
    private static final String ifTemporaryVariable = "__ifVariable";

    /**
     * Gets the name of the jump name use for the if.
     * @return the name of the jump name use for the if.
     */
    private static String getJumpName() { return IfExpression.ifTemporaryVariable + IfExpression.ifId; }
    /**
     * Gets the name of the end jump name use for the if.
     * @return the name of the end jump name use for the if.
     */
    private static String getJumpNameEnd() { return IfExpression.ifTemporaryVariable + IfExpression.ifId + "End"; }

    /**
     * Enters in a if instruction context to write the NBC code of it.
     * @param context the if instruction context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     */
    public static void enterIfInstructionContext(PlayPlusParser.IfInstructionContext context, Application application, PrintWriter writer) {
        IfExpression.enterIfContext((PlayPlusParser.IfContext)context.ifBlock(), application, writer);
    }

    /**
     * Enters in a if context to write the NBC code of it.
     * @param context the if context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     */
    public static void enterIfContext(PlayPlusParser.IfContext context, Application application, PrintWriter writer) {
        String rightExpressionVariable = RightExpression.enterRightExpression(context.rightExpr(), application, writer);

        // Write the compare condition
        IfWriter.writeBreakIfCondition(
                writer,
                NBCOpCodeTypes.Equal,
                IfExpression.getJumpName(),
                rightExpressionVariable,
                NBCWriter.booleanTrueVariableName
        );
        // Else code of the condition
        if (context.ifElseBlock() != null) {
            for (PlayPlusParser.InstContext instruction : context.ifElseBlock().inst()) {
                DeclarationExpression.enterInstruction(instruction, application, writer);
            }
        }
        // Jump to the end label
        IfWriter.writeJump(
                writer,
                IfExpression.getJumpNameEnd()
        );
        // If code label
        NBCWriter.writeLabel(writer, IfExpression.getJumpName());
        // Then code of the condition
        if (context.ifThenBlock() != null) {
            for (PlayPlusParser.InstContext instruction : context.ifThenBlock().inst()) {
                DeclarationExpression.enterInstruction(instruction, application, writer);
            }
        }
        // End of the condition label
        NBCWriter.writeLabel(writer, IfExpression.getJumpNameEnd());

        IfExpression.ifId++;
    }
}
