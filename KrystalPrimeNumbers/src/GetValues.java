import java.util.Scanner;

class GetValues {
    //fields
    Scanner input = new Scanner(System.in);
    private int max;

    //constuctor
    GetValues(){

    }

    //getter

    //setter

    //other methods
    int getMinFromUser(){
        System.out.print("Enter a minimum value: ");
        return (int)input.nextDouble();
    }
    int getMaxFromUser(int theMin){
        System.out.print("Enter a maximum value: ");
        max = (int)input.nextDouble();
        while(theMin > max) {
            System.out.println("Invalid Value. Max must be greater or equal to min number. \n");
            System.out.println("Enter a maximum value: ");
            max = (int)input.nextDouble();
        }
        return max;
    }


}
