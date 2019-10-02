# Object Oriented Design

### References
* https://career.guru99.com/top-50-oops-interview-questions/

### Concepts of OOP
* What is OOPS?
    * OOP is abbreviated as Object Oriented Programming system in which programs are considered as a collection of objects. Each object is an instance of a class.

* What is a class?
    * A class is a representation of a type of object. It's the blueprint that describes the details, like name, size, color, attributes and, actions, of an object.

* What is an object?
    * Object is an instance of a class and it can has its own state, behavior and identity.

* What is a constructor?
    * Constructor is a method used to initialize the state of an object, and it gets invoked at the time of object creation. 
    * The name of constructor should be the same as the class name.
    * Constructor must have no return type.

* What is an abstract class?
    * An abstract class is a class which cannot be instantiated. Creation of an object is not possible with abstract class , but it can be inherited. 
    * An abstract class can contain only Abstract method. 
    * (Java allows only abstract method in abstract class while for other language it allows non-abstract method as well.)

* What is an interface? 
    * An interface is a collection of abstract method. If the class implements an inheritance, and then thereby inherits all the abstract methods of an interface.

* Difference between class and an object?
    * An object is an instance of a class. Objects hold any information , but classes don’t have any information. Definition of properties and functions can be done at class and can be used by the object.
    * Class can have sub-classes, and an object doesn’t have sub-objects.

* What are the different types of arguments?
    * Call by Value – Value passed will get modified only inside the function, and it returns the same value whatever it is passed into the function.
    * Call by Reference – Value passed will get modified in both inside and outside the functions and it returns the same or different value.

* What is the super keyword?
    * The super keyword is used to invoke the overridden method, which overrides one of its superclass methods. This keyword allows to access overridden methods and also to access hidden members of the superclass.
    * It also forwards a call from a constructor, to a constructor in the superclass.

-----

* Static?

* What is ‘this’ pointer?
    * THIS pointer refers to the current object of a class. THIS keyword is used as a pointer which differentiates between the current object with the global object. It refers to the current object.

* Overload v.s. overriding?
    * Method overriding is a feature that allows a subclass to provide the implementation of a method that overrides in the main class. It will override the implementation in the superclass by providing the same method name, same parameter, and same return type.
    * Overloading is the same method with different arguments, and it may or may not return the equal value in the same class itself.
    * Overriding is the same method names with the same arguments and return types associated with the class and its child class.

* What are the various types of constructors?
    * There are three types of constructors:
        1. Default Constructor – With no parameters.
        2. Parametric Constructor – With Parameters. Create a new instance of a class and also passing arguments simultaneously.
        3. Copy Constructor – Which creates a new object as a copy of an existing object. This is a special constructor for creating a new object as a copy of an existing object. There will always be only one copy constructor that can be either defined by the user or the system.

* What is dynamic or run time polymorphism?
    * Dynamic or Run time polymorphism is also known as method overriding in which call to an overridden function is resolved during run time, not at the compile time. It means having two or more methods with the same name, same signature but with different implementation.

-----

* Basic concepts of OOPS
    * Abstraction
    * Encapsulation
        * Encapsulation is an attribute of an object, and it contains all data which is hidden. The hidden data can be restricted to the members of that class by access modifiers (There are Public, Protected, Private modifiers in Java).

        * Encapsulation is a concept to achieve 2 things:
            1. One is **Data hiding**, which means to restrict access to members of an object.
            2. Another is to **Bundle of data and methods**

            * Public
                * A class, method, constructor, interface declared public can be accessed from any class.
                * If the public class is in a different package, then the class should be imported first.
            * Protected
                * Variables and methods which are declared protected in a superclass can be accessed only by the subclasses in other package or any class within the same package.
                * The protected access modifier cannot be applied to class and interfaces. Methods, fields can be declared protected, however methods and fields in a interface cannot be declared protected.
                * Protected access gives the subclass a chance to use the helper method or variable, while preventing a nonrelated class from trying to use it.
            * Private
                * Methods, variables and constructors that are declared private can only be accessed within the declared class itself (Class and interface cannot be private). 
                * To get a private variable, we could use public getter method. 
                * Using the private modifier is the main way that an object encapsulates itself and hides data from the outside.
                * Methods declared private cannot be inherited.

            * If there's no modifier, it's default to be available to any class under the same package.
            * For interface, the fields and methods are public by default.

    * Inheritance
        * Inheritance is a concept where one class shares the structure and behavior defined in another class. The purpose of inheritance is Code Reuse.

    * Polimorphism
        * Polymorphism is assigning behavior or value in a subclass to something that was already declared in the main class. Polymorphism takes more than one form.

-----
### Cases
* [Design a multi-floor parking lot](exercise/OOP/ParkingLot.java)

-----
### How-To
1. Handle ambiguity
    * Who is going to use it?
    * What
    * Where
    * When
    * Why
    * How they are going to use it?

2. Define the core objects
    * Case: a restaurant -> Table, Guest, Party, Order, Meal, Employee, Server and Host

3. Analyze relationships
    * Party should have an array of Guest
    * Server and Host inherit from Employee
    * Each Table has one Party, but each Party may have multiple Tables
    * There is one Host for the restaurant

* Investigate actions
    * A Party walks into the Restaurant
    * A Guset requests a Table from the Host
    * The Host looks up the Reservation and if it exists, assigns the Party to a Table. Otherwise, the Party is added to the end of the list
    * When a Party leaves, the Table is freed and assigned to a new Party in the list

-----
# Design Patterns
### Singleton Design Pattern
* To ensure a class has only 1 instance, and ensure access to the instance through the application. E.g. The Restaurant

        public class Restaurant {
            private static Restaurant _instance = null;
            protected Restaurant() {...}
            public static Restaurant getInstance() {
                if(_instance == null)
                    _instance = new Restaurant();
                return _instance;
            }
        }

### Factory Method
