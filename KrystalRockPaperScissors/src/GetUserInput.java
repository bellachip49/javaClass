import java.util.Scanner;

class GetUserInput {
    //field
    private Scanner input = new Scanner(System.in);

    //constructor
    GetUserInput(){

    }
    //no getter or setter

    //other methods
    String askForInput(){
        System.out.println("Please enter r for rock, p for paper, or s for scissors:");
        return input.next();
    }
}
