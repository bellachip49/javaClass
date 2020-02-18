import java.util.Scanner;

class GetValues {
    //fields
    Scanner input = new Scanner(System.in);

    //constructor
    GetValues(){

    }

    //getter

    //setter

    //other methods
    int getMinFromUser(){
        System.out.println("Enter a minimum value: ");
        int min = (int) input.nextDouble();
        while(min < 1){
            System.out.println("Invalid Value. Minimum must be greater than 1.");
            System.out.println("Enter a minimum value: ");
            min = (int)input.nextDouble();
        }
        return min;
    }
    int getMaxFromUser(int theMin){
        System.out.println("Enter a maximum value: ");
        int max = (int) input.nextDouble();
        while((theMin > max) || (max < 1)) {
            System.out.println("Invalid Value. Max must be greater or equal to min number. \nIt also cannot be less than 1.  \n");
            System.out.println("Enter a maximum value: ");
            max = (int)input.nextDouble();
        }
        return max;
    }


}
