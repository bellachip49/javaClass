import java.util.Scanner;

class Side {
    //fields
    private Scanner input = new Scanner(System.in);

    //no getter or setter

    //other methods
    double getSide(){
        System.out.println("Enter a value for the length of the side.");
        return input.nextDouble();
    }

}
