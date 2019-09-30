//Lecture 3-0-1a Comparisons

/*Logical Operators  Information from : https://www.w3schools.in/java-tutorial/operators/logical/, edited.

&&	Logical AND	If both operands are true then only "logical AND operator" evaluate true.
||	Logical OR	The logical OR operator is only evaluated as true when one of its operands evaluates true. 
	If either or both expressions evaluate to true, then the result is true.
!	Logical Not	Logical NOT is a Unary Operator, it operates on single operands. It reverses the value of operands, 
	if the value is true, then it gives false, and if it is false, then it gives true.*/

public class LogicExample {
 public static void main(String[] args) {
  //Variables Declaration and Initialization
  boolean bool1 = true, bool2 = false;  //Teacher comment: you can put two declarations on one line using the type only once.

  //Logical AND
  System.out.println("bool1 && bool2 = " + (bool1 && bool2));  //true && false makes false
  
  //Logical OR
  System.out.println("bool1 || bool2 = " + (bool1 || bool2) );
  
  //Logical Not
  System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));

 }
}

/*
Output:
bool1 && bool2 = false
bool1 || bool2 = true
!(bool1 && bool2) = true
*/

Conditional AND (&&)  //Notice: if there is even one false, the whole thing is false
false && false: false
false && true: false
true && false: false
true && true: true

Conditional OR (||)  //Notice: if there is even one true, the whole thing is true
false || false: false
false || true: true
true || false: true
true || true: true

Logical NOT (!)
!false: true
!true: false

DeMorgans Laws (MEMORIZE THIS!)
Not (A and B) is the same as Not A or Not B.

Not (A or B) is the same as Not A and Not B.