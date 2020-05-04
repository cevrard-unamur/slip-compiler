package be.unamur.info.b314.compiler.nbc.writer;

public enum NBCIntCodeTypes {
    Addition("add"),
    Subtraction("sub"),
    Multiplication("mul"),
    Division("div"),
    Modulo("mod"),
    Negation("neg");

    private final String representation;

    public String getRepresentation() { return this.representation; }

    private NBCIntCodeTypes(String r) {
        representation = r;
    }
}
