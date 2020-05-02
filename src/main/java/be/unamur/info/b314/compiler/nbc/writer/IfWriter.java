package be.unamur.info.b314.compiler.nbc.writer;

import be.unamur.info.b314.compiler.nbc.helper.IfExpression;

import java.io.PrintWriter;

public class IfWriter {
    public static void writeIfCondition(PrintWriter writer,
                                        NBCOpCodeTypes type,
                                        String name,
                                        String leftValue,
                                        String rightValue) {
        writer.format("brcmp %s, %s, %s, %s", type.getRepresentation(), name, leftValue, rightValue).println();
    }

    public static void writeJump(PrintWriter writer, String label) {
        writer.format("jump %s", label).println();
    }
}
