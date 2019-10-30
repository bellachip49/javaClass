import java.util.Scanner;

public class theResult {
    public static void main(String [] args){
        System.out.println("Input Number:");
        System.out.print(">>> ");
        Scanner in = new Scanner(System.in);
        int givenNumber = in.nextInt();

        for(int i = 1; i <= givenNumber; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(givenNumber + " ");
            }
            System.out.println();
        }
    }
}
//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15