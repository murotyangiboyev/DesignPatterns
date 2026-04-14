# Builder

### Definition

* The CreationalPatterns.Builder design pattern is a creational design pattern that provides a step-by-step approach to constructing complex objects.
It separates the construction process from the object's representation, enabling the same method to create
different variations of an object.


### Features
**The CreationalPatterns.Builder pattern focuses on constructing complex objects in a controlled and step-by-step manner.**

* Constructs complex objects step by step
* Separates construction logic from the final object representation
* Uses a CreationalPatterns.Builder class to control object creation
* Supports creation of different variations of the same object
* May include a Director class to define the construction sequence


### Components

**The CreationalPatterns.Builder Pattern consists of several key components that work together to construct complex 
objects step by step while keeping construction separate from representation.**

* **Product:** The Product is the complex object that the CreationalPatterns.Builder pattern is responsible for constructing.
* **CreationalPatterns.Builder:** An interface/abstract class that defines steps for building parts of the product.
* **Concrete CreationalPatterns.Builder:** Implements the CreationalPatterns.Builder interface with specific logic to build a variation of the product.
* **Director:** Manages the builder process and defines the order of construction.
* **Client:** Initiates the building process and requests the final product.


### That is the explanation of The CreationalPatterns.Builder design pattern by Murat !