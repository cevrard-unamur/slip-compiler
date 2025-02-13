package be.unamur.info.b314.compiler.nbc;

import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCWriter;
import be.unamur.info.b314.compiler.nbc.writer.PreprocessorWriter;
import be.unamur.info.b314.compiler.nbc.writer.VariableWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class NBCPrinter {
    /**
     * The print writer to print the NBC code.
     */
    private final PrintWriter writer;

    /**
     * Gets the writer.
     * @return
     */
    public PrintWriter getWriter() { return writer; }

    /**
     * Initializes a new instance of a NBCPrinter
     * @param file the file in which we write the NBC code.
     * @throws FileNotFoundException if the file does not exist.
     */
    public NBCPrinter(File file) throws FileNotFoundException {
        this.writer = new PrintWriter(file);
        writeFileHeader();
    }

    /**
     * Initializes a new instance of a NBCPrinter
     * @param filename the name of the file in which we write the NBC code.
     * @throws FileNotFoundException if the file does not exist.
     */
    public NBCPrinter(String filename) throws  FileNotFoundException {
        this.writer = new PrintWriter(filename);
        writeFileHeader();
    }

    /**
     * Initializes a new instance of a NBCPrinter
     * @param stream the stream in which we write the NBC code.
     * @throws FileNotFoundException if the file does not exist.
     */
    public NBCPrinter(OutputStream stream) {
        this.writer = new PrintWriter(stream);
        writeFileHeader();
    }

    /**
     * Flushes the print writer.
     */
    public void flush() {
        this.writer.flush();
    }

    /**
     * Closes the print writer.
     */
    public void close() {
        this.writer.flush();
        this.writer.close();
    }

    /**
     * Write the NBC code header.
     */
    private void writeFileHeader() {
        NBCWriter.writeComment(writer, "NBC Program generated by G19");
        PreprocessorWriter.printPreprocessorInclude(writer, "NXTDefs.h");
        PreprocessorWriter.printPreprocessorDefine(writer, "ROT_DEG", "410");
        PreprocessorWriter.printPreprocessorDefine(writer, "FWD_DEG", "1000");
        PreprocessorWriter.printPreprocessorDefine(writer, "SPEED", "80");
        PreprocessorWriter.printPreprocessorDefine(writer, "WAIT", "200");
        PreprocessorWriter.printPreprocessorDefine(writer, "NEAR", "30");

        VariableWriter.writeTemporaryScalarDeclaration(writer, NBCCodeTypes.Int, NBCWriter.incVariableName, "1");
        VariableWriter.writeTemporaryScalarDeclaration(writer, NBCCodeTypes.Int, NBCWriter.zeroVariableName, "0");
        VariableWriter.writeTemporaryScalarDeclaration(writer,
                NBCCodeTypes.Int,
                NBCWriter.booleanTrueVariableName,
                NBCWriter.booleanTrue);
        VariableWriter.writeTemporaryScalarDeclaration(writer,
                NBCCodeTypes.Int,
                NBCWriter.booleanFalseVariableName,
                NBCWriter.booleanFalse);
    }

    /**
     * Print the structure segment start.
     * @param name the name of the structure.
     */
    public void printStructureSegmentStart(String name) { this.writer.format("%s struct", name).println(); }

    /**
     * Print the structure segment end.
     * @param name the name of the structure.
     */
    public void printStructureSegmentEnd(String name) { this.writer.format("%s ends", name).println(); }
}
