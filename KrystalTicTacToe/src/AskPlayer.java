import java.util.Scanner;

class AskPlayer {
    //field
    private Scanner input = new Scanner(System.in);
    int col = 4;
    int count = 0;
    int row = 4;

    //constructor
    AskPlayer(){

    }

    //getter

    //setter

    //other methods
    int askRow(){
        while(count == 0) {
            System.out.println("Enter a number from 1-3 for row");
            //subtract 1 to make sure index is correct in the nested array for Gameboard
            row = input.nextInt() - 1;
            if((row < 0) || (row > 3)){
                System.out.println("Invalid input.");
            }
            else{
                break;
            }
        }
        return row;
    }

    int askCol(){
        while(count == 0) {
            System.out.println("Enter a number from 1-3 for column");
            //subtract 1 for index
            col = input.nextInt() - 1;
            if((col < 0) || (col > 3)){
                System.out.println("Invalid input.");
            }
            else{
                break;
            }
        }
        return col;
    }
}
