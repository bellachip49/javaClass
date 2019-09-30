//Lesson 3-0-0 CW Conditionals_Problems_1
//Name: Krystal Kwan
//Date: 9/9/19
//Class: Java

Remember to put a blank line between the following questions.

/* Problem 1 Write code for the following situation using an if...else.  Start by writing an int variable named roomSize.  If the classSize is
too big for the room, that class will not fit.  In the if section of the code, write a print statement saying the class will not fit.  In the else
section of the code, write the class will fit.  The roomSize is 25.  What happens if the classSize is 30, if it is 25, if it is 20?
Run the code for each situation.  Yes, it is obvious.  Do it anyway. Put your code and the responses below:
*/
public class Problem1 {
  public static void main(String[] args)
  {
    int roomSize = 25;
    int classSize;
    if(classSize > roomSize)
    {
      System.out.println("The class is too big.");
    }
    else if(classSize <= 0)
    {
      System.out.println("Class size is invalid or does not exist.");
    }
    else
    {
      System.out.println("The class fits in the room.");
    }
  }
}
/*
Problem 2 Assume a user input of 35.  Write an if else statement that shows if userInput is 35, the if statement is true using the equality operator.
In one or two sentences, explain why we always included the else statement, even if we know the if statement is going to be true.
*/
public class Problem2 {
  public static void main(String[] args){
    int userInput = 35;
    if(userInput == 35)
    {
      System.out.println("User input is 35.");
    }
    else if(userInput > 35)
    {
      System.out.println("User input is greater than 35.");
    }
    else
    {
      System.out.println("User input is less than 35.");
    }
  }
}
/*
Why include else?
To make sure that something always happens when something is false.
//The userInput isn't always going to be 35. It can be any other number, so there must be an else statement to cover than scenario.

/*Problem 3 If the score is greater than 100, print out "Amazing victory", if the score is 75(between 75 and 100), print out "You win", if the score is 50, print out
"You barely made it.  If the score is less than 50, print out "You lost"*/
public class Problem3 {
  public static void main(String[] args){
    int score;
    if(score > 100)
    {
      System.out.println("Amazing victory!");
    }
    else if(score >= 75)
    {
      System.out.println("You win!");
    }
    else if(score >= 50)
    {
      System.out.println("You barely made it.");
    }
    else
    {
      System.out.println("You lost.");
    }
  }
}
//Answers
//100 amazing victory
//75 you win
//50
//49 you lost
//-5 you lost
//0 you lost`
/* Problem 4 Write code for the following situation using an if...else.  Start by writing an double variable named money with a value of 2.50.  
Make double variables for candy at 1.25, doughnuts at 2.10, and soda at 1.80.  For each combination of foods, candy plus doughnuts,
candy plus soda, and doughnuts plus soda, use a series of if else if else statements to show which combinations you can buy.
The output statements are "You can buy ...." and you cannot buy... Then a second output statement shows the comparison of the price 
with money.
*/
public class Problem4 {
  public static void main(String[] args){
    double money = 2.50;
    double candy = 1.25;
    double doughnuts = 2.10;
    double soda = 1.80;
    if(money > 0){
    	System.out.println("The number is invalid.")
    }
    else{
	    if(money >= (candy + doughnuts))
	    {
	    	System.out.println("You can buy candy and doughnuts.");
	    }
	    else if(money >= (candy + soda))
	    {
	    	System.out.println("You can buy candy and soda.");
	    }
	    else if(money)
	    else
	    {
	    	System.out.println("You can buy doughnuts and soda.")
	    }
  	}
}
}



/* Problem 5 In English write a 2-5 scenario which requires an if, else if else statement, then write code to show your idea.  
Do NOT make it too hard.
Tell the user that they are at the starting point of an adventure. Ask the user for a place they want to explore. 
if they go to the jungle, say that an animal chased them out and back to the starting point.
if they go to the city, say that they met a friend there.
if they go to the park, say that they sat down and watch the ducks swimming.
*/
public class Problem5 {
  public static void main(String[] args){
    String whereToGo;
    if(whereToGo == "jungle")
    {
        System.out.println("You went in the jungle, but you were chased out. You ran back to the starting point.");
    }
    else if(whereToGo == "city")
    {
        System.out.println("You went to the city. As you walk down the street, you find your friend.");
    }
    else if(whereToGo == "park")
    {
        System.out.println("You went to the park and decided to take a rest. You sat down on a bench and watched the ducks swimming in the lake.");
    }
    else
    {
        System.out.println("The location is invalid or doesn't exist.")
    }
  }
}
/* Problem 6
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
Answer below
*/
public class Problem6 {
  public static void main(String[] args)
  {
  	int grade;
    if(grade < 25)
    {
    	System.out.println("You grade is an F.");
    }
    else if(grade >= 25 && grade < 45)
    {
    	System.out.println("You grade is an E.");
    }
    else if(grade >= 45 && grade < 50){
    	System.out.println("You grade is a D.");
    }
    else if(grade >= 50 && grade < 60){
		System.out.println("You grade is a C.");
    }
    else if(grade >= 60 && grade <= 80){
    	System.out.println("You grade is a B.");
    }
    else{
    	System.out.println("You grade is an A.");
    }
  }
}



























import java.util.Scanner;
class Ans{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your marks");
    int x = s.nextInt();
    if(x<25){
      System.out.println("F");
    }
    else if((x>=25)&&(x<45)){
      System.out.println("E");
    }
    else if((x>=45)&&(x<50)){
      System.out.println("D");
    }
    else if((x>=50)&&(x<60)){
      System.out.println("C");
    }
    else if((x>=60)&&(x<80)){
      System.out.println("B");
    }
    else if((x>=80)&&(x<=100)){
      System.out.println("A");
    }
    else{
      System.out.println("Not correct marks");
    }
  }
}
						