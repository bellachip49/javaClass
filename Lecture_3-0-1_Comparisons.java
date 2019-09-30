//Lesson 3-0-1 Conditionals Practice 1
//Name:
//Date:
//Class:

/*The equality and relational operators determine if one operand is greater than, less than, equal to, or not equal to another operand. 
The majority of these operators will probably look familiar to you as well. Keep in mind that you must use "==", not "=", when testing 
if two primitive values are equal.*/  //Information from: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html

==      equal to
!=      not equal to
>       greater than
>=      greater than or equal to
<       less than
<=      less than or equal to
The following program, ComparisonDemo, tests the comparison operators:


class ComparisonDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    }
}
Output:

value1 != value2
value1 <  value2
value1 <= value2

//MORE from: https://mathbits.com/MathBits/Java/Conditionals/Operators.htm
Relational Operators 
There are six relational (comparison) operators used for data comparisons in Java. 

Operator	Description
= =		equal to
! = 	not equal to
>		greater than
> = 	greater than or equal to
<		less than
< = 	less than or equal to

Check out this numerical example:  

Assume these values are assigned:

int a = 4;
int b = 12;
int c = 16;
int d = 4;

... then the following are true:

a = = d
b < c
c > a
 
 	
Notice that ONE equal sign is used to "assign" a value, but TWO equal signs are used to check to see if numerical values are equal to one another.

Relational operators always yield a true or false result.  
if ( (x > 5) = = true)
(does not accept 0 as false and 1 as true as you may expect)

Relational operators have a lower precedence than the arithmetic operators.  This means that an expression such as  x + 4 > = y - 5
is the same as (x + 4) > = (y - 5).

Caution:  The = = is NOT used with String variables.
Remember, String variables are stored in memory by storing addresses to the actual string text.  If we tried to use the = = operator, 
we would be comparing the addresses and not the actual string text.

 To test two String variables (or any two objects) to see if they have equal values, you must use the method equals rather than = =.
                    s1.equals(s2)       //checks for equality
                    s1.equalsIgnoreCase(s2)  //checks for equality ignoring case

