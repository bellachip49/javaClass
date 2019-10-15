//Lesson 4-2-0 CW Nested For Loops Intro
//Krystal
//10/7/19
//Java


//The basics of a nested for loop
for (int i = 1; i <= 5; ++i) {
   // codes inside the body of outer loop
   for (int j = 1; j <=2; ++j) {
      // codes inside the body of both outer and inner loop
   }
   // codes inside the body of outer loop
}

//COMMENT THE CODE AND FIGURE OUT THE OUTPUT
//one off error: missed desired outcome by 1

public class NestedForLoop1 {
   public static void main(String[] args) {
      
      for (int i = 1; i <= 5; ++i) { //loop until i is greater than 5
         System.out.println("Outer loop iteration " + i); //prints out every row
         for (int j = 1; j <=2; ++j) { //loop until j is greater than 2
            System.out.println("i = " + i + "; j = " + j); //prints out every column
         }
      }
   }
}

//Output
/*Outer loop iteration 1
i = 1; j = 1
i = 1; j = 2
Outer loop iteration 2
i = 2; j = 1
i = 2; j = 2
Outer loop iteration 3
i = 3; j = 1
i = 3; j = 2
Outer loop iteration 4
i = 4; j = 1
i = 4; j = 2
Outer loop iteration 5
i = 5; j = 1
i = 5; j = 2*/

public class NestedForLoop2 {
   public static void main(String[] args) {
      
      int rows = 5;
      
      for(int i = 1; i <= rows; ++i)//loop until i > 5
      {
          for(int j = 1; j <= i; ++j)//loop until j > i
          {
             System.out.print(j + " ");
          }
          System.out.println("");
      }
   }
}
//Output
/*1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 */

public class NestedForLoop3{   
    public static void main(String args[])
    {
        int i, j;
        
        for(i = 0; i < 10; i++)//loop until i is greater or equal to 10
        {
            for(j = 0; j < i; j++) //loop until j is greater or equal to i
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Output

/*
*
**
***
****
*****
******
*******
********
**********/



//SPECIAL CASES
class NestedLoop {
   public static void main(String[] args) {
      
      int i = 1;
      
      while (i <= 5) { //loop until i > 5
       
         System.out.println("Outer loop iteration " + i);
         for (int j = 1; j <= 2; ++j) { //loop until i > 2
            System.out.println("i = " + i + "; j = " + j);
         }
         
         ++i;
      }
   }
}
//Output
/*Outer loop iteration 1
i = 1; j = 1
i = 1; j = 2
Outer loop iteration 2
i = 2; j = 1
i = 2; j = 2
Outer loop iteration 3
i = 3; j = 1
i = 3; j = 2
Outer loop iteration 4
i = 4; j = 1
i = 4; j = 2
Outer loop iteration 5
i = 5; j = 1
i = 5; j = 2
*/


