Java Encapsulation
- encapsulation: making sure "sensitive" data is hidden from users
- need to declare class variable/attributes as private and provide public get and set methods to access and update private variables
- use get and set to access private variables
- get method returns value, set sets the value
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
- private name variables cannot be accessed from outside the class
public class MyClass {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John";  // error
    System.out.println(myObj.name); // error 
  }
}
MyClass.java:4: error: name has private access in Person
    myObj.name = "John";
         ^
MyClass.java:5: error: name has private access in Person
    System.out.println(myObj.name);
                  ^
2 errors
Why Encapsulation?
- better control of attributes and methods
- attributes can be made read-only
- one part of the code can be changed w/o affecting other parts
- increased security of data




Java Packages
- packages are like folders in a file directory
- 2 package categories:
  - built-in packages
  - user-defined packages
- use import to use a class or a package from the library
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
- * symbol is used to specify a whole package (aka "all of the things in <specified> folder")
import java.util.Scanner;
- java.util is a package and Scanner is a class of the java.util package
- .nextLine() used to read a complete line
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
Enter username
kkwan
Username is: kkwan
import java.util.*;
Enter username
kkjava
Username is: kkjava
- use package keyword to create a package
package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
This is my package!





Java Inheritance
- subclass(child): the class that inherits from another class
- superclass(parent): the class being inherited from
- use extends keyword to inherits from a class
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
Tuut, tuut!
Ford Mustang
- use inheritance for code that is reused
- add final to prevent other classes from inheriting from a class
final class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
}
Car.java:8: error: cannot inherit from final Vehicle
class Car extends Vehicle {
                  ^
1 error




Java Polymorphism
- polymorphism means "many forms"
- 

















