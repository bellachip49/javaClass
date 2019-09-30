//Lesson 1-2-2 Basic Arithmetic writing
//Name:
//Date:
//Class:

//Try each of the following things:
make a variable for addition
For example: 
int myAdditionAnswer;

Now play with it.
Make it equal to 1 + 1
What happens if you have a row of addition like 3 + 4 + 10 + 55
What happens if you have both addition and substraction?
What happens if you just have substraction?
What happens if you have just multiplication
What happens when you combine multiplication and addition or substraction?

Here is one set to start you off:  //code from https://www.tutorialspoint.com/java/java_arithmatic_operators_examples
public class Test {

   public static void main(String args[]) {
      int a = 10;
      int b = 20;
      int c = 25;
      int d = 25;

      System.out.println("a + b = " + (a + b) );
      System.out.println("a - b = " + (a - b) );
      System.out.println("a * b = " + (a * b) );
      System.out.println("b / a = " + (b / a) );
      System.out.println("b % a = " + (b % a) );
      System.out.println("c % a = " + (c % a) );
      System.out.println("a++   = " +  (a++) );
      System.out.println("b--   = " +  (a--) );

      // Check the difference in d++ and ++d
      System.out.println("d++   = " +  (d++) );
      System.out.println("++d   = " +  (++d) );
   }
}

Here is another:  //code from https://codescracker.com/java/java-arithmetic-operators.htm
/* Java Program Example - Java Arithmetic Operators
*  This program demonstrates the basic arithmetic operators. */

public class JavaProgram
{   
    public static void main(String args[])
    {
        
        /* arithmetic using integers */
        System.out.println("Integer Arithmetic");
        int a = 2 + 2;
        int b = a * 6;
        int c = b / 16;
        int d = c - a;
        int e = -d;        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + c);
        
        /* arithmetic using doubles */
        System.out.println("\nFloating Point Arithmetic");
        double da = 2 + 2;
        double db = da * 6;
        double dc = db / 16;
        double dd = dc - da;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
        
    }
}

And another:  //code from https://www.javaguides.net/2018/10/arithmetic-operators-in-java-with.html
package net.javaguides.corejava.operators.arithmetic;

public class BasicMath {
    public static void main(String args[]) {
        // arithmetic using integers
        System.out.println("Integer Arithmetic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        // arithmetic using doubles
        System.out.println("\nFloating Point Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }
}