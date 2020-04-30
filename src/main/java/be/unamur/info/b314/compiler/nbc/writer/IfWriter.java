package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class IfWriter {
    public static void writeIfCondition(PrintWriter writer,
                                        NBCOpCodeTypes type,
                                        String name,
                                        String leftValue,
                                        String rightValue) {
        writer.format("brcmp %s, %s, %s, %s", type.getRepresentation(), name, leftValue, rightValue).println();
    }


}
