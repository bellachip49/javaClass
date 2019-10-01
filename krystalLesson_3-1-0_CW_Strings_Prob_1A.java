//Lesson 3-1-0 CW Strings Prob 1A
//Name: Krystal
//Date: 9/18
//Class: Java

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


//Problem 11:  Write a Java program to get the character at the given index within the String using charAt()
//a char is a type like int, double or boolean.  A char has a single character in it.  Example: char myChar = 'A';
//Write code to isolate the first A in name, the P in parking, The s in people.
public class Problem11{
	public static void main (String [] args){
		String name = "Crosspoint Academy";
		String parking = "Parking Lot";
		String people = "Alois Paul Emery";

		System.out.println(name.char(11));
		System.out.println(parking.char(0));
		System.out.println(people.char(4));
	}
}
//Problem 12: Write a Java program to get the character at the given index within the String using subString()
//Write code to get the letters au from people, to get the ssp from name2 and Lot from parking.  What happens if you try to use Lot with strange?
public class Problem12{
	public static void main (String [] args){
		String people = "Alois Paul Emery";
		String name2 = "crosspoint academy";
		String strange = "pilot";

		System.out.println(name.char(6,9));
		System.out.println(name.char(2,6));
	}
}
//Problem13: Write a Java program to compare a given string to the specified character sequence using subString()
//Write code to compare the letters ot to the end of strange
public class Problem13{
	public static void main (String [] args){
		String strange = "pilot";

		if(strange.substring(4).equals((strange.substring(4))))
		{
			System.out.println("They're equal.");
		}
		else
		{
			System.out.println("They aren't equal.");
		}

	}
}
//Problem 14: Write a Java program to check whether a given string ends with the contents of another string using .endsWith()
//Use name and name2 and do a comparison to see if the last 5 letters are equal
public class Problem14{
	public static void main (String [] args){
		String name = "Crosspoint Academy";
		String name2 = "crosspoint academy";

		if(name.endswith(name2.subString(13)))
		{
			System.out.println("The last five letters of the two variables are equal.");
		}
		else
		{
			System.out.println("The last five letters of the two variables are NOT equal.");
		}
	}
}
//Problem 15: Write a Java program to check whether a given string ends with the contents of another string using subString()
//Use name and name2 and do a comparison to see if the last 5 letters are equal
public class Problem15{
	public static void main (String [] args){
		String name = "Crosspoint Academy";
		String name2 = "crosspoint academy";

		if(name.subString(13).equals(name2.subString(13)))
		{
			System.out.println("The last five letters of the two variables are equal");
		}
		else
		{
			System.out.println("The last five letters of the two variables are NOT equal.");
		}
	}
}
