//Displaying Information using print() and println() Methods

/*We have already seen how the println() method is used to print text on the screen. In addition to the println() method, 
we have the print() and the format() methods which are used for displaying data. The print() method is similar to the 
println() statement while the format() method is something different.

Difference between print() and println()

The only difference between the print() and println() methods is that the println() statement positions the cursor onto the next 
line after printing the desired text while the print() method leaves the cursor on the same line. The difference is evident when 
we print text using more than a single statement. The following statements use the print() method.*/

System.out.print("Hello ");
System.out.print("World ");

//The output of these statements would be:

Hello World

/*After printing the word 'Hello', the cursor remained on the same line. That is why 'World' was also displayed on the same line. 
If we use the println() statement, the output would be different.*/

System.out.println("Hello ");
System.out.println("World ");

//The output would be

Hello
World

//After printing the word 'Hello', the cursor moved to the next line. That is why the word 'World' was printed on a new line.

//Concatenation using + operator

/*We can use the concatenation operator + to join two or more Strings and print them. To print the value of a variable, we 
simply state it within the parentheses. Look at the following code for example:*/

int a = 1;
String s = "World";
System.out.println(a + " " + "Hello " + s + "!");

//The output would be

1 Hello World!

/*The expression within the parentheses is evaluated from left to right and particular care has to be taken when including variables 
that store integers, real numbers and characters.

Including integers and real numbers in print statements

The order in which these variables that store integers and real numbers occur along with the Strings can decide whether the integers 
would be printed directly or if they would be added together with integers and then printed. When a String is added to any other data 
type, the resultant value is a String. The other variable is also converted to a String and then concatenated. However, when two integers 
are operated with a + sign, the + acts as an addition operator and not a concatenation operator. The variables are considered as int's 
and not Strings. Parentheses may be used just as in maths to alter the order in which evaluation is performed. If the expression within 
the println() or print() method contains parentheses, then the value within the parentheses is evaluated first. 
Consider the following example:*/

int a = 3;
int b = 4;
System.out.println( a + b );
System.out.println( "3" + "4" );
System.out.println( "" + a + b );
System.out.println( 3 + 4 + a + " " + b + a );
System.out.println( "Result: " + a + b );
System.out.println( "Result: " + ( a + b ) );

//The output would be

7
34
34
10 43
Result: 34
Result: 7


/*Expressions within the parentheses are evaluated from left to right. In the first println() statement, both a and b are integers. 
Hence, they are added together and the result 7 is displayed. In the second statement, the Strings "3" and "4" were joined by a + sign. 
It is to be noted that, here 3 and 4 are Strings and not integers. In the third line, the empty String, represented by the opening and 
closing quotes is added to the integer 3. Since a String was added to the integer 3, the resultant value is a String "3" and not the 
integer 3. Next this String is added to the integer 4. Therefore, the integer 4 is converted to the String "4" and concatenated with 
the String "3" to give the String "34". In the fourth statement, starting from the left as usual, we have the integers 3, 4 and a 
connected with a + sign. Hence, they are all added to give 10, an integer. Now this integer is added to a String " " giving the String 
"10 "and continuing in similar manner, we get the result "10 43". In a similar way, the next statement gives the answer "Result: 34". 
In the last statement, parentheses have been used to alter the order in which evaluation is performed. First, the expression within the 
parentheses is evaluated. Hence, a + b is evaluated to give an integer 7, which is concatenated with the String "Result: " to give the 
final String "Result: 7".

Printing characters

Whenever a char variable is passed as a parameter to the print() or println() methods, the graphic representation is printed and not the 
numeric value. It does matter whether we have initialised the char with a number or with a graphic symbol.*/

char a = 65;
char b ='A';
System.out.println(a);
System.out.println(b);

//The output would be

A
A

//If we want the numeric representation to be printed, we need to cast the variable into one of the four integer types.

System.out.println((int)a);

//The output would be:  (This is the ASCI value of the letter.  See: https://www.asciitable.com/)

65 

//When an integer is added to a char, the char is implicitly casted to an integer.

System.out.println(b + 1);

//The output would be

66

//Using escape sequences to print new lines and tabs

/*We can print new lines and tabs using escape sequences. Escape sequences are a combination of a backslash character '\' 
followed by one or more letters. To print a new line, we use the escape sequence '\n' and to print a tab ( a group of spaces), 
we use the escape sequence '\t'.

Following examples shows the use of escape sequences.*/

String str="Hello World!"; System.out.println (str + "\nA new line+"\t" + "Tab"+"\n" + "A new line");

//The output would be

Hello World!
A new line    Tab
A new line

/*Note that the escape characters can also be used in Strings that would be stored in a variable. The escape sequences are 
single characters which can be stored in a char variable. However, they are generally taken as Strings in order to avoid 
them being converted to integers due to logical errors. Look at the following code where a logical error exists. The intended 
output is the numbers 3,4 and 7 on different lines but the actual output was something different since the escape sequence '\n' 
was converted into its numeric value 10.*/

int a = 3,b = 4,c = 7;
System.out.println(a +'\n'+ b +'\n'+ c);

The output is

34

/*The reason is that the char '\n' was converted into its numeric value 10. The logical errors could have been avoided if the 
escape sequences were considered as Strings and not chars.*/

System.out.println(a+"\n"+b+"\n"+c);

//The output now would be

3
4
7