import java.lang.Math.*;

class PlayGame {
    //fields
    private String computerAnswer;
    private int max = 3;
    private int min = 1;
    private int range = max - min + 1;
    private int rand;

    //constructor
    PlayGame(){

    }
    //getter
    String getComputerAnswer(){
        return computerAnswer;
    }

    //setter
    void setComputerAnswer(){
        rand = (int)(Math.random() * range) + min;
        if(rand == 1){
            computerAnswer = "r";
        }
        else if(rand == 2){
            computerAnswer = "p";
        }
        else{
            computerAnswer = "s";
        }
    }

    //other methods
    void answerComparison(String usrGuess){ //computer has a set answer
        if(usrGuess.equalsIgnoreCase(computerAnswer)){
            System.out.println("It's a draw.");
        }
        else if(usrGuess.equalsIgnoreCase("s")){
            System.out.println("Computer wins. Rock beats scissors.");
        }
        else if(usrGuess.equalsIgnoreCase("p")){
            System.out.println("User wins. Paper beats rock.");
        }
        else{
            System.out.println("Invalid input.");
        }
    }

    void compGenAnswer(){
        if(rand == 1){
            computerAnswer = "r";
        }
        else if(rand == 2){
            computerAnswer = "p";
        }
        else{
            computerAnswer = "s";
        }
    }
}
