Lesson 4-6-0 CW Loops and Strings
//Krystal
//10/28/19
//Java

Complete each of the following problems in IntelliJ.  Put the code and the output in 
this file and turn it in as a .java file.

1. Write a while loop to count to 10.  
The output should look like this: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
Notice that there is no comma after the 10.

public class Problem1{
	public static void main(String [] args){
        int count = 1;
        
        while(count < 11){
            {
                if(count < 10){
                    System.out.print(count + ", ");
                }
                else{
                    System.out.print("10");
                }
                count++;
            }
        }
    }
}

//Output
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10

2. Write a for loop to count to 10.
The output should look like this: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
Notice that there is no comma after the 10.

public class Problem2{
	public static void main(String [] args){
        for(int i = 1; i < 11; i++){
            {
                if(i < 10){
                    System.out.print(i + ", ");
                }
                else{
                    System.out.print("10");
                }
            }
        }
    }
}

//Output
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10

3. Write a nested for loop to count to 10 five times. 
The output should look like this:
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10

public class Problem3{
	public static void main(String [] args){
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 11; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//Output
/*1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 */

4. Write a class with a main method which contains this string: String myStr = "I love Java!";
Find the length of the string.  Find the fifth character of the string using substring.
public class Problem4{
	public static void main(String [] args){
        String myStr = "I love Java!";

        System.out.println("The length of the given string is " + myStr.length() + ".");
        System.out.println("The fifth character of the string is " + myStr.substring(4,5) + ".");
    }
}

//Output
/*The length of the given string is 12.
The fifth character of the string is v.*/
