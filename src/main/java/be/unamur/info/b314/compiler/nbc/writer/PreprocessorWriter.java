package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class PreprocessorWriter {
    public static void printPreprocessorInclude(PrintWriter writer, String include) {
        writer.printf("#include \"%s\"", include).println();
    }

    public static void printPreprocessorDefine(PrintWriter writer, String key, String value) {
        writer.printf("#define %s %s", key, value).println();
    }
}
