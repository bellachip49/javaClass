//AP Practice: Expression & Assignment Worksheet for Java
//Name
//Date
//Class
 
1.	Define a variable.  
2.	Define an identifier.
3.	A variable can store ____ value/s of its type.
4.	Define an expression.
5.	What is operator precedence?
6.	Why are widening conversions safer than narrowing conversions?  
7.	What does the new operator accomplish?

8.	Given the following declarations, what is the result of each of the expressions?
int w = 2, y = 7, z = 12;

System.out.println (w * z);
System.out.println (w * z + y);  //what do we do?
System.out.println (w * -z);
System.out.println (w * --z + y++);
int w = 2, y = 7, z = 12;  //reset the values
System.out.println (w * z-- + ++y);
int w = 2, y = 7, z = 12;  //reset the values
System.out.println (w + z * y);
System.out.println (w – y + z);
System.out.println ((w + y) * z);
System.out.println (y / w);
System.out.println (y / z);
System.out.println (w % y);
System.out.println (y % w);
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
System.out.println (z += y); //z=54
System.out.println (y /= z); //y=0
System.out.println (y %= z); //y=0
System.out.println (y += y++); //y=2
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

