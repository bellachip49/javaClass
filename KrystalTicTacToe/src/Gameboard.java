class Gameboard {
    //fields
    private String [][] board = new String[3][3];

    //constructor
    Gameboard(){

    }

    //getter
    //need to return list with current values
    String[][] getBoard(){
        return board;
    }

    //no setter

    //other methods
    String[][] makeGameboard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = "."; //set each index in nested list to . (default value when no symbols are assigned)
            }
        }
        return board;
    }

    void printGameboard(String [][] givenBoard){ //used to print out current status of the board
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(givenBoard[i][j] + " "); //print out board with nested loop
            }
            System.out.println();
        }
    }

    void addToBoard(String symbol, int row, int col){
        if(board[row][col].equals("X") || board[row][col].equals("O")){ //check if board coordinates are taken
            System.out.println("\nBoard coordinates of this input were already taken. Your turn was invalid and skipped.\n"); //user cannot take over a used space; turn is skipped
        }
        else{
            board[row][col] = symbol; //if board coordinates are not taken, assign corresponding symbol to board
        }
    }
}
