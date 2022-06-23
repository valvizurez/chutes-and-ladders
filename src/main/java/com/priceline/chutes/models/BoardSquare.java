package com.priceline.chutes.models;

import lombok.Getter;

@Getter
public class BoardSquare {

    private final boolean isChute;
    private final boolean isLadder;
    private final int numberSquaresToSkip;

    public BoardSquare() {
        this(false, false, 0);
    }

    public BoardSquare(final boolean isChute,final boolean isLadder,final int numberSquaresToSkip) {
        this.isChute = isChute;
        this.isLadder = isLadder;
        this.numberSquaresToSkip = numberSquaresToSkip;
    }

}
