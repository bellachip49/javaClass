import java.util.Scanner;

public class numberDigits {
    public static void main(String [] args){
        int digitCounter = 0;
        System.out.println("Input Number:");
        System.out.print(">>> ");
        Scanner in = new Scanner(System.in);
        int givenNumber = in.nextInt();

        for(int i = givenNumber; i != 0; i /= 10){
            digitCounter++;
        }
        if(givenNumber == 0)
        {
            System.out.println("The number is a 1 digit number.");
        }
        else
        {
            System.out.println("The number is a " + digitCounter + " digit number.");
        }
    }
}
