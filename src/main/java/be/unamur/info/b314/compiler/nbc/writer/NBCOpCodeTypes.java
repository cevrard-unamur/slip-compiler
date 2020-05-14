package be.unamur.info.b314.compiler.nbc.writer;

public enum NBCOpCodeTypes {
    /**
     * The NBC operation code for the comparison.
     */
    LessThan("LT"),
    GreaterThan("GT"),
    LessThanOrEqual("LTEQ"),
    GreaterThanOrEqual("GTEQ"),
    Equal("EQ"),
    NotEqual("NEQ");

    /**
     * The representation of the code as a string.
     */
    private final String representation;

    /**
     * Gets the representation of the code.
     * @return
     */
    public String getRepresentation() { return this.representation; }

    /**
     * Create a new NBC comparison code enumeration value.
     * @param r the name of the NBC code.
     */
    private NBCOpCodeTypes(String r) {
        representation = r;
    }
}
