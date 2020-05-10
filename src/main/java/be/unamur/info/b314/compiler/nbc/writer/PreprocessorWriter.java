package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class PreprocessorWriter {
    /**
     * Writes a preprocessor include.
     * @param writer the print writer of the NBC output.
     * @param include the name of the file to include.
     */
    public static void printPreprocessorInclude(PrintWriter writer, String include) {
        writer.printf("#include \"%s\"", include).println();
    }

    /**
     * Write a preprocessor define.
     * @param writer the print writer of the NBC output.
     * @param key the key of the define.
     * @param value the value of the define.
     */
    public static void printPreprocessorDefine(PrintWriter writer, String key, String value) {
        writer.printf("#define %s %s", key, value).println();
    }
}
