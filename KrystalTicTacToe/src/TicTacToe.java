public class TicTacToe {
    public static void main(String [] args){
        //make objects
        Gameboard game = new Gameboard();
        AskPlayer inputAns = new AskPlayer();
        DidIWin checkWin = new DidIWin();

        //use objects
        game.printGameboard(game.makeGameboard());

        //loop until win or tie occurs
        for(int i = 1; i <= 10; i++) {
            game.addToBoard("X", inputAns.askRow("Player 1"), inputAns.askCol());
            game.printGameboard(game.getBoard());
            if((checkWin.gameStatus(game.getBoard())).equals("win")){
                System.out.println("\nPlayer 1 wins.");
                break;
            }
            if((checkWin.gameStatus(game.getBoard())).equals("tie")){
                System.out.println("\nTie Game.");
                break;
            }
            game.addToBoard("O", inputAns.askRow("Player 2"), inputAns.askCol());
            game.printGameboard(game.getBoard());
            if((checkWin.gameStatus(game.getBoard())).equals("win")){
                System.out.println("\nPlayer 2 wins.");
                break;
            }
        }
        //README
        /*
        TicTacToe class:
        keeps looping until there is a win or tie game
        1. Asks player 1 for board coordinates
        2. Prints out current game board
        3. Checks if player 1 made a three in a row, breaks loop if win
        4. Checks for a tie game (all spaces on the board are filled) breaks loop if tied
        5. Asks player 2 for board coordinates
        6. Prints out current game board
        7. Checks if player 2 made a three in a row, breaks loop if win

        Gameboard class:
        makes board with nested list
        prints board
        adds symbols to board using user input
        turn is invalid if user inputs coordinates that are already taken (turn is skipped)

        AskPlayer class:
        asks player for board coordinates (col = column number, row = row number)
        keeps asking player for number if input is invalid
        returns input for row
        return input for column

        DidIWin class:
        check if either player wins, or if there is a tie
        status variable indicates a win or tie, and "null" if nothing happens, then returns value to main
        how the for loop (to check win) works:
        HORIZONTAL three in a row:
        checks if each space in row "i" is equal
        VERTICAL three in a row:
        checks if each space in column "i" is equal
        DIAGONAL three in a row:
        compares center value with other symbols that form a diagonal with it
         */
    }
}
