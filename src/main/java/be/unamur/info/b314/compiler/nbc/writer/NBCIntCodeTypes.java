package be.unamur.info.b314.compiler.nbc.writer;

public enum NBCIntCodeTypes {
    /**
     * The NBC integer code.
     */
    Addition("add"),
    Subtraction("sub"),
    Multiplication("mul"),
    Division("div"),
    Modulo("mod"),
    Negation("neg");

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
     * Create a new NBC integer code enumeration value.
     * @param r the name of the NBC code.
     */
    private NBCIntCodeTypes(String r) {
        representation = r;
    }
}
