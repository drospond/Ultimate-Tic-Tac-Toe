package com.company;

public class Board {
    StringBuilder board = new StringBuilder("_1_|_2_|_3_\n_4_|_5_|_6_\n 7 | 8 | 9 ");
    static int PLAYER_1_WINS = 0;
    static int PLAYER_2_WINS = 0;

    public void player1Move(String userGuess){
        int change = board.indexOf(userGuess);
        board.replace(change,change+1,"X");
    }

    public void player2Move(String userGuess){
        int change = board.indexOf(userGuess);
        board.replace(change,change+1,"O");
    }

    public boolean checkWinner(int turnCount){
        boolean gameOver = false;

        if(board.charAt(1)== 'X'&&board.charAt(1)==board.charAt(5)&&board.charAt(1)==board.charAt(9)||
                board.charAt(1)== 'X'&&board.charAt(1)==board.charAt(13)&&board.charAt(1)==board.charAt(25)||
                        board.charAt(1)== 'X'&&board.charAt(1)==board.charAt(17)&&board.charAt(1)==board.charAt(33)||
                                board.charAt(5)== 'X'&&board.charAt(5)==board.charAt(17)&&board.charAt(5)==board.charAt(29)||
                                        board.charAt(9)== 'X'&&board.charAt(9)==board.charAt(17)&&board.charAt(9)==board.charAt(25)||
                                                board.charAt(13)== 'X'&&board.charAt(13)==board.charAt(17)&&board.charAt(13)==board.charAt(21)||
                                                        board.charAt(25)== 'X'&&board.charAt(25)==board.charAt(29)&&board.charAt(25)==board.charAt(33)){
            System.out.println(board);
            System.out.println("Player 1 wins!!");
            PLAYER_1_WINS++;
            gameOver = true;
        }else if(board.charAt(1)== 'O'&&board.charAt(1)==board.charAt(5)&&board.charAt(1)==board.charAt(9)||
                board.charAt(1)== 'O'&&board.charAt(1)==board.charAt(13)&&board.charAt(1)==board.charAt(25)||
                        board.charAt(1)== 'O'&&board.charAt(1)==board.charAt(17)&&board.charAt(1)==board.charAt(33)||
                                board.charAt(5)== 'O'&&board.charAt(5)==board.charAt(17)&&board.charAt(5)==board.charAt(29)||
                                        board.charAt(9)== 'O'&&board.charAt(9)==board.charAt(17)&&board.charAt(9)==board.charAt(25)||
                                                board.charAt(13)== 'O'&&board.charAt(13)==board.charAt(17)&&board.charAt(13)==board.charAt(21)||
                                                        board.charAt(25)== 'O'&&board.charAt(25)==board.charAt(29)&&board.charAt(25)==board.charAt(33)) {
            System.out.println(board);
            System.out.println("Player 2 wins!!");
            PLAYER_2_WINS++;
            gameOver = true;
        }else if(turnCount >= 9){
            System.out.println("Cat's Game");
            System.out.println(board);
            gameOver = true;
        }
        //char[][] matrix ={{board.charAt(1), board.charAt(5), board.charAt(9)},
                          //{board.charAt(13), board.charAt(17), board.charAt(21)},
                          //{board.charAt(25), board.charAt(29), board.charAt(33)}};
        return gameOver;
    }

}
