package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class LoopWriter {
    /**
     * Writes the start of a loop in NBC.
     * @param writer the print writer of the NBC output.
     * @param label the label of the loop.
     * @param startValue the start value of the loop.
     */
    public static void writeStartLoop(PrintWriter writer, String label, String startValue) {
        NBCWriter.writeSegmentStart(writer);
        VariableWriter.writeScalarDeclaration(writer, NBCCodeTypes.Int, getIncVariableName(label), startValue);
        NBCWriter.writeSegmentEnd(writer);
        writer.format("%s:", label).println();
    }

    /**
     * Writes the end of a loop in NBC.
     * @param writer the print writer of the NBC output.
     * @param label the label of the loop.
     * @param limit the limit of the loop.
     */
    public static void writeEndLoop(PrintWriter writer, String label, String limit) {
        // We increment the value of the loop
        OperatorWriter.writeAddition(writer,
                getIncVariableName(label),
                getIncVariableName(label),
                NBCWriter.incVariableName);
        // We jump at the beginning of the loop if the limit is not reach
        writer.format("brcmp %s, %s, %s, %s", NBCOpCodeTypes.NotEqual.getRepresentation(), label, getIncVariableName(label), limit)
                .println();
    }

    /**
     * Gets the increment variable name.
     * @param label the label of the loop.
     * @return the increment variable name.
     */
    private static String getIncVariableName(String label) {
        return label + "Inc";
    }
}
