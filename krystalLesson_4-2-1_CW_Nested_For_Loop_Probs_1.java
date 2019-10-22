//Lesson 4-2-1 CW Nested For Loop Probs 1
//Krystal
//10/15/19
//Java

//A comment outline is a way of thinking through the code before you start writing actual code.
//Write pseudocode. Pesudocode is half code half English

//Write a class and main method with a nested for loop to solve all of the following problems

//Problem1 Write Java code to print a block of letters using the letter "a", given 4 rows and 3 columns
a a a
a a a
a a a
a a a

public class Problem1{
  public static void main(String [] args){
    //need variables for rows and columns

    //nested for loop to go thorough the rows and column
    //print the letter a for loop
    for(int i = 1; i < 5; i++){
      for(int j = 1; j < 4; j++){
        System.out.print("a ");
      }
      System.out.println();
    }
  }
}

//Output
/*a a a
a a a
a a a
a a a*/

//Problem2 Write Java code to print a block of letters using the letter "b" given x rows and y columns, where x and y can be any number.
//Test it with x = 2, y = 4, then x = 5, y = 10, the check what happens with 0, a negative number and x > y.
public class Problem2{
  public static void main(String [] args){
    int x_rows = 2;
    int y_col = 4;
    for(int i = 1; i < (x_rows + 1); i++){
      for(int j = 1; j < (y_col + 1); j++){
        System.out.print("b ");
      }
      System.out.println();
    }
  }
}

//Output
// x = 2, y = 4
/*b b b b 
b b b b */

//x = 5, y = 10
/*b b b b b b b b b b 
b b b b b b b b b b 
b b b b b b b b b b 
b b b b b b b b b b 
b b b b b b b b b b */

//when value is 0 or negative, there is no output.

//Problem3 Write a nested for loop that prints 7 stars on the first line, 6 stars on the second line...down to 
// one star on the last line.
* * * * * * * 
* * * * * *
* * * * *
* * * *
* * *
* *
*
public class Problem3{
  public static void main(String [] args){
    for(int i = 7; i > 0; i--){
      for(int j = i; j > 0; j--){
        System.out.print("* ");
      }
        System.out.println();
    }
  }
}

//Output
/** * * * * * * 
* * * * * *
* * * * *
* * * *
* * *
* *
**/

//Problem4 Write Java code to reverse Problem3, printing 1 star on the first line, 2 on the second line down to 7 on the last line
public class Problem4{
  public static void main(String [] args){
    for(int i = 7; i > 0; i--){
      for(int j = i; j < 8; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

//Output
/** 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * */

//Problem5 Write Java code to combine problem3 and problem4 using TWO nested loops to make a triangle pattern with 7 across the middle
*
* *
* * * 
* * * * 
* * * * *
* * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * * 
* * * 
* *
*
public class Problem5{
  public static void main(String [] args){
    for(int i = 7; i > 0; i--){
      for(int j = i; j < 8; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
      for(int i = 6; i > 0; i--){
        for(int j = i; j > 0; j--){
          System.out.print("* ");
        }
        System.out.println();
    }
  }
}

//Output
/** 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* */

//Problem6 Write Java code to alter problem 5 using spaces to make a diamond pattern
      *
     * *
    * * * 
   * * * * 
  * * * * *
 * * * * * *
* * * * * * *
 * * * * * *
  * * * * *
   * * * * 
    * * * 
     * *
      *
public class Problem6{
    public static void main(String [] args){
        //Declare variable
        int numRows = 7;
        //make top half of diamond
        //loop for spaces
        //loop for stars
        //bottom half of diamond
        //loop for spaces
        //loop for stars
        for (int i = 7; i > 0; i--) {
            for(int j = (i - 1); j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 13; k >= 2 * i - 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 6; i > 0; i--) {
            for (int k = i; k < 7; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Output
/*    *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *        */
//Problem7 Write Java code to use numbers instead of stars in the pattern from problem3
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21 
22 23 24 25 26 27 28 

public class Problem7{
    public static void main(String [] args){
        int counter = 1;
        for(int i = 7; i > 0; i--){
            for(int j = i; j < 8; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}

//Output
/*1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 */

//Problem8 Write Java code to take all the letters in a string and print them one per line.
String name = "Crosspoint Academy";
public class Problem8{
  public static void main(String [] args){
    String name = "Crosspoint Academy";
    for(int i = 0; i <= name.length()-1; i++){
        System.out.println(name.charAt(i));
    }
  }
}

//Output
/*C
r
o
s
s
p
o
i
n
t
 
A
c
a
d
e
m
y*/
//Problem9 Write Java code to replace all the "a" substrings in "California Crosspoint Academy" with the letter "b"
//NOT A LOOP PROBLEM, LOOK FOR .replace in String documentation
public class Problem9{
  public static void main(String [] args){
    String name = "California Crosspoint Academy";
    System.out.println(name.replace('a', 'b'));
  }
}

//Output
// Cblifornib Crosspoint Acbdemy

//Problem10 Write Java code to concatenate a given string with itself of a given number of times.  Use this string: "Hey" and concatenate 6 times.
//NOT A NESTED LOOP...JUST A SIMPLE LOOP
public class Problem10{
  public static void main(String [] args){
    String greeting = "Hey";
    String result = "";
    for(int i = 1; i <= 6; i++){
        result = greeting + result;
    }
    System.out.println(result);
  }
}

//Output
//HeyHeyHeyHeyHeyHey
