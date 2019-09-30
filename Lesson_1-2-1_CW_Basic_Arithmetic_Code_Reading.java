//Lesson 1-2-2 CW Basic ArithmeticException
//Instructions: WRITE NOTES ON THIS CODE DURING CLASS
//Name: Krystal
//Date: 9/3/19
//Class: Java


//this code is from https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
class ArithmeticDemo {  

    public static void main (String[] args) {

        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);  //NOTE: once you have declared a variable with a type, you don't have to use the type again.
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
    }
}

//This program prints the following:

1 + 2 = 3
3 - 1 = 2
2 * 2 = 4
4 / 2 = 2
2 + 8 = 10
10 % 7 = 3
//You can also combine the arithmetic operators with the simple assignment operator to create compound assignments. 
//For example, x += 1; and x = x + 1; x++ both increment the value of x by 1.

/*Code from https://javaranch.com/drive/modulo.html
JRJC - How To Use Modulo
Modulo is nothing more than "remainder after division."
So 20 modulo 5 is 0 because 20 divided by 5 is 4 with no remainder.

21 modulo 5 is 1 22 modulo 5 is 2 23 modulo 5 is 3 24 modulo 5 is 4 25 modulo 5 is 0
In C, C++ and Java, modulo is represented as the percent sign. So*/

    int a = 20 % 5 ;

//sets a to be zero.
//Modulo has a variety of uses. If you want to know if a number is an even "hundred", like 300, 400, 500 or 256700, you can test for it like this:


    if ( ( a % 100 ) == 0 )
    {
        System.out.println( a + "exactly!");
    }

//Another cool thing to do with modulo is when you are doing big processes, you can let the user know that your program is not stuck:

    TextFileIn f = new TextFileIn("bigfile.txt");
    int numLines = 0 ;
    boolean done = false ;
    while( ! done )
    {
        String s = f.readLine();
        if ( s == null )
        {
            done = true ;
        }
        else
        {
            // processing the big file goes here
            numLines++;
            if ( ( numLines % 1000 ) == 0 )
            {
                System.out.print(".");
            }
        }
    }

//This program fragment will read in a file, process it, and write a dot to the screen for every 1000 lines processed.