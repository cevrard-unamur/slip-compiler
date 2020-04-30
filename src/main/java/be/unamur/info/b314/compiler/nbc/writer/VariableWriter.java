package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class VariableWriter {
    public static void writeScalarInitialisation(PrintWriter writer, NBCCodeTypes type, String name) {
        writer.format("  %s %s", name, type.getRepresentation()).println();
    }

    public static void writeScalarInitialisation(PrintWriter writer, NBCCodeTypes type, String name, String value) {
        writer.format("  %s %s %s", name, type.getRepresentation(), value).println();
    }

    public static void writeArrayInitialisation(PrintWriter writer, NBCCodeTypes type, String name) {
        writer.format("  %s %s[]", name, type.getRepresentation()).println();
    }

    public static void writeVariableSet(PrintWriter writer, String targetName, String value) {
        writer.format("set %s, %s", targetName, value.toString()).println();
    }

    public static void writeVariableMove(PrintWriter writer, String targetName, String sourceName) {
        writer.format("mov %s, %s", targetName, sourceName).println();
    }
}
