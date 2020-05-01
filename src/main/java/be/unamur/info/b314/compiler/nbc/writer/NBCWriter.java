package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class NBCWriter {
    private static final String musicTone = "TONE_C4";
    private static final int musicTime = 2000;

    public static final String turnLeftWheel = "OUT_C";
    public static final String turnRightWheel = "OUT_B";
    public static final String forwardWheel = "OUT_BC";
    public static final int turnPower = 410;
    public static final int forwardPower = 1000;
    public static final int speed = 80;
    public static final int wait = 200;

    public static final String incVariableName = "__incPlayPlusParser";

    public static void writeComment(PrintWriter writer, String comment) {
        writer.printf("; %s", comment).println();
    }

    public static void writePlaySound(PrintWriter writer) {
        NBCWriter.writeComment(writer, "Playing sound");
        writer.format("  PlayTone(%s, %s)", musicTone, musicTime).println();
        writer.format("  wait %s", musicTime).println();
        writer.format("  PlayTone(%s, %s)", 0, 0).println();
        writer.format("  wait %s", 1000).println();
    }

    public static void writeSegmentStart(PrintWriter writer) {
        writer.println("dseg segment");
    }

    public static void writeSegmentEnd(PrintWriter writer) {
        writer.println("dseg ends");
    }

    public static void writeLabel(PrintWriter writer, String label) {
        writer.format("%s:", label).println();
    }
}
