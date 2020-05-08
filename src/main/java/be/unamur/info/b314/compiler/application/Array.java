package be.unamur.info.b314.compiler.application;

public class Array extends VariableBase {
    /**
     * The size of the array.
     */
    private Integer[] size;

    /**
     * Initializes a new instance of an array.
     * @param name the name of the array.
     * @param type the type of the array.
     * @param size the size of the array.
     * @param context the context name in which the array is created.
     */
    public Array(String name, String type, Integer[] size, String context)
    {
        this.name = name;
        this.type = type;
        this.size = size;
        this.context = context;
    }

    /**
     * Return the sizes of the array.
     * @return the sizes of the array.
     */
    public Integer[] getSize() {
        return size;
    }

    /**
     * Gets the dimension of the array.
     * @return the dimension of the array.
     */
    public Integer getDimension() {
        return size.length;
    }
}
