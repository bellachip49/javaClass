//Lesson 4-0-3 HW While loops Probs
//Krystal
//10/4/19
//Java

//Write Java class to solve each of the following problems using a while loop

//Problem1 Write a class and main method that counts down from 10 to 1 inclusive, prints each number on a separate line, then prints the String Blast Off.
public class Problem1{
	public static void main(String [] args){
		int i = 10;

        (while i >= 1){
            System.out.println(i);
            i++;
        }
        System.out.println("Blast off!");
    }
}
//Problem2 Write a class and main method that prints on a new line a String removing the first letter each time.  Use this String: "Crosspoint"
Example:
Cross
ross
oss
ss
s
public class Problem2{
	public static void main(String [] args){
        String myString = "Crosspoint";
        int i = 0;

        while(i < myString.length()){
        	System.out.println(myString.substring(i));
        	i++;
        }
    }
}
//Output
// Crosspoint
// rosspoint
// osspoint
// sspoint
// spoint
// point
// oint
// int
// nt
// t
//Problem3 Write a class and main method that prints on a new line a String removing the last letter each time. Use this String "Academy"
Example:
crayon
crayo
cray
cra
cr
c
public class Problem3{
	public static void main(String [] args){
        String myString = "Crosspoint";
        int i = myString.length();

        while(i >= 0){
            System.out.println(myString.substring(0, i));
            i--;
        }
    }
}
//Output
// Crosspoint
// Crosspoin
// Crosspoi
// Crosspo
// Crossp
// Cross
// Cros
// Cro
// Cr
// C

//Problem4 Write a class and main method that that take a String and puts each letter, in order, into an array named StringLetters
public class Problem4{
	public static void main(String [] args){
        String myString = "Hello Java";
        char [] stringLetters = new char[myString.length()];
        int i = 0;

        while(i < myString.length()){
            stringLetters[i] = myString.charAt(i);
            System.out.println(stringLetters[i]);//printed out each item in the array
            i++;
        }
    }
}
//Output
// H
// e
// l
// l
// o
 
// J
// a
// v
// a

//Problem5 Write a class and main method that that prints the numbers 21 to 31 on one line with spaces in between, then prints both the sum and the 
// average of the numbers 
public class Problem5{
	public static void main(String [] args){
        int sum = 0;
        int average = 0;
        int i = 21;

        while(i <= 31){
           System.out.print(i + " ");
           sum += i;
           average++;
           i++;
        }
        average = sum / average;
        System.out.println("\nThe sum is " + sum + ".");
        System.out.println("The average is " + average + ".");
    }
}
//Output
// 21 22 23 24 25 26 27 28 29 30 31 
// The sum is 286.
// The average is 26.

//Problem6 Write a class and main method that takes this an array named myArray with the values {2, 3, 5, 6, 8, 11}, finds the cube of each number,
prints the cube on a separate line, then prints the sum of the cubes.
public class Problem6{
	public static void main(String [] args){
        int [] myArray = {2, 3, 5, 6, 8, 11};
        int i = 0;
        int sum = 0;

        while(i < myArray.length){
            System.out.println(i * i * i);
            sum += i * i * i;
            i++;
        }
        System.out.println("The sum is " + sum + ".");
    }
}
//Output
// 0
// 1
// 8
// 27
// 64
// 125
// The sum is 225.

//Problem7 Write a class and main method that finds the sum of a set of numbers given a first and a last number where first < last.  Example:
7 and 11, or 8 and 17, or 91 and 105
public class Problem7{
	public static void main(String [] args){
        int num1 = some number;
        int num2 = another number;
        int i = num1;
        int sum = 0;

        while(i <= num2){
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum + ".");
    }
}
//Output
//Num 1 is 1
//Num 2 is 3
//
// 1
// 2
// 3
// The sum is 6.

//Problem8 Write a class and main method that make a block of letters given a letter, a width and a numberOfRows:  
//(Simple version: make a String with the letter & width manually, "a a a a"; can you think of a second way to do it?)
Example:
a a a a
a a a a
a a a a
public class Problem8{
	public static void main(String [] args){
		int numberOfRows = number;
		String width = "a a a a";
		int i = numberOfRows;

		while(i <= numberOfRows){
			System.out.println(width);
			i++;
		}
	}
}
//Output
// number of rows is 3
// a a a a
// a a a a
// a a a a

public class Problem8{
	public static void main(String [] args){
        int numberOfRows = number;
        int width = number;
        String letterA = "a ";
        int i = 0;
        int j = 0;

        while(i <= numberOfRows){
            while(j <= width){
                System.out.print(letterA);
                j++;
            }
            j = 0;
            System.out.print("\n");
            i++;
        }
    }
}
//Output
//number of rows is 5
//width is 3
// a a a a 
// a a a a 
// a a a a 
// a a a a 
// a a a a 
// a a a a 
