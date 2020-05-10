package be.unamur.info.b314.compiler.nbc.writer;

import tmp.LanguageParser;

import java.io.PrintWriter;
import java.util.List;

public class VariableWriter {
    /**
     * Writes a scalar declaration in the NBC code.
     * @param writer the print writer of the NBC output.
     * @param type the type of the scalar to declare.
     * @param name the name of the scalar to declare.
     */
    public static void writeScalarDeclaration(PrintWriter writer, NBCCodeTypes type, String name) {
        writer.format("  %s %s", name, type.getRepresentation()).println();
    }

    /**
     * Writes a scalar declaration in the NBC code.
     * @param writer the print writer of the NBC output.
     * @param type the type of the scalar to declare.
     * @param name the name of the scalar to declare.
     * @param value the value of the scalar to declare.
     */
    public static void writeScalarDeclaration(PrintWriter writer, NBCCodeTypes type, String name, String value) {
        writer.format("  %s %s %s", name, type.getRepresentation(), value).println();
    }

    /**
     * Writes a temporary (surround by segment start and end) scalar declaration in the NBC code.
     * @param writer the print writer of the NBC output.
     * @param type the type of the scalar to declare.
     * @param name the name of the scalar to declare.
     */
    public static void writeTemporaryScalarDeclaration(PrintWriter writer, NBCCodeTypes type, String name) {
        NBCWriter.writeSegmentStart(writer);
        writer.format("  %s %s", name, type.getRepresentation()).println();
        NBCWriter.writeSegmentEnd(writer);
    }

    /**
     * Writes a temporary (surround by segment start and end) scalar declaration in the NBC code.
     * @param writer the print writer of the NBC output.
     * @param type the type of the scalar to declare.
     * @param name the name of the scalar to declare.
     * @param value the value of the scalar to declare.
     */
    public static void writeTemporaryScalarDeclaration(PrintWriter writer, NBCCodeTypes type, String name, String value) {
        NBCWriter.writeSegmentStart(writer);
        writer.format("  %s %s %s", name, type.getRepresentation(), value).println();
        NBCWriter.writeSegmentEnd(writer);
    }

    /**
     * Writes an array declaration.
     * @param writer the print writer of the NBC output.
     * @param type the type of the element in the array.
     * @param name the name of the array.
     */
    public static void writeArrayDeclaration(PrintWriter writer, NBCCodeTypes type, String name) {
        writer.format("  %s %s[]", name, type.getRepresentation()).println();
    }

    /**
     * Writes a set of a variable
     * @param writer the print writer of the NBC output.
     * @param targetName the name of the variable to set.
     * @param value the value to set to the variable.
     */
    public static void writeVariableSet(PrintWriter writer, String targetName, String value) {
        writer.format("set %s, %s", targetName, value).println();
    }

    /**
     * Writes a move of a variable to another.
     * @param writer the print writer of the NBC output.
     * @param targetName the name of the variable to move into.
     * @param sourceName the name of the variable to move.
     */
    public static void writeVariableMove(PrintWriter writer, String targetName, String sourceName) {
        writer.format("mov %s, %s", targetName, sourceName).println();
    }

    /**
     * Writes an extract of a value from an array.
     * @param writer the print writer of the NBC output.
     * @param targetName the name of the variable to save the result.
     * @param arrayName the name of the array.
     * @param index the index in the array of the value to get.
     */
    public static void writeExtractFromArray(PrintWriter writer, String targetName, String arrayName, String index) {
        writer.format("index %s, %s, %s", targetName, arrayName, index).println();
    }

    /**
     * Writes a set of a value at a specific index from an array.
     * @param writer the print writer of the NBC output.
     * @param sourceName the name of the variable to save in the array.
     * @param arrayName the name of the array.
     * @param index the index in the array of the value to get.
     */
    public static void writeSetToArray(PrintWriter writer, String sourceName, String arrayName, String index) {
        writer.format("replace %s, %s, %s, %s", arrayName, arrayName, index, sourceName).println();
    }

    /**
     * Writes an initialisation of an array.
     * @param writer the print writer of the NBC output.
     * @param arrayName the name of the array.
     * @param variables the list of the variable name to set in the array.
     */
    public static void writeArrayBuild(PrintWriter writer, String arrayName, List<String> variables) {
        writer.format("arrbuild %s, %s", arrayName, String.join(", ", variables)).println();
    }
}
