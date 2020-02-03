class Gameboard {
    //fields
    private String [][] board = new String[6][7];
    private int recordedRow = 0;

    //constructor
    Gameboard(){

    }

    //getter
    String[][] getBoard(){
        return board;
    }

    int getRecordedRow(){
        return recordedRow;
    }

    //setter

    //other methods
    String[][] makeGameboard(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                board[i][j] = "."; //set each index in nested list to . (default value when no symbols are assigned)
            }
        }
        return board;
    }

    void printGameboard(String [][] givenBoard){ //used to print out current status of the board
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(givenBoard[i][j] + " "); //print out board with nested loop
            }
            System.out.println();
        }
    }

    void addMove(String symbol, int col){
        recordedRow = 9;
        for(int i = 5; i >= 0; i--){
            if(board[i][col].equals(".")){
                recordedRow = i;
                board[i][col] = symbol;
                break;
            }
            if(!(board[0][col].equals("."))){
                System.out.println("Turn was skipped. The entire column is already occupied.");
                break;
            }
        }
    }
}
