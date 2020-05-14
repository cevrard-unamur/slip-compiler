package be.unamur.info.b314.compiler.nbc.writer;

import be.unamur.info.b314.compiler.nbc.helper.IfExpression;

import java.io.PrintWriter;

public class IfWriter {
    /**
     * Writes the compare condition in NBC.
     * @param writer the print writer of the NBC output.
     * @param type the type of the comparison.
     * @param targetVariable the variable name to save the result.
     * @param leftValue the left value to compare.
     * @param rightValue the right value to compare.
     */
    public static void writeCompareCondition(PrintWriter writer,
                                             NBCOpCodeTypes type,
                                             String targetVariable,
                                             String leftValue,
                                             String rightValue) {
        writer.format("cmp %s, %s, %s, %s", type.getRepresentation(), targetVariable, leftValue, rightValue).println();
    }

    /**
     * Writes a break if condition in NBC.
     * @param writer the print writer of the NBC output.
     * @param type the type of the comparison.
     * @param label the label to go of the comparison is true.
     * @param leftValue the left value to compare.
     * @param rightValue the right value to compare.
     */
    public static void writeBreakIfCondition(PrintWriter writer,
                                             NBCOpCodeTypes type,
                                             String label,
                                             String leftValue,
                                             String rightValue) {
        writer.format("brcmp %s, %s, %s, %s", type.getRepresentation(), label, leftValue, rightValue).println();
    }

    /**
     * Write a jump in NBC.
     * @param writer the print writer of the NBC output.
     * @param label the label to jump.
     */
    public static void writeJump(PrintWriter writer, String label) {
        writer.format("jump %s", label).println();
    }
}
