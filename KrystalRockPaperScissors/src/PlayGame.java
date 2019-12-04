class PlayGame {
    //fields
    String computerAnswer = "r";
    //constructor
    PlayGame(){

    }
    //no getters or setters

    //other methods
    void answerComparison(String usrGuess){
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
}
