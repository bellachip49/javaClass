//Lesson 3-0-1 Math_1_Reading_Modulo
//Name
//Date
//Class

//sources: https://www.java-examples.com/modulus-operator-example

//Problem 1 Read the following code.  What will be the output?
public class Problem1 {
 
	public static void main(String[] args) {
		 
		 int intNum = 50;
		 double doubNum = 32;
		 
		 System.out.println("i mod 10 = " + intNum % 10);
		 System.out.println("d mod 10 = " + doubNum % 10);
	}
}

//Problem1 Output:


//Problem 2 Read the following code.  What will be the output?  After you complete this assignment and turn it in, 
//you may try this in your IDE
public class Problem2 {
    public static void main(String[] args) {
        int result = 1000 % 90; 
        System.out.println(result);  //line 1

        result = 100 % 90; 
        System.out.println(result);  //line 2

        result = 81 % 80; 
        System.out.println(result);  //line 3

        result = 6 % 4; 
        System.out.println(result);  //line 4

        result = 17 % 5; 
        System.out.println(result);  //line 5

        result = 45 % 11; 
        System.out.println(result);  //line 6

        result = 1 % 1; 
        System.out.println(result);  //line 7

    }
}

/*Problem 2 Output:
line 1:
line 2:
line 3:
line 4:
line 5:
line 6:
line 7:
*/

//Problem 3
public class Problem3 {
    public static void main(String[] args) {
        int result = 10 / 5; 
        System.out.println(result);  //line 1

        result = 11 / 5; 
        System.out.println(result);  //line 2

        result = 10.0 / 5.0; 
        System.out.println(result);  //line 3

        result = 11 / 5; 
        System.out.println(result);  //line 4

        result = 11 / 5.0; 
        System.out.println(result);  //line 5

        result = 25 / 11; 
        System.out.println(result);  //line 6

        result = 22 / 11; 
        System.out.println(result);  //line 7

    }
}

/*Problem 3 Output:
line 1:
line 2:
line 3:
line 4:
line 5:
line 6:
line 7:
*/
