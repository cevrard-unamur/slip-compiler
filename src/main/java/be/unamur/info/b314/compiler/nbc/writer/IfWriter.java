package be.unamur.info.b314.compiler.nbc.writer;

import be.unamur.info.b314.compiler.nbc.helper.IfExpression;

import java.io.PrintWriter;

public class IfWriter {
    public static void writeCompareCondition(PrintWriter writer,
                                             NBCOpCodeTypes type,
                                             String targetVariable,
                                             String leftValue,
                                             String rightValue) {
        writer.format("cmp %s, %s, %s, %s", type.getRepresentation(), targetVariable, leftValue, rightValue).println();
    }

    public static void writeMathCondition(PrintWriter writer,
                                          NBCIntCodeTypes type,
                                          String targetVariable,
                                          String leftValue,
                                          String rightValue){
        writer.format("%s, %s, %s, %s", type.getRepresentation(), targetVariable, leftValue, rightValue).println();
    }

    public static void writeNegCondition(PrintWriter writer,
                                         NBCIntCodeTypes type,
                                         String targetVariable,
                                         String rightValue){
        writer.format("%s, %s, %s", type.getRepresentation(), targetVariable, rightValue).println();
    }

    public static void writeBreakIfCondition(PrintWriter writer,
                                             NBCOpCodeTypes type,
                                             String label,
                                             String leftValue,
                                             String rightValue) {
        writer.format("brcmp %s, %s, %s, %s", type.getRepresentation(), label, leftValue, rightValue).println();
    }

    public static void writeJump(PrintWriter writer, String label) {
        writer.format("jump %s", label).println();
    }
}
