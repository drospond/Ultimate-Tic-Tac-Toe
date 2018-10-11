package com.company;

public class Game {
    boolean gameOver = false;
    Board game1 = new Board();
    Helper helper = new Helper();
    int turnCount = 0;
    String validInput = "123456789";

    public void start(){
    	while(!gameOver) {
            System.out.println(game1.board);
            while (true) {
                String userGuess = helper.getUserInput("Player 1, choose a square to place an X:");
                if (game1.board.toString().contains(userGuess) && validInput.contains(userGuess)) {
                    game1.player1Move(userGuess);
                    break;
                } else {
                    System.out.println("Not valid input");
                }
            }
            turnCount += 1;
            gameOver = game1.checkWinner(turnCount);
            if (gameOver) {
                break;
            }

            System.out.println(game1.board);
            while (true) {
                String userGuess2 = helper.getUserInput("Player 2, choose a square to place an O:");
                if (game1.board.toString().contains(userGuess2) && validInput.contains(userGuess2)) {
                    game1.player2Move(userGuess2);
                    break;
                } else {
                    System.out.println("Not valid input");
                }
            }
            turnCount += 1;
            gameOver = game1.checkWinner(turnCount);
        }

    }
}
