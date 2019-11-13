# Object Oriendted Design

### [Cases](https://www.educative.io/courses/grokking-the-object-oriented-design-interview/RMlM3NgjAyR)
* [Parking lot](cases/ParkingLot/ParkingLot.md)
* Elevator
* Online shopping system
* Other cracking ch.7 problems

* Stack overflow
* Movie ticket booking system
* ATM
* Airline management system 
* Blackjack
* Hotel management system
* Restautant management system
* LinkedIn
* Facebook


### How-To
Ref: https://www.quora.com/How-do-I-answer-design-related-questions-like-design-a-parking-lot-in-an-Amazon-interview-Do-we-need-to-write-code-for-design-questions
1. **Requirements clarifications**: Always start with asking questions to find the exact scope of the problem you are solving. The interviewer will give you a very high-level description of the system, you are supposed to clarify it and dig deeper. A few initial questions are a good start and don't be afraid to ask questions in the middle. Let's take an example of an online shopping system, let's say following things are required:
    1.  Users can search/view/buy products.
    2.  There should be a shopping cart which will hold user items that they intend to buy. Users should be able to add/remove/view items in the shopping cart.
    3. Users can check-out resulting in purchasing the items in the shopping cart.
    4. The user should be able to pay through credit cards.
    5. Users should be able to specify a shipping address where their orders can be delivered.

2. **System Use-cases**: Try to list at least the top use cases that the system is supposed to design. This will definitely guide you to figure out different system components and actors. Here are the use cases for the online shopping system:
    1. Search product
    2. View product
    3. Add/remove product to the shopping cart
    4. View shopping cart
    5. Checkout
    6. Make payment and specify a shipping address

3. **Class diagram: This is the core part.** List all the actors and system objects to place them on a class diagram. Specify relationships among them and their multiplicities. Always keep in mind that the system will grow, there will be additional requirements and the interviewer will be interested to see how you will handle them, following OO principles should help you with that. Remember to keep the basics of OO modeling in mind:
    1. Encapsulation: Means binding the data together in objects.
    2. Abstraction: Means hiding all but the relevant data about an object, this will help reduce the system complexity.
    3. Inheritance: Means making new classes from already defined classes.
    4. Polymorphism: The ability of different methods to implement the same operation differently.

4. **Describe a couple of top use cases (Activities)**: Try to run a couple of top use cases using the classes defined in the above step. Consider it an equivalent of activity diagram. This will help you find out any missing component or scenario. I think verbally explaining here would be enough.

5. **Code**: This depends upon the interviewer, they might ask you to write the code for a specific component. At a high level define all the required properties, function, interfaces, etc.