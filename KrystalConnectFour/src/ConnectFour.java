public class ConnectFour {
    public static void main(String [] args){
        //make objects
        Gameboard game = new Gameboard();
        AskPlayer findCol = new AskPlayer();
        DidIWin matchResult = new DidIWin();

        //use objects
        //print out empty gameboard at startup

        //!!!!vertical check isn't working!
        game.printGameboard(game.makeGameboard());
        for(int i = 1; i <= 39; i++){
            game.addMove("X", findCol.askCol("Player 1"));
            game.printGameboard(game.getBoard());
            if((matchResult.gameStatus(game.getBoard(), findCol.getCol(), game.getRecordedRow())).equals("win")){
                System.out.println("\nPlayer 1 wins.");
                break;
            }
            game.addMove("O", findCol.askCol("Player 2"));
            game.printGameboard(game.getBoard());
            if((matchResult.gameStatus(game.getBoard(), findCol.getCol(), game.getRecordedRow())).equals("win")){
                System.out.println("\nPlayer 2 wins.");
                break;
            }
            if((matchResult.gameStatus(game.getBoard(), findCol.getCol(), game.getRecordedRow())).equals("tie")){
                System.out.println("\nTie Game.");
                break;
            }
        }
        /*
        only ask for column
        if already filled to the top, skip turn
         */
    }
}
