package be.unamur.info.b314.compiler.application;

public class Application {
    private Environment environment;

    public Application() {
        this.environment = new Environment();
    }

    public void addVariable(String type, String name, String value) {
        this.environment.addVariable(new Variable(type, name, value));
    }
}
