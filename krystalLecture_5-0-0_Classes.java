Lecture 5-0-0 Classes

Definitions:
Class: a blueprint or template for an object
Object: an actual thing with its own variables and methods
Instantiation: the process of taking a class blueprint and making an object

Class Declarations
AccessModifier (or blank for default) class Keyword  className curly braces
Lowercase first letter for AccessModifier and classKeyword
Uppercase first letter for className

Example: public class CarDealer{}

Access Modifiers for classes
public: /*visible to all the classes in all the packages in Java.  Only one 
public class is allowed per package.  It should have the same name as the package.
Otherwise you will get a compile error.*/

default (no access modifier declared): //accessible by classes in the same package.

More information on access modifiers: https://www.javatpoint.com/access-modifiers

Examples:
public class CarDealer{}
class CarDealer{}

Data in Classes:
AccessModifiers(in order of access):
default: no access modifier  int myNum;

public: specifically make the data accessible  public int myBigNum;

protected: /*cannot be used for classes.  Items inside class have restricted access.
We will not be using this. It is mostly used for more advanced applications.*/

private: /*Cannot be used for a class itself. Often used for items inside a class.  
Cannot be accessed anywhere outside the enclosing class.*/
Example:
public class CarDealer{
	//data is often kept private using the private keyword
	private brand = "Toyota";

	//a method to do something with the data, but does not have to be the main method
	public myMethod()
	{

	}
}

Why use the private access modifier?

Encapsulation: another name for data hiding.  The variables of the class will be hidden
from other classes, and can only be accessed though methods of their current class.
Key to maintaining stability and privacy.  Stability comes from controlled access to data.
It cannot be accidentally changed.  Privacy is also from controlled access to data.

However, if data is private, we still have to access it and modify it.  We do this in a 
protected way by using methods called "getters" and "setters"

Example:
Typical Class Template for a simple program
public class Student{

	//Data is usually declared as private to protect it
	private int id;
	private String name;
	private double lunchMoney;

	//Constructor method: ALWAYS has the same name as the class!!!!
	//This will be discussed in the class methods lecture
	public Student()
	{}

	//"getter" method for name
	public String getName()
	{
		return name;
	}

	//"setter" method for name
	public String setName(String newName)
	{
		this.name = newName;
	}
}

New Ideas:
return Statement: means that when this method is invoked, it will produce a value which 
can be used by another method.

parameter: (also called argument list)a type and variable inside parentheses after a method name.  Gives the information
which the method needs to use
Example:  
int len = myLongString.length();  The parameter can have nothing in it.
int mySubString = myLongString.subString(0, 4);  The parameters here are values for the indexes.
Programmer written method:
public int getArea(int myWidth, int myHeight)
{
	this.width = myWidth;
	this.height = myHeight;
	return width * height;
}
Must be used from an instantiated object //We will get to that in lecture 5-0-2

New keyword: this
Used to refer to the current object //We will get more on this in lecture 5-0-2