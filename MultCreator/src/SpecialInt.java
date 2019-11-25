import java.util.Scanner;

class SpecialInt {

    //fields
    private int myInt = 4;  //any name for the int is okay

    //constructor
    SpecialInt()  //do not use the name of the constructor for the name of another method
    {}

    //getters & setters
    int getThatInt()  //any name is okay as long as it has the word get in it
    {
        return myInt;
    }
    void setThatInt(int newInt)  //can name newInt any name you want
    {
        this.myInt = newInt;
    }
    //methods
    int getIntFromUser()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer between 1 and 1000");
        return input.nextInt();
    }
}
