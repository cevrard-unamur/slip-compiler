package be.unamur.info.b314.compiler.exception;

public class IncorrectTypeException extends RuntimeException {

        public IncorrectTypeException(String message, Exception e) {
            super(message, e);
        }

        public IncorrectTypeException(String message){
            super(message);
        }

}
