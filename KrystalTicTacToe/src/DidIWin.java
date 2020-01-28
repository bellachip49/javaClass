class DidIWin {
    //field
    private String status = "null";
    private int spaceCount = 0;

    //constructor
    DidIWin(){

    }

    //no getter or setter

    //other methods
    String gameStatus(String [][] board){ //comparison can be made for both players since wins can only be made after each respective player's turn
        //check for win
        for(int i = 0; i < 3; i++){
            if( ( (board[i][0].equals(board[i][1])) && (board[i][0].equals(board[i][2])) ) && (board[i][0].equals("X") || board[i][0].equals("O")) ){ //compare rows
                status = "win"; //set status var to win
            }
            if((board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) && (board[0][i].equals("X") || board[0][i].equals("O"))){ //compare columns
                status = "win"; //set status var to win
            }
            if((board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) && (board[2][2].equals("X") || board[2][2].equals("O"))){ //compare diagonals
                status = "win"; //set status var to win
            }
        }
        //check for tie game
        spaceCount = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){ //loop through nested list to check if each index has either X or O
                if(board[i][j].equals("X") || board[i][j].equals("O"))
                    spaceCount++; //add 1 to var measuring how many spaces filled with either symbol
            }
        }
        if(spaceCount == 9){ //if all 9 spaces are filled, set status var to tie
            status = "tie";
        }
        return status;
    }
}
