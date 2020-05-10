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
    /**
     * Enters in a map importation to check the validity of the map.
     * @param context the map importation context.
     * @param pathFolder the path to the folder of the map file.
     * @param application the application.
     */
    public static void enterMapImportation(
            PlayPlusParser.MapImportationContext context,
            String pathFolder,
            Application application
    ) {
        try {
            // Retrieve and parse the map file
            String mapFilename = context.MAPFILE().getText();
            String mapPath = pathFolder + "/" + mapFilename;

            ANTLRParser antlrParser = new ANTLRParser();
            PlayPlusParser.RootContext tree = antlrParser.parse(new ANTLRInputStream(new FileInputStream(mapPath)));
            antlrParser.mapParser(tree);

            MapExpression.mapGenerator(tree, application);
        } catch (IOException e) {
            // If the map is not found, we ignore the map validation
        }
    }

    /**
     * Generate the map and save it into the application.
     * @param tree the ANTRL tree.
     * @param application the application.
     */
    public static void mapGenerator(PlayPlusParser.RootContext tree, Application application){
        ParseTreeWalker walker = new ParseTreeWalker();
        MapListener mapListener = new MapListener();
        walker.walk(mapListener, tree);

        application.setMap(mapListener.getMap());
    }
}
