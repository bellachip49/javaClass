//Lesson 4-1-1 For Loop Probs 1
//Krystal
//10/1/19
//JAVA

//Complete the following Java problems using a for loop


//Problem1 Write a class named Problem1 with a main method and a for loop that counts upward from 1 to 10, each value on its own line.
public class Problem1{
	public static void main(String [] args){
		for(int i = 1; i < 11; i++){
			System.out.println(i);
		}
	}
}
//Output
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10

//Problem2 Write a class named Problem2 with a main method and a for loop that counts upward from -1 to 9 on one line with spaces between the numbers.
public class Problem2{
	public static void main(String [] args){
		for(int i = -1; i < 10; i++){
			System.out.print(i + " ");
		}
	}
}
//Output
//-1 0 1 2 3 4 5 6 7 8 9

//Problem3 Write a class named Problem3 with a main method and a for loop that prints all the even numbers from 0 to 50, inclusive,
// on one line with spaces between the numbers.
public class Problem3{
	public static void main(String [] args){
		for(int i = 0; i < 52; i += 2){
			System.out.print(i + " ");
		}
	}
}
//Output
//0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 

//Problem4 Write a class named Problem4 with a main method and a for loop that prints all the numbers from 1 to 20 on a single line with spaces between then
// prints the sum of 1 to 20 inclusive.
public class Problem4{
	public static void main(String [] args){
        int sum = 0;

        for(int i = 0; i < 21; i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe sum is " + sum + ".");
    }
}
//Problem5 Write a class named Problem5 with a main method and a for loop that prints 5 rows of 7 stars (Suggestion: make a String of stars)
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
public class Problem5{
	public static void main(String [] args){
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 8; j++){
                System.out.print("* "); //I knew how to use a nested loop, so I made a nested loop
            }
            System.out.print("\n");
        }
    }
}
//Output
// * * * * * * *
// * * * * * * *
// * * * * * * *
// * * * * * * *
// * * * * * * *

//Another answer, but using a string of stars
public class Problem5{
    public static void main(String [] args){
        String starString = "* * * * * * *";
        for(int k = 1; k < 6; k++){
            System.out.println(starString);
        }
    }
}

//Output
// * * * * * * * 
// * * * * * * * 
// * * * * * * * 
// * * * * * * * 
// * * * * * * * 

//Problem6 Write a class named Problem6 with a main method and a for loop that finds the factorial of any number entered through the keyboard.
//factorial of 5 is 1 * 2 * 3 * 4 * 5
public class Problem6{
	public static void main(String [] args){
        int n = 8;
        int output = 1;

        for(int i = n; i > 0; i--){
            output *= i;
        }
        System.out.println("The factorial of " + n + " is " + output + ".");
    }
}
//Output
//The factorial of 8 is 40320.

//Problem7 Write a class named Problem7 with a main method and a for loop to find the average of the number 17 to 25
public class Problem7{
    public static void main(String [] args){
        int sum = 0;
        int mean = 0;

        for(int i = 17; i <= 25; i++){
            sum += i;
            mean++;
        }
        mean = sum / mean;
        System.out.println("The average is " + mean + ".");
    }
}
//Output
//The average is 21.

//Problem8 Write a class named Problem8 with a main method and a for loop to find the sum of the odd numbers from 1 to 15
public class Problem8{
    public static void main(String [] args){
        int sum = 0;

        for(int i = 1; i <= 15; i += 2){
            sum += i;
        }
        System.out.println("The sum of the odd numbers from 1 to 15 is " + sum + ".");
    }
}
//Output
//The sum of the odd numbers from 1 to 15 is 64.

//Problem9 Write a class named Problem4 with a main method and a for loop to print each letter of this String: 
//"Crosspoint Academy" with a space between the letters on the same line
public class Problem9{
    public static void main(String [] args){
        String name = "Crosspoint Academy";

        for(int i = 0; i <= (name.length() - 1); i++){
            System.out.print(name.charAt(i) + " ");
        }
    }
}
//Output
//C r o s s p o i n t   A c a d e m y 
//Problem10  Write a class named Problem5 with a main method and a for loop that prints each value in the following array with one value per line:
int [] primeArray = {2, 3, 5, 7, 11, 13, 17, 23, 29};

public class Problem10{
    public static void main(String [] args){
        for(int i = 0; i <= (primeArray.length - 1); i++){
            System.out.println(primeArray[i]);
        }
    }
}
//Output
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 23
// 29

//Problem11 Write a class named Problem6 with a main method and a for loop that subtracts 2 to each value in the 
//following array, then prints those values on a single line with spaces between the numbers:
int [] primeArray = {2, 3, 5, 7, 11, 13, 17, 23, 29};
public class Problem11{
    public static void main(String [] args){
        for(int i = 0; i <= (primeArray.length - 1); i++){
            System.out.print(primeArray[i]-2 + " ");
        }
    }
}
//Output
//0 1 3 5 9 11 15 21 27 

//Problem12 Write a class named Problem4 with a main method and a for loop that subtracts 2 to each value in the 
//following array, then puts those values into a new array called primeArray2
int [] primeArray = {2, 3, 5, 7, 11, 13, 17, 23, 29};
public class Problem12{
    public static void main(String [] args){
        int [] newArray = new int[primeArray.length];

        for(int i = 0; i <= primeArray.length -1; i++){
            newArray[i] = primeArray[i] - 2;
        }

        for(int j = 0; j <= primeArray.length -1; j++){
            System.out.println(newArray[j]);
        }
    }
}
//Output
// 0
// 1
// 3
// 5
// 9
// 11
// 15
// 21
// 27

//Problem13 Write a class named Problem4 with a main method and a for loop that takes a number and find the number of digits (ASK MRS C FOR HELP HERE)
public class Problem13{
    public static void main(String [] args){
        int givenNumber = insert number here;
        int digitCounter = 0;

        for(int i = givenNumber; i != 0; i /= 10){
            digitCounter++;
        }
        if(givenNumber == 0)
        {
            System.out.println("The number is a 1 digit number.");
        }
        else
        {
            System.out.println("The number is a " + digitCounter + " digit number.");
        }
    }
}
//Output
//Example number: 123456789
//The number is a 9 digit number.

//Problem14 Write a class named Problem4 with a main method and a for loop takes the numbers 1 to 21 inclusive and find both the average and the sum
public class Problem14{

}
//Problem15 Write a class named Problem4 with a main method and a for loop that takes the numbers 1 to 10 and prints the sum of the cubes of those numbers
public class Problem15{
    public static void main(String [] args){
        int cubedSum = 0;

        for(int i = 1; i <= 10; i++){
            cubedSum += (i * i * i);
        }
        System.out.println("The sum of the cubed integers from 1 to 10 is " + cubedSum + ".");
    }
}
//Output
//The sum of the cubed integers from 1 to 10 is 3025.

EXTRA CREDIT PROBLEM:  DO NOT TALK TO CLASSMATES OR LOOK ON INTERNET FOR THIS PROBLEM.  ALSO MRS C WILL NOT ANSWER QUESTIONS ABOUT THIS PROBLEM
//Write a class named ECProblem with a main method and a for loop that calculates the sum of the following series where n is input by the user
1 + 1/2 + 1/3 + 1/4 + ... + 1/n

public class ECProblem{
	public static void main(String [] args){
        int n = insert some number here;
        double sum = 0;

        for(double i = 1.0; i <= n; i++){
            sum += (double)(1/i);
        }
        System.out.println(sum);
    }
}
//Output
//Example: n = 5;
//The sum is 2.283333333333333.

