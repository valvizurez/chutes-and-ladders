package com.priceline.chutes.exception;

public class GameRuleException extends RuntimeException {
    public GameRuleException(String errorMessage) {
        super(errorMessage);
    }
}
