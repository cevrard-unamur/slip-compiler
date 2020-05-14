package be.unamur.info.b314.compiler.language.helper;

public class Tuple<X, Y> {
    public final X Item1;
    public final Y Item2;

    /**
     * Create a Tuple with the given items
     * @param item1 item with a given type X
     * @param item2 item with a given type Y
     */
    public Tuple(X item1, Y item2) {
        this.Item1 = item1;
        this.Item2 = item2;
    }
}
