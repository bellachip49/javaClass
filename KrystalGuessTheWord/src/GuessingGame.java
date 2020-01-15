import java.util.Scanner;

class GuessingGame {
    //fields
    private int guesses = 5;
    private Scanner input = new Scanner(System.in);

    //constructor
    GuessingGame(){

    }

    //no getter or setter

    //other methods
    void startGame(String correctAns){
        System.out.println("This is a color guessing game. \nPossible colors are primary, secondary, and rainbow colors. \nYou are given " + guesses + " attempts to guess the correct color.\n");
        while(guesses > 0) {
            System.out.println("Please enter a guess for the color. SPELLING COUNTS.");
            String colorGuess = input.nextLine();
            if(colorGuess.equalsIgnoreCase(correctAns)){
                System.out.println("The answer was " + correctAns + ". You are correct.");
                break;
            }
            else{
                guesses--;
                if(guesses == 1){
                    System.out.println("The answer was wrong. You have 1 attempt left.");
                }
                else{
                    if(guesses == 0){
                        System.out.println("No more attempts can be made. \nYou have lost the game. The correct color was " + correctAns + ".");
                        break;
                    }
                    System.out.println("The answer was wrong. You have " + guesses + " attempts left.");
                }
            }
        }

    }
}
