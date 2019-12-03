import com.sun.media.sound.SF2InstrumentRegion;

import java.util.Scanner;
public class GetFirstNumber {
    //fields
    private int num1;
    Scanner input = new Scanner(System.in);

    //constructor
    GetFirstNumber(){

    }

    //getter
    int getNum1(){
        return num1;
    }

    //setter
    void setNum1(int newNum){
        this.num1 = newNum;
    }

    //other methods
    int askFirst(){
        System.out.println("Enter first integer:");
        num1 = input.nextInt();
        System.out.println(num1);
        return num1;
    }
}
