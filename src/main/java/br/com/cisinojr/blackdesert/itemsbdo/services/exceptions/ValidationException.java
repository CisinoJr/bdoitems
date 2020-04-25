package br.com.cisinojr.blackdesert.itemsbdo.services.exceptions;

public class ValidationException extends Exception {

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }

}
