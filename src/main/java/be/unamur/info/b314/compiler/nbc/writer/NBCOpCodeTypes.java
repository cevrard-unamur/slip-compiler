package be.unamur.info.b314.compiler.nbc.writer;

public enum NBCOpCodeTypes {
    LessThan("LT"),
    GreaterThan("GT"),
    LessThanOrEqual("LTEQ"),
    GreaterThanOrEqual("GTEQ"),
    Equal("EQ"),
    NotEqual("NEQ");

    private final String representation;

    public String getRepresentation() { return this.representation; }

    private NBCOpCodeTypes(String r) {
        representation = r;
    }
}
