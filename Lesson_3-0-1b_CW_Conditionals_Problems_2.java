//Lesson 3-0-1b CW Conditionals_Problems_2
//Name: Krystal Kwan
//Date: 9/13/19
//Class: Java

//Problem 1: Write a Java program with a conditional that gets the following numbers from a user and prints whether it is positive or negative:
//Test data: 1, 0, -5, 6, -8
public class Problem1{
	public static void main(String [] args){
		int userInput = whatever
		if( userInput < 0)
		{
			System.out.print("The number is negative");
		}
		else
		{
			System.out.print("The number is positive");
		}


	}

}
//answers to problem 1
// 1 
// 0
// -5
// 6
// -8


//Problem 2: Take three numbers from the user and print the greatest number
//Test data: 
/*
group 1: 25, 78, 87 
group 2: -15, 0, 5
group 3: 12, 24, 168
*/
public class Problem2{
	public static void main(String [] args){
		int num1 = something
		int num2 = something
		int num3 = something

		if(num1 > num2 && num1 > num3)
		{
			System.out.println("num1 is the greatest");
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println("num2 is the greatest");
		}
		else
		{
			System.out.println("num3 is the greatest");
		}
	}
}
//answers to problem 2
//group 1: 
//group 2:
//group 3:

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
		int userInput = dayName;  //dayName is an int value entered by the user.  Not shown in this code.
		
        if(day == 1)
        {
            System.out.println("Day number 1 is Sunday");
        }
        else if(day == 2)
        {
            System.out.println("Day number 2 is Monday");
        }
        
        else if(day == 3)
        {
            System.out.println("Day number 3 is Tuesday");
        }
        
        else if(day == 4)
        {
            System.out.println("Day number 4 is Wednesday");
        }
        
        else if(day == 5)
        {
            System.out.println("Day number 5 is Thursday");
        }
        
        else if(day == 6)
        {
            System.out.println("Day number 6 is Friday");
        }
        
        else
        {
            System.out.println("Day number 7 is Saturday");
        }
    }
}


//Problem 4:: Write a Java program that reads a number and prints "zero" if the number is zero.  Otherwise it prints "positive" or "negative".  
//Bonus points: if you add code which will add "small" if the value of the number is less than 5 or large if the value of 
//the number is greater than 10000.
public class Problem4 {
	public static void main(String [] args){
		int userInput = numberValue;  //numberValue is entered by the user.  The code for this is not shown here.
		/* I separated the zones.  There is a zone between 0 and 5, there is one less than zero, 
		there is one greated than 10000 and there is between 5 and 10000
		*/

		if( userInput == 0)
		{
			System.out.println("The number is zero");  //deal with the special case first...ONLY ONE VALUE
		}
		else if (userInput < 5  && userInput > 0)
		{
			System.out.println("The number is postive and small");  //next smallest case, number between 0 and 5
		}
		else if(userInput > 10000)
		{
			System.out.println("The number is positive and large");  //next largest group > 10000
		}
		else if (userInput < 0)
		{
			System.out.println("The number is negative and small"); //next largest group < 0
		}
	    else 
	    {
	    	System.out.println("The number is positive");  //everything else
	    }
	}
}

