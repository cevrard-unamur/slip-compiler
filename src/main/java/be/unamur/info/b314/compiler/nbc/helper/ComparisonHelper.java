package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.NBCCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;

public class ComparisonHelper {
    public static NBCOpCodeTypes comparisonToNbcOpCodeType(int opCode) {
        switch (opCode) {
            case PlayPlusParser.EQUAL:
                return NBCOpCodeTypes.Equal;
            case PlayPlusParser.LESS:
                return NBCOpCodeTypes.LessThan;
            case PlayPlusParser.LESS_EQUAL:
                return NBCOpCodeTypes.LessThanOrEqual;
            case PlayPlusParser.GREAT:
                return NBCOpCodeTypes.GreaterThan;
            case PlayPlusParser.GREAT_EQUAL:
                return NBCOpCodeTypes.GreaterThanOrEqual;
            case PlayPlusParser.NOT_EQUAL:
                return NBCOpCodeTypes.NotEqual;
        }

        throw new PlayPlusException("There is no matching type for this comparison");
    }
}
