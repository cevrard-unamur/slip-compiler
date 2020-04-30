package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class NBCWriter {
    public static void writeComment(PrintWriter writer, String comment) {
        writer.printf("; %s", comment).println();
    }

    public static void writePlaySound(PrintWriter writer) {
        NBCWriter.writeComment(writer, "Playing sound");
        NBCWriter.writeWaitBeforePlayingSound(writer);
        writer.println("  set PT_A.freq, 440");
        writer.println("  set PT_A.time, 1000");
        writer.println("  set PT_A.loop, 0");
        writer.println("  set PT_A.vol, 3");
        writer.println("  syscall SoundPlayTone, PT_A");
    }

    public static void writeWaitBeforePlayingSound(PrintWriter writer) {
        writer.println("stillplaying:");
        writer.println("  syscall SoundGetState, SGS");
        writer.println("  brtst NEQ, stillplaying, SGS.flags");
    }

    public static void writeSegmentStart(PrintWriter writer) {
        writer.println("dseg segment");
    }

    public static void writeSegmentEnd(PrintWriter writer) {
        writer.println("dseg ends");
    }
}
