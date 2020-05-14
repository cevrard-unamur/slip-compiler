package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class FunctionWriter {
    /**
     * Writes the function call in NBC
     * @param writer the print writer of the NBC output.
     * @param functionName the name of the function to call.
     */
    public static void writeFunctionCall(PrintWriter writer, String functionName) {
        writer.format("call %s", functionName).println();
    }

    /**
     * Writes the main thread start in NBC.
     * @param writer the print writer of the NBC output.
     */
    public static void writeMainThreadStart(PrintWriter writer) {
        writer.println("thread main");
    }

    /**
     * Writes the main thread end in NBC.
     * @param writer the print writer of the NBC output.
     */
    public static void writeMainThreadEnd(PrintWriter writer) {
        writer.format("endt").println();
        writer.println();
    }

    /**
     * Writes the function subroutine start in NBC.
     * @param writer the print writer of the NBC output.
     * @param name the name of the function.
     */
    public static void writeFunctionSubroutinesStart(PrintWriter writer, String name) {
        writer.format("subroutine %s", name).println();
    }

    /**
     * Writes the function subroutine end in NBC.
     * @param writer the print writer of the NBC output.
     */
    public static void writeFunctionSubroutinesEnd(PrintWriter writer) {
        writer.format("  return").println();
        writer.format("ends").println();
        writer.println();
    }
}
