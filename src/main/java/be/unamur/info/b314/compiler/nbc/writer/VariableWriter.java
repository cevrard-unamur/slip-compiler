package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class VariableWriter {
    public static void writeScalarInitialisation(PrintWriter writer, NBCCodeTypes type, String name) {
        writer.format("  %s %s", name, type.getRepresentation()).println();
    }

    public static void writeTemporaryScalarInitialisation(PrintWriter writer, NBCCodeTypes type, String name) {
        NBCWriter.writeSegmentStart(writer);
        writer.format("  %s %s", name, type.getRepresentation()).println();
        NBCWriter.writeSegmentEnd(writer);
    }

    public static void writeScalarInitialisation(PrintWriter writer, NBCCodeTypes type, String name, String value) {
        writer.format("  %s %s %s", name, type.getRepresentation(), value).println();
    }

    public static void writeTemporaryScalarInitialisation(PrintWriter writer, NBCCodeTypes type, String name, String value) {
        NBCWriter.writeSegmentStart(writer);
        writer.format("  %s %s %s", name, type.getRepresentation(), value).println();
        NBCWriter.writeSegmentEnd(writer);
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

    public static void writeExtractFromArray(PrintWriter writer, String targetName, String arrayName, String index) {
        writer.format("index %s, %s, %s", targetName, arrayName, index).println();
    }

    public static void writeSetToArray(PrintWriter writer, String sourceName, String arrayName, String index) {
        writer.format("replace %s, %s, %s, %s", arrayName, arrayName, index, sourceName).println();
    }
}
