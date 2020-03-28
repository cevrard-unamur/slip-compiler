package be.unamur.info.b314.compiler.application;

import java.util.ArrayList;

public class Arrays {

    private String name;
    private String type;
    private int size;

    private ArrayList<Variable> variables;

    public Arrays(String name,String type,int size)
    {
        this.name = name;
        this.type = type;
        this.size = size;
        this.variables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSize(){
        return size;
    }

    public void addVariableInArray(Variable var)
    {
        variables.add(var);
    }
}
