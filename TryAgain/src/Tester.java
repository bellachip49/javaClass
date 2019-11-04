public class Tester {
    public static void main(String [] args){
        int number = 3509723;
        int [] myArray = new int[8];
        int digit;
        int index = 7;
        int sumOfDigits = 0;
        int countOfDigits = 0;

        while(number > 0){
            digit = number % 10;
            sumOfDigits += digit;
            System.out.println("digit is " + digit);
            countOfDigits++;
            number /= 10;
            //System.out.println("temp is " + temp);
            myArray[index] = digit;
            index--;
        }
        System.out.println("The sum is " + sumOfDigits + ". The number of digits is " + countOfDigits);
    }
}
