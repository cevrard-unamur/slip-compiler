package be.unamur.info.b314.compiler.nbc;

import be.unamur.info.b314.compiler.nbc.writer.PreprocessorWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class NBCPrinter {
    private final PrintWriter writer;

    public PrintWriter getWriter() { return writer; }

    public NBCPrinter(File file) throws FileNotFoundException {
        this.writer = new PrintWriter(file);
        writeFileHeader();
    }

    public NBCPrinter(String filename) throws  FileNotFoundException {
        this.writer = new PrintWriter(filename);
        writeFileHeader();
    }

    public NBCPrinter(OutputStream stream) {
        this.writer = new PrintWriter(stream);
        writeFileHeader();
    }

    public void flush() {
        this.writer.flush();
    }

    public void close() {
        this.writer.flush();
        this.writer.close();
    }

    private void writeFileHeader() {
        this.printComment("NBC Program generated by G19");
        PreprocessorWriter.printPreprocessorInclude(writer, "NXTDefs.h");
        PreprocessorWriter.printPreprocessorDefine(writer, "ROT_DEG", "410");
        PreprocessorWriter.printPreprocessorDefine(writer, "FWD_DEG", "1000");
        PreprocessorWriter.printPreprocessorDefine(writer, "SPEED", "80");
        PreprocessorWriter.printPreprocessorDefine(writer, "WAIT", "200");
        PreprocessorWriter.printPreprocessorDefine(writer, "NEAR", "30");
        this.printEmptyLine();
    }

    private void printEmptyLine() {
        this.writer.println();
    }

    private void printComment(String comment) {
        this.writer.printf("// %s", comment).println();
    }
}
