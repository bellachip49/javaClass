import java.util.Scanner;

class GetDataClass {
    //fields
    Scanner input = new Scanner(System.in);

    //constructor
    GetDataClass(){}

    //make getData method which returns the user's input
    /*Engineer's format:
    //Purpose: get a string from a user
    //Preconditions: Ask the user for String data
    //Postconditions: have gotten String value from user
    //return user inputted string
     */
    String getData(){
        System.out.println("Please enter CHICKADEE, ROBIN, FINCH, PARAKEET, CANARY");
        return input.nextLine();
    }
}
