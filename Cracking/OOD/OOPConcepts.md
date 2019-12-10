# Object Oriented Concepts

### Cases
* [Parking Lot](https://www.educative.io/courses/grokking-the-object-oriented-design-interview/gxM3gRxmr8Z)
* Elevator
    * https://leetcode.com/discuss/interview-question/object-oriented-design/309866/Amazon-or-Onsite-interview-or-Design-an-elevator
* More
    * https://leetcode.com/discuss/interview-question/object-oriented-design?currentPage=1&orderBy=recent_activity&query=amazon


### Interview Questions
* OOPS concepts: Polymorphism, Inheritance, Encapsulation and Abstraction

* Aggregation and Composition: Aggregation and composition both describe the relationship between the parent class A and the child class B. The difference is that the child class in a aggregation relationship can exist independently while the child class in a composition relationship cannot. For example, ....

* Design a system to implement options in Pack of cards

-----
* What is OOPS?
OOP is abbreviated as Object Oriented Programming system in which programs are considered as a collection of objects. Each object is an instance of a class.

* What is a class?
A class is a representation of a type of object. It's a blueprint that describes the details, like name, size, color of an object. A class can have constructor, data and function members.

* What are a base class, subclass, and superclass?
    * The base class is the most generalized class, and it is said to be a root class.
    * A subclass is a class that inherits from a base class.
    * The superclass is the parent class from which another class inherits.

* What is an object?
Object is an instance of a class and it can has its own state, behavior and identity.
    * We can use `object instanceOf className`

* Difference between class and an object?
    * An object is an instance of a class. Objects hold any information, but classes don’t have any information. Definition of properties and functions can be done at class and can be used by the object.

* What is **this** pointer?
THIS keyword is used as a pointer which refers to the current object of a class.

* What is the super keyword?
    * The super keyword is used to invoke the overridden method, which overrides one of its superclass methods. This keyword allows to access overridden methods and also to access hidden members of the superclass.
    * It also forwards a call from a constructor, to a constructor in the superclass.

* Modifiers (Control the access to data, functions and classes)
    * If there's no modifier, it's default to be available to any class under the same package.
    * Public
        * Being declared public means it can be accessed from any package.
    * Private
        * Being declared private means it can only be accessed within the class itself.
        * Using the private modifier is the main way that an object encapsulates itself and hides data from the outside.
        * To get or update a private variable, we could use public getter and setter method. 
        * Also, private class cannot be inherited. Top class can be declared as private while inner class and interface cannot.
    * Protected
        * Being declared protected means it can be accessed only by the subclasses in other package or any class within the same package.
        * Protected access gives the subclass a chance to use the helper method or variable, while preventing a not related class from trying to use it.

* What is a constructor?
    * Constructor is a method used to initialize the state of an object, and it gets invoked at the time of object creation. 
    * Constructor must have no return type and have the same name as the class.
    * We could use constructor overload and this keyword to write a class effectively.

* What are the various types of constructors?
    * There are three types of constructors:
        1. Default Constructor – With no parameters.
        2. Parametric Constructor – With Parameters. Create a new instance of a class and also passing arguments simultaneously.
        3. Copy Constructor – Which creates a new object as a copy of an existing object. This is a special constructor for creating a new object as a copy of an existing object. There will always be only one copy constructor that can be either defined by the user or the system.

* Static?
Static is a keyword.
We can use static to create class variables and class functions to save memory.
There're 2 types of variable: one is instance variable and the other is class variable. Instance variable belongs to the object so it is saved in different memory space while class variable belongs to the class and it points to the same memory space in different objects. So when we update a static variable in an object, other objects created from the same class will get the same updated value.
    * Restriction: If a function is declared as static, then it cannot use instance variable, instance funtion or this keyword, because class function is shared between objects.

* Inheritance
When a class extends or inherits from a super class, it means to get the non-private and non-final data and functions from it.

* final
final keywords is used to avoid overriding or inheritance

* Object (class)
In Java, if a class doesn't inherit any class, it will extend Object class automatically.

* What is an abstract class?
Abstract class is like a template. It's a way to achieve abstraction in Java. It cannot be instantiated but can be inherited.
If a method in an abstract class is declared as abstract, then it won't have any statement, and it has to be override in the subclass.

* What is an interface? 
Interface is a way to achieve abstraction and multi-inheritance in Java. A class can only inherit one super class but it can implement multiple interfaces.
The structure of interface is like abstract class but
1. For interface, the fields and methods are public by default. (public could be ignored)
2. The data members must be initialized and set to final. (final keyword could be ignored)

* Wrapper class
Primitive types are not object in Java. However Java provides wrapper class to use primitive types as objects.
    * All variables in a wrapper class is class variable and class function.

* What are the different types of arguments?
    * Call by Value – Value passed will get modified only inside the function, and it returns the same value whatever it is passed into the function.
    * Call by Reference – Value passed will get modified in both inside and outside the functions and it returns the same or different value.

* Overloading v.s. Overriding
    * Overloading is a term used to describe when two methods have the same name but differ in the type or number of arguments.
    * Overriding, however, occurs when a method shares the same name and function signature as another method in its super class.

* Main concepts of OOPS
    * Abstraction
        * Objects in an OOP language provide an abstraction that hides the internal implementation details. Similar to the coffee machine, we just need to know which methods of the object are available to call and which input parameters are needed to trigger a specific operation. But we don’t need to understand how this method is implemented and which kinds of actions it has to perform to create the expected result.

    * Encapsulation
        * Encapsulation is an attribute of an object, and it contains all hidden data. The hidden data can be restricted to the members of that class by access modifiers (There are Public, Protected, Private modifiers in Java).

    * Inheritance
        * Inheritance is a concept where one class shares the structure and behavior defined in another class. The purpose of inheritance is Code Reusing.

    * Polimorphism
        * Polymorphism is assigning behavior or value in a subclass to something that was already declared in the super class.

        * Polymorphism has 2 main concepts
            1. Overriding: is to write a function in a subclass using the same function name, parameter list and return type with one from its superclass, to replace it.
            2. Overloading: is to use the same method name with different argument list.

        * **Method overriding** is a feature that allows a subclass to provide the implementation of a method that overrides the method with the same method name, parameter list, and return type in the super class.

        * What is dynamic or run time polymorphism? -> Dynamic or Run time polymorphism is also known as method overriding in which call to an overridden function is resolved during run time, not at the compile time. It means having two or more methods with the same name, same signature but with different implementation.


### References
* https://career.guru99.com/top-50-oops-interview-questions/
* Java 7 教學手冊 (洪維恩)
