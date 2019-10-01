//Lesson 4-0-1 CW While Loops Probs 1
//Name: Krystal Kwan
//Date: 9/25
//Class: Java

//Problem1  Find the mistake in the code.  What will happen if this code is run?
public class Problem1 {
    public static void main(String [] args){ //[] should be between String and args
        int i = 10;
        while(i > 1)
        {
            System.out.println(i);
            i++;
        }
    }
}
// because the starting number 10 is already greater than 1 and i always increases, it will never decrease to 1
// the code causes an infinite loop

//Problem2 What will be printed if this code is run?
public class Problem2 {
    public static void main(String args[]){
        int i = 10;  				//initial boolean is (i > 1) where i has a value of 10
        while(i > 1){   			//keep looping as long as i is greated than 1
            System.out.println(i);  //print out the value of i during each loop
            i--;  					//decrement i
        }
    }
}  									//Be sure that the curly braces match!!
/*Output
10
9
8
7
6
5
4
3
2
(Doesn't print out 1 since 1 isn't greater than 1)
*/


//Problem3  What will be printed if this code is run?
public class Problem3 {
    public static void main(String args[]){
		int myArray[] = {2, 11, 45, 9}; //adds the values 2, 11, 45, and 9 to an array called myArray
		//i starts with 0 as array index starts with 0 too
		int i = 0; //sets i to 0
		while(i < 4){ //start a while loop and will keep repeating until i is less than 4
		    System.out.println(myArray[i]); //prints out a value in myArray that corresponds to the value of i
		    i++; //adds 1 to i at the end of the loop

		}
  }
}
/*Output
2
11
45
9
*/

//Problem4  What will be printed if this code is run?
public class Problem4 {

   public static void main(String args[]) {
      int x = 10; //set a variable named x to 10

      while( x < 20 ) { //begins a while loop that will keep repeating as long as x is less than 20
         System.out.print("value of x : " + x ); //prints out the value of x
         x++; //adds 1 to the current value of x
         System.out.print("\n"); //does a carriage return and makes a new line
      }
   }
}
/*Output
10
11
12
13
14
15
16
17
18
19
*/

//Problem5  What will be printed if this code is run?
public class Problem5 {

   public static void main(String args[]) {
		int i = 0; //set an integer variable i to 0
		while (i < 5) { //begin loop and continue as long as i is less than 5
  			System.out.println(i); //print out the value of i
  			i++; //adds 1 to i
  	}
  }
}
/*Output
0
1
2
3
4
*/


//Problem6  What will be printed if this code is run?
public class Problem6 {
	public static void main(String[] args) {
		int count = 1; //set count to 1
		int limit = 11; //set limit to 11
		while (count < limit) //begin while loop and continue until count is less than limit
		{
		System.out.println("Loop counter: " + count); //print out the value of count
				count++; //add 1 to count
		}
	}
}
/*Output
1
2
3
4
5
6
7
8
9
10
*/
