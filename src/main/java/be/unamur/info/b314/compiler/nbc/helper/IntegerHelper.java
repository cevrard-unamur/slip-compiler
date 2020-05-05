package be.unamur.info.b314.compiler.nbc.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.exception.PlayPlusException;
import be.unamur.info.b314.compiler.nbc.writer.NBCIntCodeTypes;
import be.unamur.info.b314.compiler.nbc.writer.NBCOpCodeTypes;

public class IntegerHelper {
    public static NBCIntCodeTypes integerToNbcOpCodeType(int intCode) {
        switch (intCode) {
            case PlayPlusParser.PLUS:
                return NBCIntCodeTypes.Addition;
            case PlayPlusParser.MINUS:
                return NBCIntCodeTypes.Subtraction;
            case PlayPlusParser.MULTI:
                return NBCIntCodeTypes.Multiplication;
            case PlayPlusParser.DIV:
                return NBCIntCodeTypes.Division;
            case PlayPlusParser.MOD:
                return NBCIntCodeTypes.Modulo;
        }

        throw new PlayPlusException("There is no matching type for this comparison");
    }
}
