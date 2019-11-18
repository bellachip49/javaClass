Lesson 5-0-4 CW Using Objects 1
Name
Date
Class

Example
public class DoSomeMath
{
	//fields
	private int num = 5;
    
    //constructor
	public DoSomeMath()
	{}

	//methods
	public int getThatNum()
	{
		return num;
	}

	public void setThatNum(int newNum)
	{
		this.num = newNum;
	}
}

public class DoSomeMoreMath
{
	//fields
	private int num = 6;

	//constructor
	public DoSomeMoreMath()
	{}

	//methods
	public int getThatNum()
	{
		return num;
	}

	public void setThatNum(int newNum)
	{
		this.num = newNum;
	}
}

public class MathCreator
{
	public static void main(String [] args)  //start here no fields, no constructor, no methods
	{
		//create objects
        DoSomeMath math1 = new DoSomeMath();
        DoSomeMoreMath math2 = new DoSomeMoreMath();

        //code to show that you can do things with the objects
        int sum = math1.getThatNum() + math2.getThatNum();
        System.out.println("The sum is " + sum);

	}
}

/*Assignment: Write 3 classes following the above example.  
The first class should return a String.  The second class should also return a String.  
class Genesis1 uses String myString = "In The Beginning "; 
class Genesis2 uses String otherString = "In the beginning ";
These classes should have a constructor, a getter and a setter method.
Make the third class with the name GenesisCreator with a main method.
In main, 
1. Find the length of the two strings and add
the lengths together in a variable call bothLengths.  
2. Concatenate the Strings and printthe concatenation WITHOUT changing the Strings in the classes.  
3. Check and see if the Strings are equal. Print the answer 
4. Check and see if the Strings are equal ignoring case.  Print the answer. 
5. Print both strings with all capital letters.  Do not change the Strings in the classes.
6. Change the Strings to the following values. 
String myString = "God created the heavens and the earth."
String myString = "God Created the Heavens and the Earth."
7. Run the code with the new values and show the output.
*/

paste the code here
1. Find the length of the two strings and add the lengths together in a variable call bothLengths.
int bothLengths = str1.getMyString().length() + str2.getOtherString().length();
System.out.println("Combined length of both strings is " + bothLengths + ".");

2. Concatenate the Strings and print the concatenation WITHOUT changing the Strings in the classes.
System.out.println(str1.getMyString() + str2.getOtherString());

3. Check and see if the Strings are equal. Print the answer
if(str1.getMyString().equals(str2.getOtherString())){
    System.out.println("The strings are equal.");
}
else{
    System.out.println("The strings are not equal.");
}

4. Check and see if the Strings are equal ignoring case.  Print the answer.
if(str1.getMyString().equalsIgnoreCase(str2.getOtherString())){
    System.out.println("The strings are equal, ignoring case.");
}
else{
    System.out.println("The strings are not equal, ignoring case.");
}

5. Print both strings with all capital letters.  Do not change the Strings in the classes.
System.out.println(str1.getMyString().toUpperCase());
System.out.println(str2.getOtherString().toUpperCase());

6. Change the Strings to the following values.
String myString1 = "God created the heavens and the earth.";
String myString2 = "God Created the Heavens and the Earth.";
str1.setMyString(myString1);
str2.setOtherString(myString2);

7. Run the code with the new values and show the output.
System.out.println(str1.getMyString());
System.out.println(str2.getOtherString());
paste the output here
/*Combined length of both strings is 34.
In The Beginning In the beginning 
The strings are not equal.
The strings are equal, ignoring case.
IN THE BEGINNING 
IN THE BEGINNING */

paste the second output here
/*God created the heavens and the earth.
God Created the Heavens and the Earth.*/