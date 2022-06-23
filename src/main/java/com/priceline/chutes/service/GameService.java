package com.priceline.chutes.service;

import com.priceline.chutes.exception.GameErrorException;
import com.priceline.chutes.exception.GameRuleException;
import com.priceline.chutes.models.Player;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
@Slf4j
public class GameService {

    private final ChutesAndLaddersService chutesAndLaddersService;
    private final Scanner scanner;

    public GameService(final ChutesAndLaddersService chutesAndLaddersService,
                       final Scanner scanner) {
        this.chutesAndLaddersService = chutesAndLaddersService;
        this.scanner = scanner;
    }

    public String runGame() {
        List<Player> players = getPlayers();
        Player winner = chutesAndLaddersService.playGame(players);
       // logger.info("The winner is: {}", winner.getName());
        return winner.getName();
    }

    private List<Player> getPlayers() {
        final List<Player> players = new ArrayList<>();
        try {

            System.out.println("Please enter num players");
            final int numPlayers = scanner.nextInt();
            scanner.nextLine();

            if (numPlayers < 2) {
                throw new GameRuleException("You need more than 2 Players!! Please try again");
            }

            System.out.println("Please enter player names, press enter after each name");

            for (int i = 0; i < numPlayers; i++) {
                players.add(new Player(scanner.nextLine()));
            }
        } catch(Exception e) {
            throw new GameErrorException("Failed to capture players, please try again");
        }

        return players;
    }

}
