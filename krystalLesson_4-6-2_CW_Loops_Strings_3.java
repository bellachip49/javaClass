Lesson 4-6-2 CW Loops Strings 3
//Krystal
//10/30/19
//Java

Problem1 Write a class and main method with a nested for loop which makes this pattern:
Sample Output: (Note: there are two spaces beteen the stars and two spaces at the beginning
    of the second and fourth lines)
**  **  **  **
  **  **  **  **
**  **  **  **
  **  **  **  **

public class Problem1{
    public static void main (String [] args){
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 4; j++){
                System.out.print("**  ");
            }
            System.out.println();
            for(int j = 1; j <= 4; j++){
                System.out.print("  **");
            }
            System.out.println();
        }
    }
}

//Output
// **  **  **  **  
//   **  **  **  **
// **  **  **  **  
//   **  **  **  **

Problem2 Write a class and a main method with a for loop that goes through this string and
adds 1, then 2, then 3, then 4 etc for each character(including spaces).  Print the result
String myStr = "I love CCA"; //Start with 0 for first char
//use substring

//didn't use substring
public class Problem2{
    public static void main(String [] args){
        String myStr = "I love CCA";
        int count = 0;
        for(int i = 0; i < myStr.length(); i++){
            count += i;
        }
        System.out.println("The sum is " + count + ".");
    }
}

//Output
//The sum is 45.

//using substring
public class Problem2{
    public static void main(String [] args){
        String myStr = "I love CCA";
        int count = 0;

        for(int i = 0; i <= myStr.length()-1; i++){
            String temp = myStr.substring(i);
            count += (temp.length()-1);
        }
        System.out.println("The sum is " + count + ".");
    }
}

//Output
//The sum is 45.

Problem3 Write a class and a main method with a while loop that prints each digit on a Single 
line with a space in between each number.  Use 2345678
public class Problem3{
    public static void main (String [] args){
        int num = 2345678;

        while(num > 0){
            System.out.print((num % 10) + " ");
            num /= 10;
        }
    }
}

//Output
//8 7 6 5 4 3 2 

Problem4  Write a class and a main method with a while loop that find the sum and the average
of the digits of a number.  Use 3456789
public class Problem4{
    public static void main (String [] args){
        int num = 3456789;
        int sum = 0;
        int digits = 0;

        while(num > 0){
            sum += (num % 10);
            num /= 10;
            digits++;
        }
        System.out.println("The sum is " + sum + ".");
        System.out.println("The average is " + (sum/digits) + ".");
    }
}
//Output
/*The sum is 42.
The average is 6.*/