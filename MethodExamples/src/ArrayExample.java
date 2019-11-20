public class ArrayExample {
    //fields
    int[] intArray = {2, 4, 5, 6, 10};  //includes declaration, instantiation & initialization
    double [] doubArray = new double[10];  //includes declaration and instantiation only
    int[][] nestArray = new int[3][3];
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
    public void setDoubArray(double[] newArray) {
        for(int i = 0; i < newArray.length; i++){
            doubArray[i] = newArray[i];
        }
    }

    //other methods
    void printArray(int [] intnewArray)
    {
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    int[][] createNestedArray(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                nestArray[i][j] = 5;
            }
            System.out.println();
        }
        return nestArray;
    }
    void printNestedArray(int[][] newArray){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    void changeArray()
    {}

    int[][] makeNestedArray()
    {
        return nestArray;
    }
}
