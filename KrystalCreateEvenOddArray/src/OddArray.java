public class OddArray {
    //field
    private int index = 0;
    //change array here; don't define it
    //code written by Jason, changed by Krystal
    OddArray(){

    }

    //getter
    int [] getList(int [] newList){
        return newList;
    }

    //setter
    int [] setList(int [] newList){
        return newList;
    }

    //make array odd
    int [] changeToOdd(int[] newList) {
        for (int i = 0; i < newList.length; i++) {
            newList[i]++;
        }
        return newList;
    }

    //print the array
    void printAnArray(int [] newList) {
        for (int i = 0; i < newList.length; i++) {
            for(int j = 1; j < 11; j++){
                if(index >= 101){
                    break; //break out of inner loop
                }
                System.out.print(newList[index] + " ");
                index++;
            }
            if(index >= 101){
                break; //break out of outer loop (loop is layered/nested)
            }
            System.out.println();
        }
    }
}