package com.priceline.chutes.service;

import com.priceline.chutes.models.BoardSquare;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ChutesAndLadderServiceTest {

    private ChutesAndLaddersService chutesAndLaddersService;

    @BeforeAll
     void setUp() {
        chutesAndLaddersService = new ChutesAndLaddersService();
    }

    @Test
    public void currentSquareIsLadderPositionGoesUp() {
        BoardSquare square = new BoardSquare(false, true, 10);
        int squaresMoved = chutesAndLaddersService.movePlayer(square);
        assertEquals(squaresMoved, 10);
    }

    @Test
    public void currentSquareIsChutePositionGoesDown() {
        BoardSquare square = new BoardSquare(true, false, 10);
        int squaresMoved = chutesAndLaddersService.movePlayer(square);
        assertEquals(squaresMoved, -10);
    }

    @Test
    public void currentSquareIsNormalPositionIsSame() {
        BoardSquare square = new BoardSquare(false, false, 0);
        int squaresMoved = chutesAndLaddersService.movePlayer(square);
        assertEquals(squaresMoved, 0);
    }

}
