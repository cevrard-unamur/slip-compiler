package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class FunctionWriter {
    public static void writeFunctionCall(PrintWriter writer, String functionName) {
        writer.format("call %s", functionName).println();
    }
}
