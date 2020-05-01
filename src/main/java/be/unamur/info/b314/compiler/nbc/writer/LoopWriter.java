package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class LoopWriter {
    public static void writeStartLoop(PrintWriter writer, String label, String startValue) {
        NBCWriter.writeSegmentStart(writer);
        VariableWriter.writeScalarInitialisation(writer, NBCCodeTypes.Int, getIncVariableName(label), startValue);
        NBCWriter.writeSegmentEnd(writer);
        writer.format("%s:", label).println();
    }

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

    private static String getIncVariableName(String label) {
        return label + "Inc";
    }
}
