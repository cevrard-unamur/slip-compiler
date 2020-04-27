package be.unamur.info.b314.compiler.nbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class NBCPrinter {
    private final PrintWriter writer;

    public NBCPrinter(File file) throws FileNotFoundException {
        this.writer = new PrintWriter(file);
    }

    public NBCPrinter(String filename) throws  FileNotFoundException {
        this.writer = new PrintWriter(filename);
    }

    public NBCPrinter(OutputStream stream) {
        this.writer = new PrintWriter(stream);
    }

    public void flush() {
        this.writer.flush();
    }

    public void close() {
        this.writer.flush();
        this.writer.close();
    }
}
