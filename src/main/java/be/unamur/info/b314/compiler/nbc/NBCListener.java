package be.unamur.info.b314.compiler.nbc;

import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.main.ANTLRParser;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class NBCListener extends PlayPlusBaseListener {
    private final Application application;
    private final String inputFile;
    private final NBCPrinter printer;

    public NBCListener(NBCPrinter printer, String inputFile, Application application) {
        this.printer = printer;
        this.inputFile = inputFile;
        this.application = application;
    }

    @Override
    public void exitRoot(PlayPlusParser.RootContext ctx) {
        this.printer.close();
    }

    @Override
    public void enterMapImportation(PlayPlusParser.MapImportationContext ctx) {
        try {
            // Retrieve and parse the map file
            String mapFilename = ctx.MAPFILE().getText();
            String mapPath = this.inputFile + "/" + mapFilename;

            ANTLRParser antlrParser = new ANTLRParser();
            PlayPlusParser.RootContext tree = antlrParser.parse(new ANTLRInputStream(new FileInputStream(mapPath)));
            antlrParser.mapParser(tree);
        } catch (IOException e) {
            this.application.addError(e.getMessage());
        }
    }
}
