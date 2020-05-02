package be.unamur.info.b314.compiler.nbc.writer;

import java.io.PrintWriter;

public class ActionWriter {
    public static void writeTurnLeft(PrintWriter writer) {
        writer.format("RotateMotor(%s, %s, %s)",
                NBCWriter.forwardWheel,
                NBCWriter.speed,
                NBCWriter.turnPower).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.turnLeftWheel, NBCWriter.speed).println();
        writer.format("wait %s", NBCWriter.wait).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.turnLeftWheel, 0).println();
    }

    public static void writeTurnRight(PrintWriter writer) {
        writer.format("RotateMotor(%s, %s, %s)",
                NBCWriter.forwardWheel,
                NBCWriter.speed,
                NBCWriter.turnPower).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.turnRightWheel, NBCWriter.speed).println();
        writer.format("wait %s", NBCWriter.wait).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.turnRightWheel, 0).println();
    }

    public static void writeGoForward(PrintWriter writer) {
        writer.format("RotateMotor(%s, %s, %s)",
                NBCWriter.forwardWheel,
                NBCWriter.speed,
                NBCWriter.forwardPower).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.forwardWheel, NBCWriter.speed).println();
        writer.format("wait %s", NBCWriter.wait).println();
        writer.format("OnFwd(%s, %s)", NBCWriter.forwardWheel, 0).println();
    }

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
