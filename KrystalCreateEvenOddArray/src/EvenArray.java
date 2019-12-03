public class EvenArray {
    //make array here
    //fields (set size of array)
    private int [] list = new int[101];

    //constructor
    EvenArray(){

    }
    //getter
    int [] getEvenArray(){
        return list;
    }

    //setter
    void setEvenArray(){
        for(int i = 0; i < list.length; i++)
        {
            list[i] = i * 2;
        }
    }
}
