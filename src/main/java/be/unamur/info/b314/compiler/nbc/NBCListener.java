package be.unamur.info.b314.compiler.nbc;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.application.Application;

public class NBCListener extends PlayPlusBaseListener {
    private final Application application;
    private final NBCPrinter printer;

    public NBCListener(NBCPrinter printer, Application application) {
        this.printer = printer;
        this.application = application;
    }
}
