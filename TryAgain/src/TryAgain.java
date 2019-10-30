public class TryAgain {
    public static void main (String [] args){
        //{1, 2, 3, 4, 5, 6}
        int [] oldList = {1, 2, 3, 4, 5, 6};
        int [] newList = new int[5];
        int index = 5;
        for(int i = 5; i >= 0; i--){
            newList[index-1] = oldList[i];
            System.out.println(newList[index-1]); //prints out each value in the old list from first to last index
        }
    }
}
