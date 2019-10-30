public class Tester {
    public static void main(String [] args){
        int number = 3509723;
        int [] myArray = new int[10];
        int temp = number;
        int digit;
        int count = 10;

        while(temp > 0){
            digit = temp % 10;
            //System.out.println("digit is " + digit);
            temp /= 10;
            //System.out.println("temp is " + temp);
            myArray[count] = digit;
            count--;
        }
        for(int i = 9; i > 0; i++){
            System.out.print(myArray[i]);
        }
    }
}
