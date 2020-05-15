Inheritance and Polymorphism
- class hierarchy describes relationship between classes
- inheritance allows objects to use features not defined in their own class
- subclass extends a superclass(child class extends a parent class)
- child classes don’t have direct access to their parent’s private variables
- child class can override the parent class methods by simply redefining the method
- POLYMORPHISM is what happens when objects from child classes are allowed to act in a different way than objects from parent classes***
- object class is the parent of all classes(mother of all classes)
inheritance allows objects from one class to inherit the features of another class
class hierarchy allows a class to inherit the attributes of another las, making the code reusable
(classes on the lower end of the hierarchy inherit features without having to define them in their own class)
Any given rank(ex: animal classification - genus, species, kingdom) inherits the traits and features from the rank above it.

A class has the ability to EXTEND another class
child class = subclass
parent class = superclass
A child class has the ability to extend a parent class
The child class gets its own set of instance variables separate from the parent class
instance variables for parent and child are 2 different sets of instance variables
child class can only access the private instance variables of the parent by using the accessor and modifier methods from the parent class

every object has its own variables
the phrase is-a refers to class hierarchy
is-a describes parent-child relationship
has-a determines attributes
a class can only have one parent
each subclass inherits the traits of its superclass and can add additional traits of its own