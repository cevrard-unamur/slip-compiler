package be.unamur.info.b314.compiler.exception;

public class PlayPlusException extends RuntimeException {

    public PlayPlusException(String message, Exception e) {
        super(message, e);
    }

    public PlayPlusException(String message){
        super(message);
    }

}
