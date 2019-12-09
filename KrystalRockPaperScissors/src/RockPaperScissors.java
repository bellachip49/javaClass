public class RockPaperScissors {
    public static void main(String [] args){
        //make objects
        GetUserInput usrAns = new GetUserInput();
        PlayGame playGame = new PlayGame();

        //use objects
        playGame.setComputerAnswer();
        playGame.compGenAnswer();
        playGame.answerComparison(usrAns.askForInput());
    }
}
