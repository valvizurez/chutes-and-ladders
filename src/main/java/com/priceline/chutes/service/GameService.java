package com.priceline.chutes.service;

import com.priceline.chutes.models.Player;

import java.util.*;

public class GameService {

    private final ChutesAndLaddersService chutesAndLaddersService;
    private final Scanner scanner;

    public GameService() {
        this.chutesAndLaddersService = new ChutesAndLaddersService();
        this.scanner = new Scanner(System.in);
    }

    public void runGame() {
        try {
            List<Player> players = getPlayers();
            Player winner = chutesAndLaddersService.playGame(players);
            System.out.println("The winner is: " + winner.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Player> getPlayers() {
        System.out.println("Please enter num players");
        final int numPlayers = scanner.nextInt();
        scanner.nextLine();

        final List<Player> players = new ArrayList<>();
        System.out.println("Please enter player names, press enter after each name");

        for(int i=0; i < numPlayers; i++) {
            players.add(new Player(scanner.nextLine()));
        }
        return players;
    }

}
