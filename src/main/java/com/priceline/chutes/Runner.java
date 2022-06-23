package com.priceline.chutes;

import com.priceline.chutes.service.GameService;

public class Runner {

    public static void main(String[] args) {
        GameService game = new GameService();
        game.runGame();
    }

}
