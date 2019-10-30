 Lesson 4-6-2 HW Loops and Strings 1
 Name
 Date
 Class

 Problem 1: Do not make a class or main method.  Use a while loop to count by three from 3 to 99

 Sample output
 3, 6, 9, 12, 15, 18, 21, 24, ... 96, 99 (note: no comma after 99)

int count = 3;

while(count < 99){
	System.out.print(count + ", ");
	count += 3;
}
System.out.print(99);

//Output
// 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99

 Problem 2: Make a for loop with no class or main.  The for loop should count down from 100 to 0
 by fives.  Make sure that your loop will stop at 0.

 Sample output: 
 100, 95, 90, 85, ... 5, 0 (note: no comma after the zero)

int num = 100;

while(num > 0){
	System.out.print(num + ", ");
    num -= 5;
}
System.out.print(0);

//Output
// 100, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5, 0

 Problem 3: Make a nested for loop to make the following pattern:
 5
 5 5
 5 5 5 
 5 5 5 5
 5 5 5 5 5
for(int i = 1; i <= 5; i++){
    for(int j = 1; j <= i; j++){
        System.out.print("5 ");
    }
    System.out.println();
}

//Output
/*5 
5 5 
5 5 5 
5 5 5 5 
5 5 5 5 5 */

 Problem 4: Change the code in problem 3 so that any variable can be entered and it will use that
 number in the pattern and end when it it has that number of columns.
System.out.println("Input Number:");
System.out.print(">>> ");
Scanner in = new Scanner(System.in);
int givenNumber = in.nextInt();

for(int i = 1; i <= givenNumber; i++){
    for(int j = 1; j <= i; j++){
        System.out.print(givenNumber + " ");
    }
    System.out.println();
}

//Output
// Input Number:
// >>> 4
// 4 
// 4 4 
// 4 4 4 
// 4 4 4 4 

//Output
// Input Number:
// >>> 7
// 7 
// 7 7 
// 7 7 7 
// 7 7 7 7 
// 7 7 7 7 7 
// 7 7 7 7 7 7 
// 7 7 7 7 7 7 7 

 Sample output:
 2
 2 2

 6 
 6 6
 6 6 6 
 6 6 6 6 
 6 6 6 6 6
 6 6 6 6 6 6

 Problem 5: Use a loop, class and main method to print off the letters in this string with space between each letter:
 String school = "Milhouse Academy"  //There should be two spaces between the words.

String school = "Milhouse Academy";

for(int i = 0; i < school.length(); i++){
    System.out.print(school.charAt(i) + " ");
}

//Output
// M i l h o u s e   A c a d e m y 

 Bonus Extra Credit Problem
 Use a class and a main method with an int array having these values: {1, 2, 3, 4, 5, 6}.  Figure
 out how to use a loop and another array to get the numbers in reverse. {6, 5, 4, 3, 2, 1}