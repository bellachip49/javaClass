//Lesson 3-1-0 CW Conditionals with Strings
//Name:
//Date:
//Class:

//Write a java program means write a class with a main method containing some code to do whatever the problem requires
//Use this format (Copy and paste is okay):

public class Problem1{
	public static void main (String [] args){

	}
}



/*Problem1 Write a java program to compare two strings lexicographically.  Lexicographically means letter by letter.  
	This means compare the first letter of the first String to the first letter of the second String.  Then compare the 
	second letter of the first String to the second letter of the second String, then compare the third letters, then the
	fourth and so on to the end of the shortest String.
*/
public class Problem1{
	public static void main (String [] args){
		String name = "Crosspoint Academy";
		String name2 = "crosspoint academy";

		boolean areTheyEqual = name.equals(name2);

		if(areTheyEqual == true)
		{
			System.out.println("Strings are equal.");
		}
		else
		{
			System.out.println("Strings aren't equal.");
		}
	}
}
//Result: Strings aren't equal.

//Problem2  Write a java program to compare two strings lexicographically, ignoring case differences.
public class Problem2{
	public static void main (String [] args){
		String name = "Hello World"
		String name2 = "hello world"

		boolean areTheyEqual = name.equalsIgnoreCase(name2);

		if(areTheyEqual == true)
		{
			System.out.println("Strings are equal.");
		}
		else
		{
			System.out.println("Strings aren't equal.");
		}
	}
}
//Problem3 Write a Java program to concatenate a given string to the end of another string.
public class Problem3{
	public static void main (String [] args){
		myString = "The cake ";
		myOtherString = "is a lie.";

		combinedString = myString.concat(myOtherString);
		combinedString2 = myString + myOtherString;

		System.out.println(combinedString);
		System.out.println(combinedString2);
	}
}
//Result:
//The cake is a lie.
//Skip for now.
//Problem4 Write a Java program to compare a given string to the specified character sequence.
public class Problem4{
	public static void main (String [] args){

	}
}
//Problem5 Write a Java program to check whether two String objects contain the same data.
		String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";
        String columnist4 = "Mike Royko";

public class Problem5{
	public static void main (String [] args){
		if(columnist1.equals(columnist2))
		{//columnist1.equals(columnist3) || columnist1.equals(columnist4)
			System.out.println("columnist1 equals columnist2.");
		}
		else
		{
			System.out.println("Not equal.");
		}
		if(columnist3.equals(columnist4))
		{
			System.out.println("columnist3 equals columnist4.");
		}
		else
		{
			System.out.println("Not equal.");
		}
	}
}
//Problem6 Write a Java program to compare a given string to another string, ignoring case considerations.
public class Problem6{
	public static void main (String [] args){
		String stringA = "Crosspoint Academy";
		String stringB = "crosspoint academy";

		if(stringA.equalsIgnoreCase(stringB))
		{
			System.out.println("string A equals to B.");
		}
		else
		{
			System.out.println("string A isn't equal to B.");
		}
	}
}
//Problem7 Write a java program to get the length of a given string
public class Problem7{
	public static void main (String [] args){
		String stringA = "Crosspoint Academy";

		System.out.println("The string's length is " + stringA.length()); //returns an int
	}
}
//Problem8 Write a Java program to convert all the characters in a string to lowercase. 
public class Problem8{
	public static void main (String [] args){
		String stringA = "Crosspoint Academy";

		System.out.println(stringA.lowercase()); //returns a string
	}
}
//Problem9 Write a Java program to convert all the characters in a string to uppercase.
public class Problem9{
	public static void main (String [] args){
		String stringA = "Crosspoint Academy";

		System.out.println(stringA.uppercase()); //returns a string
	}
}
//Problem10 Write a Java program to trim any leading or trailing whitespace from a given string.
public class Problem10{
	public static void main (String [] args){
		String someStringA = "          pilot   ";

		System.out.println(stringA.trim()); //returns a string
	}
}