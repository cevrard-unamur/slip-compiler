package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.application.Application;
import be.unamur.info.b314.compiler.main.ANTLRParser;
import be.unamur.info.b314.compiler.map.MapListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;

public class MapExpression {
    public static void enterMapImportation(PlayPlusParser.MapImportationContext ctx, String inputFile, Application application) {
        try {
            // Retrieve and parse the map file
            String mapFilename = ctx.MAPFILE().getText();
            String mapPath = inputFile + "/" + mapFilename;

            ANTLRParser antlrParser = new ANTLRParser();
            PlayPlusParser.RootContext tree = antlrParser.parse(new ANTLRInputStream(new FileInputStream(mapPath)));
            antlrParser.mapParser(tree);
            application.addMap(mapGetter(tree));
        } catch (IOException e) {
            // If the map is not found, we ignore the map validation
        }
    }

    public static String[][] mapGetter(PlayPlusParser.RootContext tree){
        String[][] map;
        ParseTreeWalker walker = new ParseTreeWalker();
        MapListener mapListener = new MapListener();
        walker.walk(mapListener, tree);

        map = mapListener.getMap();

        return map;
    }
}
