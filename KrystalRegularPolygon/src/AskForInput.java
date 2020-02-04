import java.util.Scanner;

class AskForInput {
    //fields
    private Scanner input = new Scanner(System.in);
    private int numOfSides = 0;
    private double sideLen = 0;

    //constructor
    AskForInput(){

    }

    //getter
    int getNumOfSides(){
        return numOfSides;
    }

    //no setter

    //other methods
    int numOfSides() {
        System.out.println("Enter a value for the number of sides on the polygon.");
        for (; numOfSides <= 2;){
            numOfSides = input.nextInt();
            if(numOfSides <= 2){
                System.out.println("Invalid Input.");
                System.out.println("Enter a value for the number of sides on the polygon.");
            }
        }
        return numOfSides;
    }
    double lenOfSide(){
        System.out.println("Enter a value for the length of the side.");
        for(; sideLen < 1;){
            sideLen = input.nextDouble();
            if(sideLen < 1){
                System.out.println("Invalid Input.");
                System.out.println("Enter a value for the length of the side.");
            }
        }
        return sideLen;
    }
}
