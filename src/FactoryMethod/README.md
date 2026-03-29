# Factory Method

### Definition
* The Factory Method is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

### Why we use it ?
* **Louse Coupling:** Our code doesn't need to know the specific names of the classes it's working with. It only cares about the interfacae.


* **Single Responsibility Principle:** We can move the product creation code into one place in the program.


* **Open/Closed Principle:** We can introduce new types of products into the program without breaking existing code.

### Example:

![img.png](img.png)



### Advantages of Factory Method Design Pattern

* Separates object creation from client code, enhancing flexibility and maintainability since
changes to creation don't affect clients.
* New product types can be easily added without altering client code by simply creating
new Concrete Creator subclasses.
* The Factory method can be reused across different application parts,
centralizing object creation logic.
* Hides specific product classes from clients, reducing dependencies and improving maintainability.


### Disadvantages of Factory Method Design Pattern
* Adds more classes and interfaces, which can complicate understanding, especially for newcomers.
* Client code must be aware of concrete subclasses to make accurate factory calls.
* Testing the factory logic can be more complicated compared to simpler designs.

### That is the explanation of The Factory method design pattern by Murat !