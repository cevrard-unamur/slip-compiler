package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.nbc.writer.IfWriter;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;

import java.io.PrintWriter;

public class RepeatExpression {
    /**
     * The repeat identifier for the temporary variable.
     */
    private static int repeatId = 1;
    /**
     * The prefix name of the temporary variable
     */
    private static final String repeatTemporaryVariable = "__repeatVariable";

    /**
     * Gets the name of the jump name use for the repeat.
     * @return the name of the jump name use for the repeat.
     */
    private static String getJumpName() { return RepeatExpression.repeatTemporaryVariable + RepeatExpression.repeatId; }

    /**
     * Enters in a repeat instruction to generate the NBC code of it.
     * @param context the repeat instruction context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     */
    public static void enterRepeatInstruction(PlayPlusParser.RepeatInstructionContext context, Application application, PrintWriter writer) {
        RepeatExpression.enterRepeat((PlayPlusParser.RepeatContext)context.repeatBlock(), application, writer);
    }

    /**
     * Enters in a repeat to generate the NBC code of it.
     * @param context the repeat context.
     * @param application the application.
     * @param writer the print writer of the NBC output.
     */
    public static void enterRepeat(PlayPlusParser.RepeatContext context, Application application, PrintWriter writer) {
        // Handle the right expression
        String rightExpressionVariable = RightExpression.enterRightExpression(context.rightExpr(), application, writer);

        // Write the label to restart the loop
        NBCWriter.writeLabel(writer, RepeatExpression.getJumpName());

        // Content of the loop
        for (PlayPlusParser.InstContext instruction : context.inst()) {
            DeclarationExpression.enterInstruction(instruction, application, writer);
        }

        // Write the compare condition, if the condition is true, jump to the beginning
        IfWriter.writeBreakIfCondition(
                writer,
                NBCOpCodeTypes.Equal,
                RepeatExpression.getJumpName(),
                rightExpressionVariable,
                NBCWriter.booleanTrueVariableName
        );

        RepeatExpression.repeatId++;
    }
}
