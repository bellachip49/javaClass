//Lesson 3-3-0 HW String Probs 2
//Name: Krystal
//Date: 9/25
//Class: Java

//Use this set of Strings:
String name = "Crosspoint Academy";
String parking = "Parking Lot";
String people = "Alois Paul Emery";
String strange = "pilot";

//Problem 1:  Write a Java program to get the character at the given index within the String using charAt().  Find the character at position 4 for each String.
public class Problem1{
	public static void main(String [] args){
		String name = "Crosspoint Academy";

		System.out.println(name.charAt(4));
	}
}
//Problem 2: Write a Java program to get the character at the given index within the String using subString().  Find the character at position 0 for each String.
public class Problem2{
	public static void main(String [] args){
		String name = "Crosspoint Academy";

		System.out.println(name.substring(0));
	}
}
//Problem 3: Write a Java program to test if a given string contains the specified sequence of char values using .contains()  Use "in" as the specified character sequence.
public class Problem3{
	public static void main(String [] args){
		String name = "Crosspoint Academy";

		if(name.contains("in")){
			System.out.println("the name contains in.");
		}
		else{
			System.out.println("the name does not contain in.");
		}
	}
}
//Problem 4: Write a Java program to test if a given string contains the specified sequence of char values using subString()  Use "em" as one character sequence, then "Pa" as a second one.
public class Problem4{
	public static void main(String [] args){
		String name = "Crosspoint Academy";

		if(name.subString(15,17).equals("em")){
			System.out.println("em is in the string");
		}
		else if(name.substring(15,17).equals("Pa")){
			System.out.println("Pa is in the string");
		}
		else{
			System.out.println("Pa and em were not found.");
		}
	}
}
//Problem 5: Write a Java program to compare a given string to the specified character sequence using .contentEquals()  Use "oi"
public class Problem5{
	public static void main(String [] args){
		String name = "Crosspoint Academy";

		if(name.contentEquals("oi")){
			System.out.println("name contains oi.");
		}
		else{
			System.out.println("name does not contain oi");
		}
	}
}
//Problem 6: Write a Java program to compare a given string to the specified character sequence using subString()  Use "in"
public class Problem6{
	public static void main(String [] args){
		String name = "Crosspoint Academy";

		if(name.subString(7,9).equals("in")){
			System.out.println("in is in the string");
		}
		else{
			System.out.println("in was not found in name");
		}
	}
}
//Problem 7: Write a Java program to check whether a given string ends with the contents of another string using .endsWith() "y"
public class Problem7{
	public static void main(String [] args){
		String name = "Crosspoint Academy";

		if(name.endsWith("y")){
			System.out.println("y is at the end");
		}
		else{
			System.out.println("y is not at the end");
		}
	}
}
//Problem 8: Write a Java program to check whether a given string ends with the contents of another string using subString() "ot" and "Lot"
public class Problem7{
	public static void main(String [] args){
		String parking = "Parking Lot";
		String strange = "pilot";

		if(parking.subString(3).equals(strange.substring(9))){
			System.out.println("both end in ot")
		}
		else{
			System.out.println("They do not end in ot.")
		}
	}
}

