package com.company;

public class Main {

    public static void main(String[] args) {
    	System.out.println("Welcome to Super Extreme Competitive Tic-Tac-Toe!");
    	System.out.println("Follow instructions as they are given and may the best player win.");
    	boolean anotherGame = true;

    	while (anotherGame) {
    		Helper helper = new Helper();
			Game round1 = new Game();
			round1.start();
			System.out.println("Player 1: " + Board.PLAYER_1_WINS);
			System.out.println("Player 2: " + Board.PLAYER_2_WINS);

			while (true) {
				String playAgain = helper.getUserInput("Would you like to play another game?");

				if (playAgain.equals("no")) {
					anotherGame = false;
					break;
				} else if (playAgain.equals("yes")) {
					break;
				} else {
					System.out.println("Not valid input. Enter \"yes\" or \"no\".");
				}
			}
		}
    }
}
