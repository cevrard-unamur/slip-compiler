package be.unamur.info.b314.compiler.nbc.helper;

import java.io.PrintWriter;

public interface ActionInterface {
    /**
     * Execute the action.
     * @param writer the print writer of the NBC output.
     */
    void execute(PrintWriter writer);
}
