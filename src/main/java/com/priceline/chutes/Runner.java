package com.priceline.chutes;

import com.priceline.chutes.service.GameService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {

    public static void main(String[] args) {
        GameService game = new GameService();
        String winner = game.runGame();
        logger.log("Winner is: {}", winner);
    }

}
