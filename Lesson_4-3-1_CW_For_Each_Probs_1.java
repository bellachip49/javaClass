//Lesson 4-3-1 CW For Each Probs 1
//Krystal
//10/23/19
//Java

//Problem1 Make a class and main method.  Use this array: String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};  
//Print each element of the array on its own line.
public class Problem1{
	public static void main(String [] args){
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for(String name : cars){
            System.out.println(name);
        }
	}
}

//Output
/*Volvo
BMW
Ford
Mazda*/

//Problem2 Make a class and main method.  Use this array: String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};  
//Print each element of the array on one line with a space between the names.


//Problem3 Make a class and main method.  Use this array: int[] numbers = {3, 4, 5, -5, 0, 12};  
//Using a for...each loop, print the sum of the array.


//Problem4 Make a class and main method. Make an int array by declaring it, then showing code which adds 
//the numbers 1 to 7 to the array.  You may use a regular for loop for this.
// The use a for...each loop to print the numbers on a single line with a + between them, then print =, 
//then print the sum of the numbers.

/*Problem5 Make a class and main method. Make a String array by declaring it, then showing code which 
//adds the words The San Francisco Bay Area one by one to the array.  You may use a regular for loop for this.
 The use a for...each loop to print the words on a single line with a space between them*/

 /*Problem6 Make a class and main method. Make a String array by declaring it, then showing code which 
adds the numbers the words The Man On The Top Of The World one by one to the array.  You may use a regular for loop for this.
 The use a for...each loop to Count the number of times the word The is used and print the result in sentence-long print statement*/

 /*Problem7 Make a class and main method. Make a String array by declaring it, then showing code which 
adds the numbers the words -The Restaurant At The End Of The Universe- one by one to the array.  You may use a regular for loop for this.
 Then use a for...each loop to print each word on its own line with five exclamation points after it */