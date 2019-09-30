//Lesson 3-0-0c CW Conditionals_1_Reading  from: https://www.careerbless.com/java/basics/LogicalOperators.php
//Name: Krystal
//Date: 9/10/19
//Class: Java

//Problem 1
public class Problem1 {

   public static void main(String args[]) {
      boolean firstNum;
      boolean secondNum;

      System.out.println("firstNum && secondNum = " + (firstNum && secondNum));  //first line
      System.out.println("firstNum || secondNum = " + (firstNum || secondNum) );  //second line
      System.out.println("!(firstNum && secondNum) = " + !(firstNum && secondNum));  //third line
      System.out.println("Not firstNum = " + !firstNum); //fourth line
   }
}

//What will first line be for each of the following:
/*
firstNum is true, secondNum is true:
true
firstNum is true, secondNum is false:
false
firstNum is false, secondNum is true:
false
firstNum is false, secondNum is false:
false

What will second line be for each of the following:
firstNum is true, secondNum is true:
true
firstNum is true, secondNum is false:
true
firstNum is false, secondNum is true:
true
firstNum is false, secondNum is false:
false

What will third line be for each of the following:

firstNum is true, secondNum is true:
false
firstNum is true, secondNum is false:
true
firstNum is false, secondNum is true:
true
firstNum is false, secondNum is false:
true
What will fourth line be for each of the following:

firstNum is true:
false
firstNum is false:
true
*/

//Problem 2
//Consider the following piece of code.

int value1 = 10; 
int value2 = 20; 
int value3 = 30;

boolean result1 =   value2 > value1   ||   value2 < value3; 
boolean result2 =   value2 < value1   ||   value2 < value3; 
boolean result3 =   value2 > value1   ||   value2 > value3; 
boolean result4 =   value2 < value1   ||   value2 > value3;

/*What is
result1: true
result2: true
result3: true
result4: false
*/

//Problem 3
boolean flag = false; 
boolean newFlag = ! flag;

//What will be the value of the boolean type variable newFlag?
//newFlag is true

//Problem 4
int test1 = 10; 
int test2 = 15; 
int test3 = 20; 

boolean testResult1 = test1 < test2; 
boolean testResult2 = !(test1 < test2); 
System. out .println( "testResult1 ;   " + testResult1); 
System. out .println( "testResult2 ;   " + testResult2); 

boolean testResult3 = (test1 < test2) && (test2 < test3); 
boolean testResult4 = !((test1 < test2) && (test2 < test3)); //Should use parentheses - makes things easier to understand
System. out .println( "testResult3 ;   " + testResult3); 
System. out .println( "testResult4 ;   " + testResult4);

/*What will be the values of the variables   
testResult1 true
testResult2 false
testResult3 true
testResult4 false
*/