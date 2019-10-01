//AP Practice: Expression & Assignment Worksheet for Java
//Krystal
//9/17/19
//Java
 
1.	Define a variable. A variable is the name of a stored value of any data type.
2.	Define an identifier. An identifier is the user-defined name of a program element. It can be a namespace, class, method, variable or interface
3.	A variable can store ____ value/s of its type.
4.	Define an expression. An expression is a particular concept in computer science in which a number of variables or constants, and operators and functions,
are put together in a single statement that is acted on by a particular programming language
5.	What is operator precedence? PEMDAS means parentheses exponents mult div add subtract
6.	Why are widening conversions safer than narrowing conversions? 
7.	What does the new operator accomplish? It tells the computer to reserve some memory to use later.

8.	Given the following declarations, what is the result of each of the expressions?
int w = 2, y = 7, z = 12;

System.out.println (w * z); //24
System.out.println (w * z + y);  //31
System.out.println (w * -z); //-24
System.out.println (w * --z + y++); //30
int w = 2, y = 7, z = 12;
System.out.println (w * z-- + ++y); //30
int w = 2, y = 7, z = 12;
System.out.println (w + z * y); //86
System.out.println (w – y + z); //7
System.out.println ((w + y) * z); //108
System.out.println (y / w); //3
System.out.println (y / z); //0
System.out.println (w % y); //5
System.out.println (y % w); //1
//do the rest... VVV
9.	Given the following declarations, what is the result of each of the expressions?
double w = 12.9, y = 3.2;
double z = 12.2;

System.out.println (w / z); //1.1
System.out.println (z / w); //0.9
System.out.println (w / z – y); //-2.1
System.out.println (w – z * y); //-26.1
System.out.println ((w – z) * y); //2.2
System.out.println (z / y / w); //0.3
System.out.println (z / (y / w)); //49.2
System.out.println (y % z); //3.2
 
10.	Given the following declarations, what is the result of each of the assignments?
int w = 5, y = 9, z = 2;

System.out.println (z += w * y); //z=45
System.out.println (z += y); //z=11
System.out.println (y /= z); //y=1
System.out.println (y %= z); //y=1
System.out.println (y += y++); //y=3
int w = 5, y = 9, z = 2; //reset values
System.out.println (y += --y); //y=16

11.	Given the following declarations, what is the result of each of each output?
char a = 'a', b = 'B';
char c = ' ', d;
string s = "This is fun.";
int e;

System.out.println  (("a = " + a)); // a = 97
System.out.println("a = " + 'a'); // a = 97
System.out.println(a + b); // 163
System.out.println(s); // This is fun
System.out.println(s.length()); // 12

