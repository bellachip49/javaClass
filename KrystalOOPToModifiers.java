//Krystal Kwan
//4/21/20
//w3schools java review

Java OOP
- OOP is faster and easier to execute
- procedural programming is about writing methods that perform operations on the data
- OOP is about creating objects with data and methods
- class is a template, object is an instance




Java Classes/objects
- Java is an object oriented programming language
- Java is made up fo classes and obejcts with attributes and methods
- classes are blueprints
public class MyClass {
  int x = 5;
}
- objects are created form a class
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
Output:
5
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // Object 1
    MyClass myObj2 = new MyClass();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
Output:
5
5
public class MyClass {
  int x = 5;
}
class OtherClass {
  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
Exercise:
MyClass myObj = new MyClass();




Java Class attributes
- variables are attributes of a Java class
public class MyClass {
  int x = 5;
  int y = 3;
}
- fields = class attributes
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
Output:
5
- you can modify attribute values
public class MyClass {
  int x;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
Output:
40
public class MyClass {
  int x = 10;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
Output:
25
- final keyword is used to remove the ability to change a variable's values
public class MyClass {
  final int x = 10;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
Output:
MyClass.java:6: error: cannot assign a value to final variable x
    myObj.x = 25;
         ^
1 error
- the final keyword is a modifier
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // Object 1
    MyClass myObj2 = new MyClass();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
Output:
5
25
public class Person {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    Person myObj = new Person();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
Output:
Name: John Doe
Age: 24



Java Class methods
- methods are declared in a class
public class MyClass {
  static void myMethod() {
    System.out.println("Hello World!");
  }
}
public class MyClass {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "Hello World!"
Output:
Hello World!
- static can be accessed without creating an object of the class
- public can only be accessed by objects
public class MyClass {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
Output:
Static methods can be called without creating objects
Public methods must be called by creating objects
// Create a Car class
public class Car {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

// The car is going as fast as it can!
// Max speed is: 200
Output:
The car is going as fast as it can!
Max speed is: 200
- new keyword is used to create new objects
public class Car {
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}
class OtherClass {
  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}
Output:
The car is going as fast as it can!
Max speed is: 200





Java Constructors
- constructors are special methods used to initialize objects
- the constructor is called when an object of a class is created
// Create a MyClass class
public class MyClass {
  int x;  // Create a class attribute

  // Create a class constructor for the MyClass class
  public MyClass() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
Output:
5
- void means no return type
- when an object is created the constuctor is called
- constructor can also take parameters, which is used to initialize attributes
public class MyClass {
  int x;

  public MyClass(int y) {
    x = y;
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
Outputs:
5
public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang
Output:
1969 Mustang





Java Modifiers
public class MyClass
- the public keywords is an access modifier; used to set access level for classes, attributes, methods, and constructors
- access modifiers: controls access level
- non-access modifiers - do not control access level, but provides other functionality
You can use either public or default for class access modifiers
Attributes, methods, and constructors, can use public, private, default, protected
Attributes and methods can use final, static, abstract, transient, synchonized, and volatile
public class MyClass {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
Output:
MyClass.java:7: error: cannot assign a value to final variable x
    myObj.x = 50;
         ^
MyClass.java:8: error: cannot assign a value to final variable PI
    myObj.PI = 25;
         ^ 2 errors
- static can be accessed without creating an object fo the class
public class MyClass {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}
Output:
Static methods can be called without creating objects
Public methods must be called by creating objects
- abstract belongs to an abstract class
- the body is provided by the subclass
// Code from filename: Person.java
// abstract class
abstract class Person {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Person.java

// Code from filename: MyClass.java
class MyClass {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
Output:
Name: John
Age: 24
Graduation Year: 2018
Studying all day long
