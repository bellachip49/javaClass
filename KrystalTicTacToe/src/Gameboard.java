class Gameboard {
    //print gameboard
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

    //setter
    //just practice; kind of insignificant

    //other methods
    String[][] makeGameboard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = ".";
            }
        }
        return board;
    }

    void printGameboard(String [][] givenBoard){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    void addToBoard(String symbol, int row, int col){
        board[row][col] = symbol;
    }
}
