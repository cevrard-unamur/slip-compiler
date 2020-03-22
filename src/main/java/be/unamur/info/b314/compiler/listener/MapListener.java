package be.unamur.info.b314.compiler.listener;


import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;

import java.util.ArrayList;
import java.util.List;

public class MapListener extends PlayPlusBaseListener {
    private List<String> errors = new ArrayList();
    private String[][] map;

    public List<String> getErrors() {
        return this.errors;
    }

    public String[][] getMap() {
        return this.map;
    }

    @Override
    public void enterMapDescription(PlayPlusParser.MapDescriptionContext ctx) {
        Integer lines = Integer.parseUnsignedInt(ctx.NUMBER(0).getText());
        Integer columns = Integer.parseUnsignedInt(ctx.NUMBER(1).getText());

        map = new String[lines][columns];

        int currentLine = 0;
        int currentColumn = 0;

        for (PlayPlusParser.MapSymbolsContext mapItemContext : ctx.mapSymbols()) {
            // If we have the current line is the same as the number of wanted lines and
            //  we still have symbol to process, the map provide is incorrect.
            if (currentLine == lines) {
                errors.add("The size of the map is not matching the number of symbol.");
            }

            map[currentLine][currentColumn++] = mapItemContext.getText();

            // If we are in the last column, we go back to the first one and we move to the next line.
            if (currentColumn == columns) {
                currentColumn = 0;
                currentLine++;
            }
        }

        if (currentLine != lines) {
            errors.add("The size of the map is not matching the number of symbol.");
        }
    }
}
