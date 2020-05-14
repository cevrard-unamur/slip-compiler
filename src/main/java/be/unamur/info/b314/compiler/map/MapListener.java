package be.unamur.info.b314.compiler.map;


import be.unamur.info.b314.compiler.PlayPlusBaseListener;
import be.unamur.info.b314.compiler.PlayPlusParser;

import java.util.ArrayList;
import java.util.List;

public class MapListener extends PlayPlusBaseListener {
    private List<String> errors = new ArrayList();
    private String[][] map;

    /**
     * Method that get the errors
     * @return the List of errors
     */
    public List<String> getErrors() {
        return this.errors;
    }

    /**
     * Method that get the map
     * @return doubled array representation of the map
     */
    public String[][] getMap() {
        return this.map;
    }

    /**
     * Override method of the map parsing
     * @param ctx current map context
     */
    @Override
    public void enterMapDescription(PlayPlusParser.MapDescriptionContext ctx) {
        Integer lines = Integer.parseUnsignedInt(ctx.NUMBER(0).getText());
        Integer columns = Integer.parseUnsignedInt(ctx.NUMBER(1).getText());

        map = new String[lines][columns];

        int currentLine = 0;
        int currentColumn = 0;
        int numberOfChest = 0;
        int numberOfRobot = 0;
        int numberOfEnemies = 0;

        for (PlayPlusParser.MapSymbolsContext mapItemContext : ctx.mapSymbols()) {
            // If we have the current line is the same as the number of wanted lines and
            //  we still have symbol to process, the map provide is incorrect.
            if (currentLine == lines) {
                errors.add("The size of the map is not matching the number of symbol.");
            }

            if (mapItemContext instanceof PlayPlusParser.ChestContext) { numberOfChest++; }
            if (mapItemContext instanceof PlayPlusParser.RobotContext) { numberOfRobot++; }
            if (mapItemContext instanceof PlayPlusParser.SqueletonContext) { numberOfEnemies++; }

            map[currentLine][currentColumn++] = mapItemContext.getText();

            // If we are in the last column, we go back to the first one and we move to the next line.
            if (currentColumn == columns) {
                currentColumn = 0;
                currentLine++;
            }
        }

        if (currentLine != lines) { errors.add("The size of the map is not matching the number of symbol."); }
        if (numberOfChest < 1) { errors.add("There is no chest on your map."); }
        if (numberOfChest > 1) { errors.add("There is too much chests on your map."); }
        if (numberOfRobot < 1) { errors.add("There is no robot on your map."); }
        if (numberOfRobot > 1) { errors.add("There is too much robots on your map."); }
        if (numberOfEnemies == 0) { errors.add("There is no enemy on your map"); }
    }
}
