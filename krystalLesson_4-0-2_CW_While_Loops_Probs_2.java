//Lesson 4-0-2 CW While Loops Probs 2
//Krystal
//9/25
//Java

//Complete the following Java problems using a while loop
//Problem1: Write a class named Problem1 with a main method and a while loop that counts upward from 11 to 19, each value on its own line.
public class Problem1{
	public static void main(String [] args){
		int i = 11;

		while(i < 20){
			System.out.println(i);
			i++;
		}
	}
}
/*Output
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

//Problem2: Write a class named Problem2 with a main method and a while loop that counts upward from -1 to 9 on one line with spaces between the numbers.
public class Problem2{
	public static void main(String [] args){
		int j = -1;

		while(j < 10){
			System.out.println(j);
			j++;
		}
	}
}
/*Output
-1
0
1
2
3
4
5
6
7
8
9
*/

//Problem3: Write a class named Problem3 with a main method and a while loop that prints all the even numbers from 2 to 100, inclusive,
// on one line with spaces between the numbers.
public class Problem3{
	public static void main(String [] args){
		int k = 2;

		while(k < 102){
			System.out.println(k);
			k += 2;
		}
	}
}

/*Output
2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
82
94
96
98
100
*/

//Problem4: Write a class named Problem4 with a main method and a while loop that counts upward from 11 to 19, printed with one value per line.
public class Problem4{
	public static void main(String [] args){
		int i = 11;

		while(i < 20){
			System.out.println(i);
			i++;
		}
	}
}
/*Output
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
//Problem5: Write a class named Problem5 with a main method and a while loop that prints each value in the following array with one value per line:
int [] primeArray = {2, 3, 5, 7, 11, 13, 17, 23, 29};

public class Problem5{
	public static void main(String [] args){
		int i = 0;

		while(i < 9){
			System.out.println(primeArray[i]);
			i++;
		}
	}
}
/*Output
2
3
5
7
11
13
17
23
29
*/

//Problem6: Write a class named Problem6 with a main method and a while loop that adds 2 toeach value in the 
//following array, then prints those values on a single line with spaces between the numbers:
int [] primeArray = {2, 3, 5, 7, 11, 13, 17, 23, 29};
public class Problem6{
	public static void main(String [] args){
		int i = 0;

		while(i < 9){
			System.out.print(primeArray[i] + 2 + " ");
			i++;
		}
	}
}
//Output
//4 5 7 9 13 15 19 25 31

//Problem7: Write a class named Problem7 with a main method and a while loop that adds an even number to the array starting with 2 and ending with 20,
// then prints each value in the following array:
//If you have fogotten array details look here: https://www.tutorialspoint.com/java/java_arrays.htm
int evenArray;  //You have to declare and instantiate the array before the loop.  Make the array 20 boxes long.  That leaves you with 2 extra boxes.
public class Problem7{
	public static void main(String [] args){
		int evenArray = new int[9];
		int i = 2;
		int j = 0;
		while(j < 9){
			evenArray[j] = i;
			System.out.println(i);
			i += 2;
			j++; 
		}
	}
}
/*Output
2
4
6
8
10
12
14
16
18
20
*/
//Problem8: Write a class named Problem8 with a main method and a while loop that prints the sum of the numbers from 1 to 10 inclusive.
public class Problem8{
	public static void main(String[] args){
		int result = 0;
		int i = 1;

		while(i < 11){
			result += i;
			i++;
		}
		System.out.println("The sum is " + result + ".");
	}
}
//Output
//The sum is 55.

//Problem9: Write a class named Problem9 with a main method and a while loop that prints the sum of the even numbers from 2 to 100 inclusive.
public class Problem9{
	public static void main(String [] args){
		int result = 0;
		int i = 2;

		while(i < 102){
			result += i;
			i += 2;
		}
		System.out.println("The sum is " + result + ".");
	}
}
//Output
//The sum is 2550.

//Problem10: Write a class named Problem10 with a main method and a while loop that, given an int, prints the multiplication table for that int.
//Example: if the int is 1, the program will print 1 * 1 + 1, 1 * 2 = 2, 1 * 3 = 3 and so on.
public class Problem10{
	public static void main(String [] args){
        int inputNumber = a number;
        int i = 0;

        System.out.println("Here is the multiplication table from 1 to 12 for the number " + inputNumber + ":" + "\n");
        while(i < 13){
            System.out.println(inputNumber + " * " + i + " = " + (inputNumber * i));
            i++;
        }
    }
}
/*Output(Input number is currently 7)
Here is the multiplication table from 1 to 12 for the number 7:

7 * 0 = 0
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
7 * 10 = 70
7 * 11 = 77
7 * 12 = 84*/