public class ArrayExample {
    //fields
    int[] intArray = {2, 4, 5, 6, 10};  //includes declaration, instantiation & initialization
    double [] doubArray = new double[10];  //includes declaration and instantiation only
    int[][] nestArray;
    //constructor
    ArrayExample(){

    }

    //getters
    int[] getIntArray()
    {
        return intArray;
    }

    //write the doubArray getter here:
    public double[] getDoubArray() {
        return doubArray;
    }

    //setters
    void setIntArray(int[] newArray)
    {
        for(int i = 0; i < newArray.length; i++)
        {
            intArray[i] = newArray[i];
        }
    }
    //write the doubArray setter here:

    //other methods
    void printArray()
    {}

    void changeArray()
    {}

    int[][] makeNestedArray()
    {
        return nestArray;
    }
}
