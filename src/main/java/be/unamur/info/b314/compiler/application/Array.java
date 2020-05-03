package be.unamur.info.b314.compiler.application;

import java.util.ArrayList;

public class Array extends VariableBase {
    private Integer[] size;

    private ArrayList<String> values;

    public Array(String name, String type, Integer[] size, String context)
    {
        this.name = name;
        this.type = type;
        this.size = size;
        this.values = new ArrayList<>();
        this.context = context;
    }

    public Integer getLength() {
        return size.length;
    }
}
