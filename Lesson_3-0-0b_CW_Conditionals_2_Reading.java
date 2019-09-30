//Lesson 3-0-0b CW Conditionals_1_Reading
//Name: Krystal
//Date: 9/4/19
//Class: Java

//For each problem, read the code then give the output.  DO NOT USE YOUR IDE;

//Problem 1:  //from https://beginnersbook.com/2017/08/if-else-statement-in-java/
//datalist: 70, 85, 101, 100, 145
public class Problem1 {

   public static void main(String args[]){
      int num = number from data list above;
      if( num < 100 )
      {
	  	System.out.println("number is less than 100");
      }
      else if (num == 100){
      	System.out.println("number is 100");
      }
      else
      {
      	System.out.println("number is greater than 100");
      }
   }
}

//Problem 1 answers for each number substituted for num:
/*
70: number is less than 100
85: number is less than 100
101: number is greater than 100
100: number is 100
145: number is greater than 100
*/

//Problem 2:  
//datalist: 120, 100, 50, 25, -45
public class Problem2 {

   public static void main(String args[]){
     int num = number from datalist above;
     if( num < 50 )
     {
		System.out.println("num is less than 50");
     }
     else {
		System.out.println("num is greater than or equal 50");
     }
   }
}

//Problem 2 answers for each number in datalist
/*
120: num is greater than or equal 50
100: num is greater than or equal 50
50: num is 50
25: num is less than 50
-45: num is less than 50
*/

//Problem 3: 
//datalist: 1234, 14690, -45, 150000, 17, 1000000

public class Problem3 {

   public static void main(String args[]){
	int num=1234;
	if(num < 100 && num >= 1) {
	  System.out.println("Its a two digit number");
	}
	else if(num < 1000 && num >= 100) {
	  System.out.println("Its a three digit number");
	}
	else if(num < 10000 && num > =1000) {
	  System.out.println("Its a four digit number");
	}
	else if(num < 100000 && num >= 10000) {
	  System.out.println("Its a five digit number");			
	}
	else {
	  System.out.println("number is not between 1 & 99999");			
	}
   }
}

//Problem 3 answers for each number in datalist
/*
1234: Its a four digit number
14690: Its a five digit number
-45: number is not between 1 & 99999
150000: number is not between 1 & 99999
17: Its a two digit number
1000000: number is not between 1 & 99999
*/



//Problem 4: You may use your IDE for this problem ONLY AFTER you have tried this by hand.
//datalist: -1, -2, 0, 3, 4, 16

public class Problem4 {
	public static void main(String[] args)
	{
		int num = something from datalist;
		
		if((num % 2) == 0)
		{
			System.out.println("even number");
		}
		
		else 
		{
			System.out.println("odd number");
		}
	}
}

//Problem 4 answers for each number in datalist 
/*
-1: odd number
-2: even number
0: even number
3: odd number
4: even number
16: even number
*/
