/*Lecture 3-1-0 Increment and Decrement Operators  info from: https://codescracker.com/java/java-increment-decrement.htm

The operator (++) and the operator (--) are the Java language increment and decrement operators. The increment (++) and decrement operator (--) 
are simply used to increase and decrease the value by one.

The increment operator increases its operand by one and the decrement operator simply decreases its operand by one. For instance, the statement :*/

x = x + 1;
//can be rewritten like this by use of the increment operator i.e., ++:

x++;
//Similarly, the statement :

x = x - 1;
//is equivalent to:

x--;
/*These operators are unique in that they can appear both in postfix (where they follow the operand) and prefix (where they precede the operand) form.

Prefix Increment and Decrement Operator
In prefix form, the operand is incremented or decremented before the value is received for use in the expression.

Postfix Increment and Decrement Operator
In postfix form, the previous value is obtained for the use in expression, and then the operand is modified.

Example
Here in the examples, there is no difference between the prefix and the postfix forms. However, when the increment and/or decrement operators 
are the part of a larger expression, then a subtle, however powerful, difference between these two forms appears. Here is an example: */

x = 42;
y = ++x;
//Here, y is set to 43 as you would expect, as the increment occurs before x is assigned to y. Therefore, the line y = ++x; is equivalent of these two statements:

x = x + 1;
y = x;
//However, when we written like this,

x = 42;
y = x++;
//here the value of x is obtained before increment operator is executed, so the value of y is 42. Naturally, in both cases, x is set to 43. 
//Here, the line y = x++; is equivalent of these two statements :

y = x;
x = x + 1;
//Java Increment and Decrement Operators Example
//This Java program demonstrates the increment operator :

/* Java Program Example - Java Increment Decrement Operator
 * This program demonstrates the increment (++) operator 
 */

public class JavaProgram
{   
    public static void main(String args[])
    {
        
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b; //add 1 to b, then assign b to c (c = 3)
        d = a++; //assign d to a, then add 1 to a
        c++; //add 1 to c (c = 4)
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
        
    }
}
//When the above Java program is compile and executed, it will produce the following output:

//java increment and decrement operators
//Now, this Java program demonstrates the decrement operator :

/* Java Program Example - Java Increment Decrement Operator
 * This program demonstrates the decrement (--) operator 
 */

public class JavaProgram
{   
    public static void main(String args[])
    {
        
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = --b; //subtract 1 from b, then assign c to b (c = 1, b = 1)
        d = a--; //assign d to a, then subtract 1 from a (d = 1, a = 0)
        c--; //subtract 1 from c; assign the new value to c (c = 0)
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
        
    }
}
//When the above Java program is compile and executed, it will produce the following output:

java increment and decrement operators example
a = 0
b = 1
c = 0
d = 1