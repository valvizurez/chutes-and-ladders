package com.priceline.chutes.service;

import com.priceline.chutes.models.BoardSquare;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GameServiceTest {

    ChutesAndLaddersService chutesAndLaddersService;

    private GameService gameService;

    @BeforeAll
    void setUp() {
        gameService = new GameService();
    }

    @Test
    public void gameRunsSuccessfullyWithWinner() {
        String winner = gameService.runGame();
        assertNotNull(winner);
    }

    @Test
    @Exception
    public void invalidNumPlayers() {


    }




}
