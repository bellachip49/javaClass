//Lesson CW 4-1-0 For loop Intro
//Name: Krystal
//Date: 10/1/19
//Class: JAVA

/*Java Simple For Loop
A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value. It consists of four parts:

Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an 
//already initialized variable. It is an optional condition.
Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. 
//It must return boolean value either true or false. It is an optional condition.
Statement: The statement of the loop is executed each time until the second condition is false.
Increment/Decrement: It increments or decrements the variable value. It is an optional condition.

Syntax:

for(initialization;condition;incr/decr){  
    //statement or code to be executed  
}  

//initialization: declare an int variable with a value
//condition: use that int variable to make a boolean
//incr/decr: increment or decrement the int variable such that eventually the condition will be changed to false and the loop will end.*/

//For each for loop example, comment the code, then write the output below.

public class ForExample1 {  
	public static void main(String[] args) {  
	    
    for(int i = 1; i <= 10; i++){  //initialize: i =1, condition i <= 1 incr/decr i++
        System.out.println(i);  //print i
    }  
	}  
}  
//Output:
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10


public class ForExample2 {
   public static void main(String[] args) {
      
      for (int i = 1; i <= 10; ++i) {
         System.out.println("Line " + i);
      }
   }
}
//Output:
// Line 1
// Line 2
// Line 3
// Line 4
// Line 5
// Line 6
// Line 7
// Line 8
// Line 9
// Line 10

public class ForExample3 {
   public static void main(String[] args) {
      
      int sum = 0;
	   
	    for (int i = 1; i <= 1000; ++i) {
	        sum += i;     
	    }
	   
      System.out.println("Sum = " + sum);
   }
}
//Output:
//500500

public class ForExample4 {
   public static void main(String[] args) {
      
      	for (int i = 0; i <= 10; i = i + 2) {
  			System.out.println(i);
		}
    }
}
//Output:
//Error - curly braces should not be on top of each other
// 0
// 2
// 4
// 6
// 8
// 10 

public class ForExample5 {
   public static void main(String[] args) {
      
      	for(int i = 10; i > 1; i--){
              System.out.println("The value of i is: "+ i);
        }
    }
}
//Output:
/*The value of i is: 10
The value of i is: 9
The value of i is: 8
The value of i is: 7
The value of i is: 6
The value of i is: 5
The value of i is: 4
The value of i is: 3
The value of i is: 2*/

//DANGER ZONE: INFINITE FOR LOOPS
//Other possibilities:
// infinite loop: if you put nothing but semi-colons in the for condition, the loop will be infinite
for ( ; ; ) {
    
    // your code goes here
}
//Why is this an infinite loop?
//if there is nothing, the condition will always be true.

class InfiniteForLoop1 {
    public static void main(String args[]){

        for(int i = 1; i >= 1; i++){
            System.out.println("The value of i is: "+ i);
        }
    }
}
//Why is this an infinite loop?
//1 is always added to i, which will always be greater or equal to 1, which makes the loop infinite

class InfiniteForLoop2 {
   public static void main(String[] args) {
      
      int sum = 0;
      for (int i = 1; i <= 10; --i) {
         System.out.println("Hello");
      }
   }
}
//Why is this an infinite loop?
//i is 1 initially and i is subtracted by 1 every time. i will never go past 10 since it keeps decreasing