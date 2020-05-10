package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class ActionWriter {
    /**
     * Writes the turn left action in NBC.
     * @param writer the print writer of the NBC output.
     */
    public static void writeTurnLeft(PrintWriter writer) {
        writer.format("RotateMotor(%s, %s, %s)",
                NBCWriter.forwardWheel,
                NBCWriter.speed,
                NBCWriter.turnPower).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.turnLeftWheel, NBCWriter.speed).println();
        writer.format("wait %s", NBCWriter.wait).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.turnLeftWheel, 0).println();
    }

    /**
     * Writes the turn right action in NBC.
     * @param writer the print writer of the NBC output.
     */
    public static void writeTurnRight(PrintWriter writer) {
        writer.format("RotateMotor(%s, %s, %s)",
                NBCWriter.forwardWheel,
                NBCWriter.speed,
                NBCWriter.turnPower).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.turnRightWheel, NBCWriter.speed).println();
        writer.format("wait %s", NBCWriter.wait).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.turnRightWheel, 0).println();
    }

    /**
     * Writes the go forward action in NBC.
     * @param writer the print writer of the NBC output.
     */
    public static void writeGoForward(PrintWriter writer) {
        writer.format("RotateMotor(%s, %s, %s)",
                NBCWriter.forwardWheel,
                NBCWriter.speed,
                NBCWriter.forwardPower).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.forwardWheel, NBCWriter.speed).println();
        writer.format("wait %s", NBCWriter.wait).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.forwardWheel, 0).println();
    }

    /**
     * Writes the go backward action in NBC.
     * @param writer the print writer of the NBC output.
     */
    public static void writeGoBackward(PrintWriter writer) {
        writer.format("RotateMotor(%s, %s, %s)",
                NBCWriter.forwardWheel,
                -NBCWriter.speed,
                NBCWriter.forwardPower).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.forwardWheel, -NBCWriter.speed).println();
        writer.format("wait %s", NBCWriter.wait).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.forwardWheel, 0).println();
    }

    /**
     * Plays a sound three times when the robot is digging.
     * @param writer the print writer of the NBC output.
     */
    public static void writeDig(PrintWriter writer) {
        NBCWriter.writePlaySound(writer);
        NBCWriter.writePlaySound(writer);
        NBCWriter.writePlaySound(writer);
    }

    /**
     * Plays a sound two times when the robot is jumping.
     * @param writer the print writer of the NBC output.
     */
    public static void writeJump(PrintWriter writer) {
        NBCWriter.writePlaySound(writer);
        NBCWriter.writePlaySound(writer);
    }

    /**
     * Plays a sound one time when the robot is fighting.
     * @param writer the print writer of the NBC output.
     */
    public static void writeFight(PrintWriter writer) {
        NBCWriter.writePlaySound(writer);
    }
}
