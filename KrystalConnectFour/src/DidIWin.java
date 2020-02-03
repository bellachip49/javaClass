import sun.awt.geom.AreaOp;

class DidIWin {
    //field
    private String status = "null";
    private int spaceCount = 0;
    private String compare = ".";

    //constructor
    DidIWin(){

    }

    //getter

    //setter

    //other methods
    String gameStatus(String [][] board, int colNum, int rowNum){ //need to subtract 1 from rowNum for index
        //check win
        spaceCount = 0;
        System.out.println(rowNum + " OOOOOOO");
        while(spaceCount != 1){
            if(rowNum <= 2 || rowNum > 5){
                break;
            }
            else if((board[rowNum][colNum].equals(board[rowNum-1][colNum]) && board[rowNum][colNum].equals(board[rowNum-2][colNum]) && board[rowNum][colNum].equals(board[rowNum-3][colNum])) && (board[rowNum][colNum].equals("X") || board[rowNum][colNum].equals("O"))){
                spaceCount++;
            }
            else{
                break;
            }
        }
        if(spaceCount == 1){
            return status;
        }
//        if((board[0][colNum].equals(board[1][colNum]) && board[0][colNum].equals(board[2][colNum]) && board[0][colNum].equals(board[3][colNum]) && board[0][colNum].equals(board[4][colNum]) && board[0][colNum].equals(board[5][colNum])) && (board[0][colNum].equals("X") || board[0][colNum].equals("O"))){
//
//        }

        //check for tie game
        spaceCount = 0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){ //loop through nested list to check if each index has either X or O
                if(board[i][j].equals("X") || board[i][j].equals("O"))
                    spaceCount++; //add 1 to var measuring how many spaces filled with either symbol
            }
        }
        if(spaceCount == 42){ //if all 42 spaces are filled, set status var to tie
            status = "tie";
        }
        return status;
    }

}
