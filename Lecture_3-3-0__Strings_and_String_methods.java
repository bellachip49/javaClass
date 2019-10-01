//Lecture 3-3-0  Strings and String methods

Start with https://www.w3schools.com/java/java_strings.asp

/*
Java String Examples
The String class implements immutable character strings, which are read-only once the string object has been created and initialized. 
All string literals in Java programs, are implemented as instances of String class.

The easiest way to create a Java String object is using a string literal:
*/
String str1 = "I can't be changed once created!";

/*A Java string literal is a reference to a String object. Since a String literal is a reference, 
it can be manipulated like any other String reference. i.e. it can be used to invoke methods of String class.*/

//For example,
int myLength = "Hello world".length();

/*
A Java method is a collection of statements that are grouped together to perform an operation. 
When you call the System.out.println() method, for example, the system actually executes several 
statements in order to display a message on the console.

. is not an operator. Therefore, it "does" nothing.
It is just a syntactic element that denotes the seperation of, in this case, a variable name 
holding an object and the object's property. The same character is used to seperate package names and Classes.

One of the properties that a String can have is a method.  Some you write, but many are built in to the Java language.
Examples of String methods:
.length give the length of a String, it returns an int
.upperCase changes the characters in a String to uppercase, it returns the String with all uppercase letters
.concat concatenates Strings, + also concatenates Strings
.equals compares Strings letter by letter, it returns a boolean
.equalsIgnoreCase compares Strings letter by letter, it returns a boolean
.indexOf(char ch) returns the index of the specificed character in a String
A lot more are listed at https://www.tutorialspoint.com/java/java_strings.htm
*/

/*The Java language provides special support for the string concatenation operator (+), which has been overloaded for Java Strings objects. 

For example,*/

String finalString = "Hello" + "World";

String finalString  will equal "HellowWord" Notice the spacing!!!

String finalString = "Hello " + "World";  will equal "Hellow World"
String finalString = "Hello" + " World";  will equal "Hellow World"

/*The Java compiler optimizes handling of string literals. Only one String object is shared by all strings 
having same character sequence. Such strings are said to be interned, meaning that they share a unique 
String object. The Java String class maintains a private pool where such strings are interned.

For example,*/

String str1 = "Hello";
String str2 = "Hello";
If(str1.equals(str2))  //Short Cut code: no curly braces means execute only the line following the if statement.  Do not use this, please.
	System.out.println("Equal");

//Would print Equal when executed.

//Since the Java String objects are immutable, any operation performed on one String reference will never 
have any effect on other references denoting the same object.

//String Constructors
//String class provides various types of constructors to create String objects. Some of them are,
String()
//Creates a new String object whose content is empty i.e. "".

String(String str)
//Creates a new String object whose content is same as the String object passed as an argument.

//String also provides constructors that take byte and char array as an argument and returns String object.

/*String equality - Compare Java String
String class overrides the equals() method of the Object class. It compares the content of the two 
string objects and returns the boolean value accordingly.

For example,*/

String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello") //Using constructor.

//Write code to compare these Strings

/*The output would be,


Note that == compares the references not the actual contents of the String object; Where as equals method compares actual contents of two String objects.

String class also provides another method equalsIgnoreCase() which ignores the case of contents while comparing.

Apart from these methods String class also provides compareTo methods.
*/
int compareTo(String str2)
/*
This method compares two Strings and returns an int value. It returns
- value 0, if this string is equal to the string argument
- a value less than 0, if this string is less than the string argument
- a value greater than 0, if this string is greater than the string argument
*/
int compareTo(Object object)
//This method behaves exactly like the first method if the argument object is actually a String object; otherwise, it throws a ClassCastException.
