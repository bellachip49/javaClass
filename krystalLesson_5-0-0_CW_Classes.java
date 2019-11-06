//Lesson 5-0-0 CW Classes
//Krystal
//11/4
//Java

Answer each of the following questions:
1. What is the definition of a class? 
//a blueprint for an object
2. What is the definition of an object? 
//a thing with its variables and methods
3. What is instantiation? 
//process of taking a class blueprint and making an object
4. Name one way to tell if a variable name is being used for an object.
//if it starts with String
5. Name the four access modifiers in the lecture.
//default
//public
//protected
//private
6. Which two access modifiers apply to the class itself?
//public and private
7. What is the most common modifier for data inside a class?
// default
8. Write three sample class declarations.
//public class CarDealer{}
//class CarDealer{}
//private class Account{}
9. Define encapsulation.
// data hiding where variables are hidden & only can be accessed through methods of the current class
10. What is a "getter"?
// accesses data
11. What is a "setter"?
// changes/modifies data
12. What does a return do?
//invokes data that can be accessed by another method
13. What is a parameter(also called an argument list)?
//type and variable inside the parentheses after a method name
14. What does the keyword this refer to?
//the current object

class Animal{
	//A: Data
	private int numberOfLegs;
	private double neckLength;
	private String name;

	//B: constructor
	Animal(){

	}

	//C: getter
	int getThatInt()
	{
		return numberOfLegs;
	}

	//D: setter
	void setThatInt(int newInt){
		this.numberOfLegs = newInt;
	}
}

/*
Methods do something
instance is the information in an object
primitives are predefined
non primitive are created by the programmer; not defined by Java
Strings, arrays, and class are nonprimitives
usually don't add access modifier in front of method
*/

int addition(arg){
	return a + b;
}

/*
the int is the return type(the data type that will be returned)
static and final are also modifiers
final is when you don't want to change the value
abstract - used by program leaders to tell junior programmers what to do (don't need to know this yet)
data can be all but static

encapsulation is when no one can see the data and are not allowed to overwrite the contents
*/