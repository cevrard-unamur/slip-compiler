package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class VariableWriter {
    public static void printScalarInitialisation(PrintWriter writer, NBCCodeTypes type, String name) {
        writer.format("%s %s", name, type.getRepresentation()).println();
    }

    public static void printArrayInitialisation(PrintWriter writer, NBCCodeTypes type, String name) {
        writer.format("%s %s[]", name, type.getRepresentation()).println();
    }

    public static void printVariableSet(PrintWriter writer, String targetName, Integer value) {
        writer.format("set %s, %s", targetName, value.toString()).println();
    }

    public static void printVariableMove(PrintWriter writer, String targetName, String sourceName) {
        writer.format("mov %s, %s", targetName, sourceName).println();
    }
}
