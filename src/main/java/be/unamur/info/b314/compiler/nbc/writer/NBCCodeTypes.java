package be.unamur.info.b314.compiler.nbc.writer;

public enum NBCCodeTypes {
    /**
     * The NBC code types.
     */
    Int("sdword"), Char("sbyte"), Bool("byte");

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
     * Create a new NBC code enumeration value.
     * @param r the name of the NBC code.
     */
    private NBCCodeTypes(String r) {
        representation = r;
    }
}
