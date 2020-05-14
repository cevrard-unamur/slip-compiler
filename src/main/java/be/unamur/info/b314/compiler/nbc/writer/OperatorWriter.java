package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class OperatorWriter {
    /**
     * Writes the addition of two variables in the NBC code.
     * @param writer the print writer of the NBC output.
     * @param target the variable name to save the result.
     * @param leftValue the left value of the addition.
     * @param rightValue the right value of the addition.
     */
    public static void writeAddition(PrintWriter writer, String target, String leftValue, String rightValue) {
        writer.format("add %s, %s, %s", target, leftValue, rightValue).println();
    }

    /**
     * Writes a mathematical operation of two variables in the NBC code.
     * @param writer the print writer of the NBC output.
     * @param type the type of the integer operation.
     * @param targetVariable the variable name to save the result.
     * @param leftValue the left value of the mathematical operation.
     * @param rightValue the right value of the mathematical operation.
     */
    public static void writeMathCondition(PrintWriter writer,
                                          NBCIntCodeTypes type,
                                          String targetVariable,
                                          String leftValue,
                                          String rightValue){
        writer.format("%s %s, %s, %s", type.getRepresentation(), targetVariable, leftValue, rightValue).println();
    }

    /**
     * Writes a negation operation in the NBc code.
     * @param writer the print writer of the NBC output.
     * @param targetVariable the variable name to save the result.
     * @param rightValue the value for the negative operation
     */
    public static void writeNegCondition(PrintWriter writer,
                                         String targetVariable,
                                         String rightValue){
        writer.format("neg %s, %s", targetVariable, rightValue).println();
    }
}
