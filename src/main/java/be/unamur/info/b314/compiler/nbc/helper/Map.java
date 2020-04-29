package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.main.ANTLRParser;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Map {
    public static void enterMapImportation(PlayPlusParser.MapImportationContext ctx, String inputFile, Application application) {
        try {
            // Retrieve and parse the map file
            String mapFilename = ctx.MAPFILE().getText();
            String mapPath = inputFile + "/" + mapFilename;

            ANTLRParser antlrParser = new ANTLRParser();
            PlayPlusParser.RootContext tree = antlrParser.parse(new ANTLRInputStream(new FileInputStream(mapPath)));
            antlrParser.mapParser(tree);
        } catch (IOException e) {
            application.addError(e.getMessage());
        }
    }
}
