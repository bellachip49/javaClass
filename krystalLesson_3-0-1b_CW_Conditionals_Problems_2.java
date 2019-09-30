//Lesson 3-0-1b CW Conditionals_Problems_2
//Name: Krystal Kwan
//Date: 9/13/19
//Class: Java

//Problem 1: Write a Java program with a conditional that gets the following numbers from a user and prints whether it is positive or negative:
//Test data: 1, 0, -5, 6, -8
public class Problem1{
	public static void main(String [] args){
		int userInput = something;
		if( userInput < 0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is positive");
		}
	}

}
//answers to problem 1
// 1 The number is positive
// 0 The number is positive
// -5 The number is negative
// 6 The number is positive
// -8 The number is negative


//Problem 2: Take three numbers from the user and print the greatest number
//Test data: 
/*
group 1: 25, 78, 87 
group 2: -15, 0, 5
group 3: 12, 24, 168
*/
public class Problem2{
	public static void main(String [] args){
		int num1 = input1;
		int num2 = input2;
		int num3 = input3;

		if((num1 > num2) && (num1 > num3))
		{
			System.out.println("The greatest number is " + num1);
		}
		else if((num2 > num1) && (num2 > num3))
		{
			System.out.println("The greatest number is " + num2);
		}
		else
		{
			System.out.println("The greatest number is " + num3);
		}
	}
}
//answers to problem 2
//group 1: The greatest number is 87
//group 2: The greatest number is 5
//group 3: The greatest number is 168

Two things:
inclusive means given a range of numbers include the end points
range 50 to 100, this will mean 51 to 99
range 50 to 100 inclusive, this will mean 50 to 100
+ can mean add or it can mean concatenate, ++ means increment
design principle: use the fewest lines of code possible AS LONG AS another programmer can easily read your code


//Problem 3: Write a Java program that takes a number between 1 and 7 inclusive from the user, then displays the name of the weekday
//corresponding to that number.  Example Sunday is 1
public class Problem3 {
	public static void main(String [] args){
		int number = input;

		if(number = 1)
		{
			System.out.println("Sunday");
		}
		else if(number = 2)
		{
			System.out.println("Monday");
		}
		else if(number = 3)
		{
			System.out.println("Tuesday");
		}
		else if(number = 4)
		{
			System.out.println("Wednesday");
		}
		else if(number = 5)
		{
			System.out.println("Thursday");
		}
		else if(number = 6)
		{
			System.out.println("Friday");
		}
		else if(number = 7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("The inputted number is invalid.")
		}
    }
}


//Problem 4:: Write a Java program that reads a number and prints "zero" if the number is zero.  Otherwise it prints "positive" or "negative".  
//Bonus points: if you add code which will add "small" if the value of the number is less than 5 or large if the value of 
//the number is greater than 10000.
public class Problem4 {
	public static void main(String [] args){
		int number;

		if(number = 0)
		{
			System.out.println("The number is zero.");
		}
		else if(number > 0)
		{
			if(number < 5)
			{
				System.out.println("The number, " + number + ", is small and positive.");
			}
			else if(number > 10000)
			{
				System.out.println("The number, " + number + ", is large and positive.");
			}
			else{
				System.out.println("The number, " + number + ", is positive.");
			}
		}
		else
		{
			System.out.println("The number, " + number + ", is small and negative.");
		}
	}
}




