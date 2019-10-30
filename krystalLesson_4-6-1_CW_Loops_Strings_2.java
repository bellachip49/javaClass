Lesson 4-6-1 CW Loops Strings 2
//Krystal
//10/29/19
//Java

Write code for each of the following problems.  Run it in IntelliJ.  Put the code and output here,
then turn it in.

1. Write code that produces the following output. Include a class with a main method.
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15

public class Problem1{
	public static void main(String [] args){
        int number = 1;
        
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}

//Output
/*1 2 3 4 5 
6 7 8 9 10 
11 12 13 14 15 */

2. Write class and main method with a while loop.  Make an array of int.  Take this number 3509723
and put one digit in each box in the array.  Find the number of digits WITHOUT COUNTING THEM.  Find 
the sum of the digits.

3. Write code to make a 3 by 5 rectangle of @ signs.  Include a class and main method.