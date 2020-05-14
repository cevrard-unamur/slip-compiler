package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class NBCWriter {
    /**
     * The default music tone.
     */
    private static final String musicTone = "TONE_C4";
    /**
     * The default music time.
     */
    private static final int musicTime = 2000;

    /**
     * The left wheel of the robot.
     */
    public static final String turnLeftWheel = "OUT_C";
    /**
     * The right wheel of the robot.
     */
    public static final String turnRightWheel = "OUT_B";
    /**
     * Both wheel of the robot.
     */
    public static final String forwardWheel = "OUT_BC";
    /**
     * The power when the robot turns.
     */
    public static final int turnPower = 410;
    /**
     * The power when the robot goes forward or backward.
     */
    public static final int forwardPower = 1000;
    /**
     * The speed of the robot.
     */
    public static final int speed = 80;
    /**
     * The wait time of the robot.
     */
    public static final int wait = 200;
    /**
     * The increment variable name
     */
    public static final String incVariableName = "__incPlayPlusParser";
    /**
     * The zero variable name.
     */
    public static final String zeroVariableName = "__zero";
    /**
     * The boolean true variable name.
     */
    public static final String booleanTrueVariableName = "__booleanTrueVariableName";
    /**
     * The boolean false variable name.
     */
    public static final String booleanFalseVariableName = "__booleanFalseVariableName";
    /**
     * The boolean false value in NBC.
     */
    public static final String booleanFalse = "0";
    /**
     * The boolean true value in NBC.
     */
    public static final String booleanTrue = "1";

    /**
     * Writes a comment in the NBC code.
     * @param writer the print writer of the NBC output.
     * @param comment the comment to write.
     */
    public static void writeComment(PrintWriter writer, String comment) {
        writer.printf("; %s", comment).println();
    }

    /**
     * Write the NBC code to play a sound.
     * @param writer the print writer of the NBC output.
     */
    public static void writePlaySound(PrintWriter writer) {
        NBCWriter.writeComment(writer, "Playing sound");
        writer.format("  PlayTone(%s, %s)", musicTone, musicTime).println();
        writer.format("  wait %s", musicTime).println();
        writer.format("  PlayTone(%s, %s)", 0, 0).println();
        writer.format("  wait %s", 1000).println();
    }

    /**
     * Writes a segment start for the variable declaration in the NBC code.
     * @param writer the print writer of the NBC output.
     */
    public static void writeSegmentStart(PrintWriter writer) {
        writer.println("dseg segment");
    }

    /**
     * Writes a segment end for the variable declaration in the NBC code.
     * @param writer the print writer of the NBC output.
     */
    public static void writeSegmentEnd(PrintWriter writer) {
        writer.println("dseg ends");
    }

    /**
     * Writes a label in the NBC code.
     * @param writer the print writer of the NBC output.
     * @param label the name of the label to write.s
     */
    public static void writeLabel(PrintWriter writer, String label) {
        writer.format("%s:", label).println();
    }
}
