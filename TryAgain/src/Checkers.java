public class Checkers {
    String [][] makeGameBoard(){
        String[][] board = new String [8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                board[i][j] = "=";
            }
        }
        return board;
    }
}
