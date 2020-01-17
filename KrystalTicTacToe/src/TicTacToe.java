public class TicTacToe {
    public static void main(String [] args){
        //make objects
        Gameboard game = new Gameboard();
        AskPlayer inputAns = new AskPlayer();
        DidIWin checkWin = new DidIWin();

        //use objects
        game.printGameboard(game.makeGameboard());
        for(int i = 1; i <= 5; i++) {
            game.addToBoard("X", inputAns.askRow(), inputAns.askCol());
            game.printGameboard(game.getBoard());
        }
    }
}
