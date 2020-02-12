/*
 * Copyright (C) 2020 Barrow Kwan
 * 
 * Date : 01/02/2020
 * 
 */

import java.lang.Math;

class Player{
    private int score=0;
    private char marker;

    public Player(char tMarker){
        this.marker = tMarker;
    }

    /* 
        Player's current score
    */
    public int getScore(){
        return this.score;
    }

    /*
        Add score based on the position the player move
          9 | 8 | 7
         ---|---|---
          6 | 5 | 4
         ---|---|---
          3 | 2 | 1

          If player mark box 5, the score will be 2 ^ (5 -1) = 16

    */
    public void setScore(int tScore){
        this.score += Math.pow(2, tScore-1);
    }

    /*
        Mark player as 'X' or 'O'
    */

    public char getMarker(){
        return this.marker;
    }

    /*
        An example of winning pattern for Player "X" is

         X | X | X         9 | 8 | 7
        ---|---|---       ---|---|---
           |   | O         6 | 5 | 4
        ---|---|---       ---|---|---
         O |   | O         3 | 2 | 1
        
        Use binary number to represent this winning pattern will be 111000000 = 448 (in decimal)
        Take a bitwise operation & between the winning pattern and the existing score, if the result is equal to the winning pattern,
        this will be the winner.

        Here are the winning pattern
        111000000 = 448
        100010001 = 273
        100100100 = 292
        010010010 = 146
        001010100 = 84
        001001001 = 73
        000111000 = 56
        000000111 = 7

        For example if the current board is 
         X | O | X         9 | 8 | 7
        ---|---|---       ---|---|---
         O | X | O         6 | 5 | 4
        ---|---|---       ---|---|---
         O |   | X         3 | 2 | 1

        The binary number representation for Player 'X' is 101010001,  take the bitwise operaton & with one of the winning pattern
        1. 101010001 & 111000000 = 101000000 which is not equal 111000000  not winning pattern
        2. 101010001 & 100010001 = 100010001 which is equal to 100010001  WINNING pattern

        so Player X has the winning pattern, thus winner

    */
    public boolean isWinning(){

        if (((this.score & 448) == 448 ) ||
            ((this.score & 273) == 273 ) ||
            ((this.score & 292) == 292 ) ||
            ((this.score & 146) == 146 ) ||
            ((this.score & 84) == 84 ) ||
            ((this.score & 73) == 73 ) ||
            ((this.score & 56) == 56 ) ||
            ((this.score & 7) == 7 )){
            return true;
        }else{
            return false;
        }
        
    }

}