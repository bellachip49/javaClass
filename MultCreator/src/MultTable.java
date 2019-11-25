public class MultTable {
    //fields
    private int anotherInt;  //any name for the int is okay

    //constructor
    MultTable()  //do not use the name of the constructor for the name of another method
    {}
    //getters & setters
    int getThatInt()  //any name is okay as long as it has the word get in it
    {
        return anotherInt;
    }
    void setThatInt(int newInt)  //can name newInt any name you want
    {
        this.anotherInt = newInt;
    }

    //other methods
    void makeMultTable(int myInt) {
        System.out.println("\nThis is the multiplication table for " + myInt + ".");
        for(int i = 0; i < 13; i++)
        {
            System.out.println(myInt + " * " + i + " = " + myInt*i);
        }
        System.out.println();
    }
}