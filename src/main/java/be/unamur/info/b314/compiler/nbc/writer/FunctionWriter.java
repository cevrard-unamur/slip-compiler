package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class FunctionWriter {
    public static void writeFunctionCall(PrintWriter writer, String functionName) {
        writer.format("call %s", functionName).println();
    }

    public static void writeMainThreadStart(PrintWriter writer) {
        writer.println("thread main");
    }

    public static void writeMainThreadEnd(PrintWriter writer) {
        writer.format("endt").println();
        writer.println();
    }

    public static void writeFunctionSubroutinesStart(PrintWriter writer, String name) {
        writer.format("subroutine %s", name).println();
    }

    public static void writeFunctionSubroutinesEnd(PrintWriter writer) {
        writer.format("  return").println();
        writer.format("ends").println();
        writer.println();
    }
}
