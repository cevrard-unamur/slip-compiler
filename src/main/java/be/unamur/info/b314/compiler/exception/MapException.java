package be.unamur.info.b314.compiler.exception;

public class MapException extends RuntimeException {

    public MapException(String message, Exception e) {
        super(message, e);
    }

    public MapException(String message){
        super(message);
    }

}
