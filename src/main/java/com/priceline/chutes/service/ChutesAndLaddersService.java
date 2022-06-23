package com.priceline.chutes.service;

import com.priceline.chutes.models.Board;
import com.priceline.chutes.models.BoardSquare;
import com.priceline.chutes.models.Player;

import java.util.List;
import java.util.Random;

@Component
public class ChutesAndLaddersService {

    private final Random diceRoller;
    private final Board board;

    private static final int WINNING_SQUARE = 100;
    private static final int MAX_ROLL = 6;
    private static final int PLUS_ONE = 1;

    public ChutesAndLaddersService(final Random diceRoller,
                                   final Board board) {
        this.diceRoller = diceRoller;
        this.board = board;
    }

    public Player playGame(final List<Player> players) {
        while(true){
            for (Player currentPlayer : players) {
                final int spinResult = spin();
                int nextPosition = currentPlayer.getPosition() + spinResult;

                if (nextPosition > WINNING_SQUARE) {
                    break;
                }

                final BoardSquare nextSquare = board.getSquareAtPosition(nextPosition);
                nextPosition += movePlayer(nextSquare);

                if (nextPosition < WINNING_SQUARE) {
                    currentPlayer.setPosition(nextPosition);
                } else if (nextPosition == WINNING_SQUARE) {
                    return currentPlayer;
                }

            }
        }
    }

    public int movePlayer(final BoardSquare currentSquare) {
        if (currentSquare.isLadder()) {
            return currentSquare.getNumberSquaresToSkip();
        } else if (currentSquare.isChute()) {
            return currentSquare.getNumberSquaresToSkip() * - 1;
        } else {
            return 0;
        }
    }

    private int spin(){
        return diceRoller.nextInt(MAX_ROLL) + PLUS_ONE;
    }

}
