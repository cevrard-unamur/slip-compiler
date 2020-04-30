package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class ActionWriter {
    /**
     * We play a sound three times when the robot is digging
     * @param writer the writer for the NBC code
     */
    public static void writeDig(PrintWriter writer) {
        NBCWriter.writePlaySound(writer);
        NBCWriter.writePlaySound(writer);
        NBCWriter.writePlaySound(writer);
    }

    /**
     * We play a sound two times when the robot is jumping
     * @param writer the writer for the NBC code
     */
    public static void writeJump(PrintWriter writer) {
        NBCWriter.writePlaySound(writer);
    }

    /**
     * We play a sound one time when the robot is fighting
     * @param writer the writer for the NBC code
     */
    public static void writeFight(PrintWriter writer) {
        NBCWriter.writePlaySound(writer);
    }
}
