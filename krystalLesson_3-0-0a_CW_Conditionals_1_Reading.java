//Lesson 3-0-0a CW Conditionals_1_Reading
//Name: Krystal
//Date: 9/4/19
//Class: Java

/*Read each of the following sections of code.  In the comment space at the bottom of each section, 
put what the output would be if the code was run in your IDE*/

//Example:
/* The following values are entered into the variable personAge for 5 runs of the code. 4, 8, 16, 35, 80 Give what the output would be for each*/
int personAge = put the value here

if(personAge > 21)
{
	System.out.println("This person is old enough to vote.");

}
else
{
	System.out.println("This person is too young to vote.");
}

/*Answers:
4 will be "This person is too young to vote."
8 will be "This person is too young to vote."
16 will be "This person is too young to vote."
35 will be "This person is old enough to vote."
80 will be "This person is old enough to vote."
*/

//Complete the following problems in the same way, on your own.
/* Problem 1: The following values are entered into the variable dogYears for 5 runs of the code.  1, 2, 3, 4, 8,  Give what the output would be for each*/
int dogYears;
int maxDogAge = 40;

dogYears *= 7;
if(dogYears > maxDogAge)
{
	System.out.println("I am sorry.  Your dog is in doggy heaven.");
}
if(dogYears <= 0)
{
	System.out.println("Invalid.")
}
else
{
	System.out.println("You should take your dog for a walk.");
}

/*Problem 1 Answers:
1 You should take your dog for a walk.
2 You should take your dog for a walk.
3 You should take your dog for a walk.
4 You should take your dog for a walk.
8 I am sorry.  Your dog is in doggy heaven.
Extra answer: what happens if dogYears = 0?  Would this make sense?  Why or why not?
It would say "You should take your dog for a walk" and wouldn't make sense since the dog isn't born yet.
*/ 

/* Problem 2: The following values are entered into the variable schoolAge for 5 runs of the code. 1, 4, 5, 8, 32  Give what the output would be for each*/

int schoolAge;
int kinderGartenAge = 5;

if( kinderGartenAge <= schoolAge)
{
	System.out.println("Off to school you go!");
}
else
{
	System.out.println("Play with your toys.");
}

/*Problem 2 Answers:
1 Off to school you go!
4 Off to school you go!
5 Off to school you go!
8 Off to school you go!
32 Play with your toys
Extra answer: what happens if schoolAge = 32?  Would this make sense?  Why or why not?
It would say "Play with your toys" but this doesn't make sense because the person would be too old.
*/

/* Problem 3: The following values are entered into the variable numberOfFish for 5 runs of the code. 1, 10, 20, 27, 32  Complete the code
such most of the time the number of fish WILL fit into the kettle.  Put in Strings that make sense.*/

int kettleSize = 20;
int numberofFish;

if( kettleSize >= numberOfFish)
{
	System.out.println("Fish can fit in the kettle.");
}
else
{
	System.out.println("Too many fish.");
}

/*Problem 3 Answers:
1 Fish can fit in the kettle.
10 Fish can fit in the kettle.
20 Fish can fit in the kettle.
27 Too many fish.
32 Too many fish.

*/

/* Problem 4: Select your own values that are entered into a variable for 5 runs of the code. Complete the code for your own scenario.
 Put in Strings that make sense. Include the answers for running your code.*/

int amountOfFlourNeeded = 5; //In cups
int flourAdded;

if(flourAdded < amountOfFlourNeeded)
{
	System.out.println("Not enough flour.");
}
else if(flourAdded == 0)
{
	System.out.println("No flour was added.")
}
else if(flourAdded < 0)
{
	System.out.println("Amount of flour is invalid.")
}
else if(flourAdded == amountOfFlourNeeded)
{
	System.out.println("Just enough flour.")
}
else
{
	System.out.println("Too much flour.")
}

/*Problem 4 Answers:
1 Not enough flour.
3 Not enough flour.
5 Enough flour.
6 Too much flour.
*/