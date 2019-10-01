/*Lecture 3-3-3 More SubStrings  from https://beginnersbook.com/2013/12/java-string-substring-method-example/

Java – String substring() Method example


Method substring() returns a new string that is a substring of given string. Java String substring() method is used 
to get the substring of a given string based on the passed indexes. There are two variants of this method. In this guide, 
we will see how to use this method with the help of examples.

String substring() method variants
There are two ways we can use the substring() method –

1. When we pass only the starting index:*/

String substring(int beginIndex)

/*Returns the substring starting from the specified index i.e beginIndex and extends to the character present at the end of the 
string. For example – "Chaitanya".substring(2) would return "aitanya". The beginIndex is inclusive, that is why the character 
present at the index 2 is included in the substring. This method throws IndexOutOfBoundsException If the beginIndex is less 
than zero or greater than the length of String (beginIndex<0||> length of String).*/


/*2. When we pass both the indexes, starting index and end index:

String substring(int beginIndex, int endIndex)
Returns a new string that is a substring of this string. The substring begins at the specified beginIndex and extends to the 
character at index endIndex – 1. Thus the length of the substring is endIndex-beginIndex. In other words you can say that beginIndex 
is inclusive and endIndex is exclusive while getting the substring.

For example – "Chaitanya".substring(2,5) would return "ait". It throws IndexOutOfBoundsException If the beginIndex is less than zero 
OR beginIndex > endIndex OR endIndex is greater than the length of String.

Java String substring() example
Now that we understand the basics of substring() method, lets take an example to understand the usage of this method.

Here we have a string str and we are finding out the substring of this string using the substring() method.*/


public class SubStringExample{
   public static void main(String args[]) {
       String str= new String("quick brown fox jumps over the lazy dog");
       System.out.println("Substring starting from index 15:");
       System.out.println(str.substring(15)); //
       System.out.println("Substring starting from index 15 and ending at 20:");
       System.out.println(str.substring(15, 20));
   }
}
/*Output:

Substring starting from index 15:
 jumps over the lazy dog
Substring starting from index 15 and ending at 20:
 jump
Note: Many peoples are confused that the returned substring in the second method call should be jumps instead of jump, 
this is because the returned substring length should be endIndex-beginIndex, in our example beginIndex is 15 and endIndex is 20, 
thus the length of returned substring should be 20-15 = 5. The correct answer is ” jump” because there is a space before the jump 
so the length of substring ” jump” is 5 (including the space).
To further avoid confusion, I am sharing an another example of this method which is easy to follow.

Another example of String substring() method*/ 

public class JavaExample{
   public static void main(String args[]) {
	String mystring = new String("Lets Learn Java");
	/* The index starts with 0, similar to what we see in the arrays
	 * The character at index 0 is s and index 1 is u, since the beginIndex
	 * is inclusive, the substring is starting with char 'u'
	 */
	System.out.println("substring(1):"+mystring.substring(1));
		
	/* When we pass both beginIndex and endIndex, the length of returned
	 * substring is always endIndex - beginIndex which is 3-1 =2 in this example
	 * Point to note is that unlike beginIndex, the endIndex is exclusive, that is 
	 * why char at index 1 is present in substring while the character at index 3 
	 * is not present.
	 */
	System.out.println("substring(1,3):"+mystring.substring(1,3));
   }
}

//Output:
//Java String substring method example