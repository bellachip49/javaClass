//Lesson 3-3-1 HW String Prob 1
//Name: Krystal
//Date: 9/20/19
//Class: Java

//15 total problems

//Part 1
//Using this String: "The Quick Brown Fox Jumped Over the Lazy Dog"
//Select 10 methods from the documentation at https://www.tutorialspoint.com/java/java_strings.htm
//For each problem, make a class with the problem number, make a main method.  Put the string in the method.  Make an 
//appropriate variable based on the method you selected. Use one of the 10 methods, then print the variable inside a complete sentence
//that explains your result.
public class Problem1{
	public static void main (String [] args){
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";

		System.out.println("The length of the string is " + myString.length());
	}
}
public class Problem2{
	public static void main (String [] args){
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";

		System.out.println("The new string in all caps is " + myString.toUpperCase());
	}
}
public class Problem3{
	public static void main (String [] args){
		String myString = "     The Quick Brown Fox Jumped Over the Lazy Dog    ";

		System.out.println("Here is the new string with extra space removed: \n" + myString.trim());
	}
}
//substring
public class Problem4{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";

		System.out.println("Here is a chopped version of the string: " + myString.substring(10));
	}
}
public class Problem5{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";

		System.out.println("Here's the lowercase version: " + myString.toLowerCase());
	}
}
public class Problem6{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";
		System.out.println("Here's another chopped part of the string: " + myString.substring(3, 24));
	}
}
public class Problem7{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";
		String anotherString = " But Tripped and Fell On His Face."

		System.out.println("New string: \n" + myString.concat(anotherString));
	}
}
public class Problem8{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";

		System.out.println("The letter " + myString.charAt(4) + " is at index 4.")
	}
}
public class Problem9{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";

		System.out.println("Here is a new string, with all the e's replaced by x: \n" + myString.replace('e', 'x'));
	}
}
public class Problem10{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";

		System.out.println("At index 0, the unicode is " + myString.codePointAt(0));
	}
}

//Part 2
//Make up your own String to compare with the String above. Use 5 comparison methods and write 5 more classes.  Each should have 
//an appropriate variable and that variable should be printed inside a complete sentence that explains your result.
//Needs complete sentence for output!

public class Problem11{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";
		String myString2 = "The Quick Black Cat Jumped Over the Lazy Rat";

		if(myString.charAt(19) == myString2.charAt(19))
		{
			System.out.println("At index 19, both strings have the same character.");
		}
		else
		{
			System.out.println("At index 19, both strings don't have the same character.");
		}
	}
}
public class Problem12{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";
		String myString2 = "The Quick Black Cat Jumped Over the Lazy Rat";

		if(myString.startsWith("The Quick") && myString2.startsWith("The Quick"))
		{
			System.out.println("Both strings start with the two words, The Quick.");
		}
		else
		{
			System.out.println("Both strings don't start with The Quick.");
		}
	}
}
public class Problem13{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";
		String myString2 = "The Quick Black Cat Jumped Over the Lazy Rat";

		if(myString.length() == myString2.length)
		{
			System.out.println("Both strings are equal in length.");
		}
		else
		{
			System.out.println("The lengths of the two strings differ from each other.");
		}
	}
}
public class Problem14{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";
		String myString2 = "The Quick Black Cat Jumped Over the Lazy Rat";

		if(myString.equalsIgnoreCase(myString2))
		{
			System.out.println("The strings are the same, ignoring cases.");
		}
		else
		{
			System.out.println("The strings are unique and different from each other.");
		}
	}
}
public class Problem15{
	public static void main (String [] args)
	{
		String myString = "The Quick Brown Fox Jumped Over the Lazy Dog";
		String myString2 = "The Quick Black Cat Jumped Over the Lazy Rat";

		if(myString.equals(myString2))
		{
			System.out.println("The strings are the same.");
		}
		else
		{
			System.out.println("The strings are unique and different from each other.");
		}
	}
}