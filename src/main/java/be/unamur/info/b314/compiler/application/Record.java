package be.unamur.info.b314.compiler.application;

public class Record extends Context {
    /**
     * The name of the record.
     */
    private String name;

    /**
     * Gets the name of the record
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the context parent of the record.
     * @return
     */
    public Context getParent() { return parent; }

    /**
     * Initializes a new instance of a record
     * @param name the name of the record.
     * @param parent the parent context of the record.
     */
    public Record(String name, Context parent) {
        this.name = name;
        super.parent = parent;
    }
}
