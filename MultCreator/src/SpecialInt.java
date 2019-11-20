import java.util.Scanner;

public class SpecialInt {
    //field
    private int myInt = 9;
    //constructor
    SpecialInt(){

    }
    //method
    int getMyInt(){
        return myInt;
    }
    void setMyInt(int newmyInt){
        this.myInt = newmyInt;
    }

    int getIntFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: \n>>> ");

        return input.nextInt();
    }
}
