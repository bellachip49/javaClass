class SumOfArray {
    //fields
    private int[] myArray = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31};
    private int theSum;

    //constructor
    SumOfArray(){

    }

    //getter
    int [] getMyArray(){
        return myArray;
    }

    //setter
    void setMyArray(int [] newArray){
        for(int i = 0; i < myArray.length; i++){
            newArray[i] = myArray[i];
        }
    }

    //other methods
    int arraySum(int [] newArray){
        for(int i = 0; i < newArray.length; i++){
            theSum += newArray[i];
        }
        return theSum;
    }
}
