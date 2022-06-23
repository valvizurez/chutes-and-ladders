package com.priceline.chutes.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GameServiceTest {

    private GameService gameService;

    @BeforeAll
     void setUp() {
        gameService = new GameService();
    }


}
