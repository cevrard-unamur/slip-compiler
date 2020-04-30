package be.unamur.info.b314.compiler.nbc.writer;

public enum NBCCodeTypes {
    Int("sdword"), Char("sbyte"), Bool("byte"), Void("void");

    private final String representation;

    public String getRepresentation() { return this.representation; }

    private NBCCodeTypes(String r) {
        representation = r;
    }
}
