//Lesson 3-0-0 HW Intro to Conditionals
//Name: Krystal
//Date: 9/4/19
//Class: Java


//Using conditionals, write code to solve the following problems.
/* Problem 1: Take values of length and breadth of a rectangle from user and check if it is square or not.*/
public class squareDetector{
	public static void main(String[] args){
		int length;
		int width;
		if(length <= 0 || width <= 0){
			System.out.println("Length and/or width input is invalid.");
		}
		else if(length != width){
			System.out.println("It is a rectangle.");
		}
		else
		{
			System.out.println("It is a square.");
		}
	}
}


/* Problem 2: Take two int values from user and print greatest among them. */
public class greatestNumber{
	public static void main(String[] args){
		int number1;
		int number2;
		if(number1 == number2){
			System.out.println("The numbers are the same value.");
		}
		else if(number1 > number2){
			System.out.println("The greatest number is " + number1);
		}
		else
		{
			System.out.println("The greatest number is " + number2);
		}
	}
}


/* Problem 3: A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
*/
public class totalCost{
	public static void main(String[] args){
		int numberOfUnits;
		double cost = numberOfUnits * 100.0;
		if(cost > 1000){
			cost *= 0.1;
			System.out.println("Discount of 10% was given.");
			System.out.println("Total cost: " + cost);
		}
		else if(cost <= 0){
			System.out.println("An invalid number of units was given. The value should be greater than 0.");
		}
		else{
			System.out.println("Total cost " + cost);
		}
	}
}

/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
*/
public class employeeBonus{
	public static void main(String[] args){
		double salary;
		int yearsOfService;
		if(yearsOfService > 5){
			salary *= 0.05;
			System.out.println("5% bonus was rewarded.");
			System.out.println("Total salary: " + salary);
		}
		else if(salary <= 0 || yearsOfService < 0){
			System.out.println("Inputted data was invalid.");
		}
		else{
			System.out.println("Total salary: " + salary);
		}
	}
}