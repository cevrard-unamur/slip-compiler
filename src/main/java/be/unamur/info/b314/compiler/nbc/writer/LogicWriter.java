package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class LogicWriter {
    public static void writeAnd(PrintWriter writer, String target, String leftValue, String rightValue) {
        writer.format("and %s, %s, %s", target, leftValue, rightValue).println();
    }

    public static void writeOr(PrintWriter writer, String target, String leftValue, String rightValue) {
        writer.format("or %s, %s, %s", target, leftValue, rightValue).println();
    }

    public static void writeNot(PrintWriter writer, String target, String value) {
        writer.format("not %s, %s", target, value).println();
    }
}
