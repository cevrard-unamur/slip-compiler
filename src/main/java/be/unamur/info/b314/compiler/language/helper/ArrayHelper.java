package be.unamur.info.b314.compiler.language.helper;

import be.unamur.info.b314.compiler.PlayPlusParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ArrayHelper {
    public static Integer[] getSize(PlayPlusParser.ArrayContext ctx) {
        List<Integer> arraySize = new ArrayList<>();

        for (Object node : ctx.children) {
            if (((TerminalNode)node).getSymbol().getType() == PlayPlusParser.NUMBER) {
                arraySize.add(Integer.parseUnsignedInt(((TerminalNode) node).getText()));
            }
        }

        Integer size[] = new Integer[arraySize.size()];
        size = arraySize.toArray(size);

        return size;
    }
}
