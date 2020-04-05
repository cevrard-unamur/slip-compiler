package be.unamur.info.b314.compiler.application;

import java.util.List;

public class Enumeration {
    private String name;
    private List<String> values;

    public String getName() { return name; }

    public List<String> getValues() { return values; }

    public Enumeration(String name, List<String> values) {
        this.name = name;
        this.values = values;
    }
}
