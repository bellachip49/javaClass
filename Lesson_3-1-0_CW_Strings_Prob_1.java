//Lesson 3-1-0 CW Strings Prob1
//Name: Krystal
//Date: 9/24
//Class: Java

//LOOK HERE FOR STRING METHODS YOU MIGHT NEED TO COMPLETE THIS ASSIGNMENT: https://www.tutorialspoint.com/java/java_strings.htm

//Write a java program means write a class with a main method containing some code to do whatever the problem requires
//Use this format (Copy and paste is okay):

public class Problem1{
	public static void main (String [] args){

	}
}

//Use this set of Strings:
String name = "Crosspoint Academy";
String name2 = "crosspoint academy";
String parking = "Parking Lot";
String people = "Alois Paul Emery";
String strange = "pilot";

boolean isItEqual = "pilot".equals(people);
boolean isItEqual = strange.equals("Alois Paul Emery");

//Problem2  Write a java program to compare two strings lexicographically, ignoring case differences.  Use name and name2 using .equalsIgnoreCase()
public class Problem2{
	public static void main (String [] args){
		String name = "Crosspoint Academy";
		String name2 = "crosspoint academy";

		if(name.equalsIgnoreCase(name2))
		{
			System.out.println("Both names are equal.");
		}
		else
		{
			System.out.println("The strings are not equal.");
		}
	}
}

//Problem3 Write a Java program to concatenate a given string to the end of another string. Use name and strange.
public class Problem3{
	public static void main (String [] args){
		String name = "Crosspoint Academy";
		String strange = "pilot";

		System.out.println(name + strange);
	}
}

//Problem5 Write a Java program to check whether two String objects contain the same data using .equals and the following Strings.
//Use:
		String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko"; 
public class Problem5{
	public static void main (String [] args){
		String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";

        if(columnist1.equals(columnist2))
        {
        	System.out.println("The two names are equal.");
        }
        else
        {
        	System.out.println("The strings are not equal.");
        }
	}
}

//FOR THESE, USE DOCUMENTATION TO FIND THE STRING METHOD YOU NEED TO COMPLETE THE ASSIGNMENT
//Problem6 Write a Java program to compare a given string to another string, ignoring case considerations.
public class Problem6{
	public static void main (String [] args){
		String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";

        if(columnist2.equalsIgnoreCase(columnist3))
        {
        	System.out.println("The strings are equal.");
        }
        else
        {
        	System.out.println("The strings are not equal.");
        }
	}
}
//Problem7 Write a java program to get the length of a given string
public class Problem7{
	public static void main (String [] args){
		String columnist2 = "Walter Winchell";

		System.out.println("Length of the string is " + columnist2.length);
	}
}
//Problem8 Write a Java program to convert all the characters in a string to lowercase. 
public class Problem8{
	public static void main (String [] args){
		String columnist2 = "Walter Winchell";

		System.out.println(columnist2.lowercase());
	}
}
//Problem9 Write a Java program to convert all the characters in a string to uppercase.
public class Problem9{
	public static void main (String [] args){
		String columnist2 = "Walter Winchell";

		System.out.println(columnist2.uppercase());
	}
}
//Problem10 Write a Java program to trim any leading or trailing whitespace from a given string.
public class Problem10{
	public static void main (String [] args){
		String columnist2 = "    Walter Winchell";

		System.out.println(columnist2.trim());
	}
}
//SUBSTRING PROBLEMS COMPARED TO BUILT-IN METHODS

//Problem 11:  Write a Java program to get the character at the given index within the String using charAt()
public class Problem11{
	public static void main (String [] args){
		String columnist2 = "Walter Winchell";

		System.out.println("character at index 5 is " + columnist2.charAt(5));
	}
}
//Problem 12: Write a Java program to get the character at the given index within the String using subString()
public class Problem12{
	public static void main (String [] args){
		String columnist2 = "Walter Winchell";

		System.out.println("character at index 5 is " + columnist2.subString(5));
	}
}
//Problem 13: Write a Java program to compare a given string to the specified character sequence using .contentEquals()
public class Problem13{
	public static void main (String [] args){
		String columnist2 = "Walter Winchell";

		if(columnist2.contentEquals("alter"))
		{
			System.out.println("alter was found in the string.");
		}
		else
		{
			System.out.println("alter was not found in the string.");
		}
	}
}
//Problem14: Write a Java program to compare a given string to the specified character sequence using subString()
public class Problem14{
	public static void main (String [] args){
		String name = "Crosspoint Academy";
		String name2 = "crosspoint academy";

		if(name.subString(11, 14).equals(name2.substring(11, 14)))
		{
			System.out.println("The substrings are equal.");
		}
		else
		{
			System.out.println("The substrings are not equal.");
		}
	}
}
//Problem 15: Write a Java program to check whether a given string ends with the contents of another string using .endsWith()
public class Problem15{
	public static void main (String [] args){
		String name = "Crosspoint Academy";
		String strange = "pilot";
		if(name.endsWith(strange))
		{
			System.out.println("name ends with pilot.");
		}
		else
		{
			System.out.println("name does not end with pilot.");
		}
	}
}
//Problem 16: Write a Java program to check whether a given string ends with the contents of another string using subString()
public class Problem16{
	public static void main (String [] args){
		String name = "Crosspoint Academy";
		String name2 = "crosspoint academy";

		if(name.subString(11).equalsIgnoreCase(name2.substring(11)))
		{
			System.out.println("Both strings end with academy.");
		}
		else
		{
			System.out.println("The strings do not end with academy.")
		}
	}
}