package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class OperatorWriter {
    public static void writeAddition(PrintWriter writer, String target, String leftValue, String rightValue) {
        writer.format("add %s, %s, %s", target, leftValue, rightValue).println();
    }
}
