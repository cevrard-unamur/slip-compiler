package be.unamur.info.b314.compiler.application;

import java.util.List;

public class Enumeration {
    /**
     * The name of the enumeration.
     */
    private String name;

    /**
     * The values of the enumeration.
     */
    private List<String> values;

    /**
     * Gets the name of the enumeration.
     * @return the name of the enumeration.
     */
    public String getName() { return name; }

    /**
     * Initializes a new instance of an enumeration.
     * @param name the name of the enumeration.
     * @param values the values of the enumeration.
     */
    public Enumeration(String name, List<String> values) {
        this.name = name;
        this.values = values;
    }
}
