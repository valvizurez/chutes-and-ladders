package com.priceline.chutes.exception;

public class GameErrorException extends RuntimeException {
    public GameErrorException(String errorMessage) {
        super(errorMessage);
    }
}
