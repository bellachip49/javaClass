public class GuessTheWord {
    public static void main(String [] args){
        //make objects
        WordGenerator someColor = new WordGenerator();
        GuessingGame makeGuess = new GuessingGame();

        //use objects
        //makeGuess.startGame(someColor.findColor());
        System.out.println(someColor.findColor()); //line of code to check random color generator
    }
}
