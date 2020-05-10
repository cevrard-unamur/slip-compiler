package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class LogicWriter {
    /**
     * Write a logic AND operator in NBC.
     * @param writer the print writer of the NBC output.
     * @param target the variable name to save the result.
     * @param leftValue the left value of the AND.
     * @param rightValue te right value of the AND.
     */
    public static void writeAnd(PrintWriter writer, String target, String leftValue, String rightValue) {
        writer.format("and %s, %s, %s", target, leftValue, rightValue).println();
    }

    /**
     * Write a logic OR operator in NBC.
     * @param writer the print writer of the NBC output.
     * @param target the variable name to save the result.
     * @param leftValue the left value of the OR.
     * @param rightValue te right value of the OR.
     */
    public static void writeOr(PrintWriter writer, String target, String leftValue, String rightValue) {
        writer.format("or %s, %s, %s", target, leftValue, rightValue).println();
    }

    /**
     * Write a logic NOT operator in NBC.
     * @param writer the print writer of the NBC output.
     * @param target the variable name to save the result.
     * @param value the value of the NOT.
     */
    public static void writeNot(PrintWriter writer, String target, String value) {
        writer.format("not %s, %s", target, value).println();
    }
}
