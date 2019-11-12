//Lesson 5-0-1 Java Classes, Methods and Instance Variables
//Krystal
//11/6/19
//Java

Answer each of the following questions based on the information in 
Lecture 5-0-1 Java Classes, Methods and Instance Variables

1. Explain the difference between primitive and reference types.
answer
primitives are already defined in Java while non primitives are not
primitives have a value; non primitives do not

2. Give three examples of primitive types.
answer
int, double, boolean

3. Give three examples of reference types.
answer
Strings, arrays, classes

4. What is the other name for reference types?
answer
non primitives

5. What are the members of a class?
answer
the methods and variables defined within a class

6. Declare a sample class with members.
answer
class Kitchen{
	private int pans;
	private int squareFeet;
	private String theme;

	public void run(){

	}
}

7. List the access modifiers.
answer
private, public, protected, default

8. Define the static keyword.
answer
allows access to members in its class without creating an object of a class

9. Define the final keyword.
answer
tell the compiler not to change the value of a variable once assigned

10. Make a version of the modifiers table below. Line everything up properly.
answer
+---------+---------+-----------+---------+--------------+
|modifier |  class  |constructor| method  |date/variables|
+---------+---------+-----------+---------+--------------+
|public   |Yes		|Yes		|Yes	  |Yes			 |
+---------+---------+-----------+---------+--------------+
|protected|			|Yes		|Yes	  |Yes			 |
+---------+---------+-----------+---------+--------------+
|default  |Yes		|Yes		|Yes	  |Yes			 |
+---------+---------+-----------+---------+--------------+
|private  |			|Yes		|Yes	  |Yes			 |
+---------+---------+-----------+---------+--------------+
|static   |			|			|Yes	  |				 |
+---------+---------+-----------+---------+--------------+
|final    |Yes		|			|Yes	  |Yes			 |
+---------+---------+-----------+---------+--------------+


11. Which modifiers can be applied to a method?
answer
public, protected, default, private, static, final

12. Which modifiers can be applied to a class?
answer
public, default, final

13. Which modifiers can be applied to Data/variables?
answer
public, protected, default, private, final

14. Which modifiers can be applied to a constructor?
answer
public, protected, default, private
