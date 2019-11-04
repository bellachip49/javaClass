import java.util.Scanner;

public class theResult {
    public static void main(String [] args){
        int [] list = {1, 2, 3, 4, 5, 6};
        int [] reverseList = new int[list.length];
        int index = 0;

        for(int i = list.length - 1; i >= 0; i--){
            reverseList[index] = list[i];
            System.out.println(reverseList[index]);
            index++;
        }
    }
}
//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15