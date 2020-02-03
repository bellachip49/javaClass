import java.util.Scanner;

class AskPlayer {
    //field
    private Scanner input = new Scanner(System.in);
    private int col = 0;
    private int count = 0;

    //constructor
    AskPlayer(){

    }

    //getter
    int getCol(){
        return col;
    }

    //setter

    //other methods
    int askCol(String playerNum){
        while(count == 0) {
            System.out.println(playerNum + ", enter a number from 1-7 for column");
            //subtract 1 for index
            col = input.nextInt() - 1;
            if((col < 0) || (col > 7)){
                System.out.println("Invalid input."); //continue to loop until player inputs a valid column number
            }
            else{
                break;
            }
        }
        return col;
    }
}
