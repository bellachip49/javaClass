import java.util.Scanner;
public class GetSecondNumber {
    //field
    private int num2;
    private Scanner input = new Scanner(System.in);

    //constructor
    GetSecondNumber(){

    }

    //getter
    int getNum2(){
        return num2;
    }

    //setter
    void setNum2(){
        this.num2 = num2;
    }

    //other methods
    int askSecond(){
        System.out.println("Enter second integer:");
        num2 = input.nextInt();
        System.out.println(num2);
        return num2;
    }
}
