/*
 * Copyright (C) 2020 Barrow Kwan
 * 
 * Date : 01/02/2020
 * 
 */

import java.util.Scanner;
import java.lang.String;
import java.util.InputMismatchException;


public class TicTacToe{
    public static void main(String [] args){

        String boardView = new String("         ");                 // TicTacToe boardview in flat
        Player[] players = {new Player('X'), new Player('O')};      // Instantiate Two players object and initial the player's symbol - 'X' or 'O'
        int playerNumber = 1;                                       // Current player's turn - either 1 or 0 since we only have two players
        boolean hasWinner = false;                                  // Has winner been found
        boolean validMove = false;                                  // is the player made the right move
        Scanner input;
        int tmpMarker = 0;

        while (boardView.contains(" ") && !hasWinner){              // if the boardView is not filled and winner has not found
            playerNumber = playerNumber ^ 1;                        // alter the playernumber from 1 to 0 or 0 to 1
            while (!validMove){
                printBoard(boardView);
                System.out.print("Player \"" + players[playerNumber].getMarker() + "\" turn.  Which box (1-9) you want to mark ? ");
                try {
                    input = new Scanner(System.in);
                    tmpMarker = input.nextInt();
                    if ((tmpMarker > 0) && (tmpMarker <= 9) && (boardView.charAt(9-tmpMarker) == ' ')){
                        validMove = true;
                    }else{
                        System.out.println("Box : " + Integer.toString(tmpMarker) + " is not valid.  Please try again.");
                    }
                } catch (InputMismatchException e){
                    System.out.println("Invalid input.  Please try again.");
                    input = null;
                }
            }
            boardView = replace(boardView, tmpMarker, players[playerNumber].getMarker());
            players[playerNumber].setScore(tmpMarker);
            hasWinner = players[playerNumber].isWinning();
            validMove = false;
        }
        printBoard(boardView);
        if (hasWinner){
            System.out.println("The winner is Player : \"" + players[playerNumber].getMarker() + "\"\n");
        }else{
            System.out.println("Tie game.\n");
        }
    }

    /*
       Print the TicTacToe Board with Player's symbol
    */
    private static void printBoard(String boardView){
        System.out.println("\nCurrent Game      Hint:");
        System.out.println("============      ==============");
        System.out.println(" " + boardView.charAt(0) + " | " + boardView.charAt(1) +  " | " + boardView.charAt(2) + "         9 | 8 | 7");
        System.out.println("---|---|---       ---|---|---");
        System.out.println(" " + boardView.charAt(3) + " | " + boardView.charAt(4) +  " | " + boardView.charAt(5) + "         6 | 5 | 4");
        System.out.println("---|---|---       ---|---|---");
        System.out.println(" " + boardView.charAt(6) + " | " + boardView.charAt(7) +  " | " + boardView.charAt(8) + "         3 | 2 | 1\n");
    }

    /*
        Update TicTacToe board view after player move
    */
    private static String replace(String tBoardView, int pos, char mark){
        char[] boardChars = tBoardView.toCharArray();
        boardChars[9-pos] = mark;
        return String.valueOf(boardChars);
    }
}