package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class OperatorWriter {
    public static void writeAddition(PrintWriter writer, String target, String leftValue, String rightValue) {
        writer.format("add %s, %s, %s", target, leftValue, rightValue).println();
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
}
