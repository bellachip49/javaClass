import java.util.Scanner;

class AskForInput {
    //fields
    private Scanner input = new Scanner(System.in);
    private int numOfSides = 0;

    //constructor
    AskForInput(){

    }

    //getter
    int getNumOfSides(){
        return numOfSides;
    }

    //no setter

    //other methods
    int numOfSides(){
        System.out.println("Enter a value for the number of sides on the polygon.");
        numOfSides = input.nextInt();
        return numOfSides;
    }
    double lenOfSide(){
        System.out.println("Enter a value for the length of the side.");
        return input.nextDouble();
    }
}
