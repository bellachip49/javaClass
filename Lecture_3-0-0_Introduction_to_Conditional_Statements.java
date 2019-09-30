//Lesson 3-0-0 Introduction to Conditional Statements.
//Name:
//Date:
//Class:

Basic code model:
if (something is true)  //we often use number comparisons or booleans for the code in the parentheses.
{
	Take a specific action
}
else
{
	Take a different action
}

/*Imagine our crayon manufacturer.  The company needs to keep track of how much wax is available to make crayons.
If the amount of wax gets down to a particular level, new wax needs to be ordered.  How do we put that into Java
code?*/

int waxInStock = 3450;  //number is in pounds

if (waxInStock < 3000)
{
	//order more 500 lbs more wax
	System.out.print ("Wax level is too low. " + waxInStock " is less than 3000 lbs.  Send an order for 500 lbs wax." );
}
else
{
	//Do nothing.
	System.out.print("Have enough wax right now.");
}

//Question: What will print?


/* Over the work period, the number in waxInStock goes down.*/
//End of day.
int waxUsedToday = 720;

//Change the value of waxInStock
waxInStock -= waxUsedToday;

//Then check again
if (waxInStock < 3000)
{
	//order more 500 lbs more wax
	System.out.print ("Wax level is too low. " + waxInStock " is less than 3000 lbs.  Send an order for 500 lbs wax." );
}
else
{
	//Do nothing.
	System.out.print("Have enough wax right now.");
}

//What will print now?

//Write an if statement where the order of wax has arrived.  Add 500 to waxInStock, the evaluate the if statement.

