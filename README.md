# Java Design Patterns and SOLID Principles

This repository contains explanations and examples of common **design patterns** and the **SOLID principles**, which are fundamental to writing clean, maintainable, and scalable code in Java.

---

## Table of Contents

1. **Design Patterns**
   - Creational Patterns
   - Structural Patterns
   - Behavioral Patterns
2. **SOLID Principles**
3. **Getting Started**
4. **Contributing**

---

## 1. Design Patterns

Design patterns are reusable solutions to common problems in software design. They help to improve code readability, reusability, and maintainability. Below is a classification of design patterns:

### Creational Patterns
1. **Singleton**: Ensures a class has only one instance and provides a global point of access to it.
2. **Factory Method**: Defines an interface for creating objects but allows subclasses to alter the type of objects created.
3. **Abstract Factory**: Provides an interface to create families of related or dependent objects.
4. **Builder**: Separates the construction of a complex object from its representation.
5. **Prototype**: Creates new objects by copying an existing object.

### Structural Patterns
1. **Adapter**: Allows incompatible interfaces to work together.
2. **Bridge**: Decouples an abstraction from its implementation so the two can vary independently.
3. **Composite**: Composes objects into tree structures to represent part-whole hierarchies.
4. **Decorator**: Adds new responsibilities to objects dynamically.
5. **Facade**: Provides a simplified interface to a larger body of code.
6. **Flyweight**: Reduces memory usage by sharing common parts of the object state.
7. **Proxy**: Provides a placeholder for another object to control access to it.

### Behavioral Patterns
1. **Chain of Responsibility**: Passes a request along a chain of handlers.
2. **Command**: Encapsulates a request as an object.
3. **Interpreter**: Defines a grammar and interprets sentences in that grammar.
4. **Iterator**: Provides a way to access elements of a collection sequentially.
5. **Mediator**: Reduces coupling between classes by using a mediator to handle interactions.
6. **Memento**: Captures and restores an object’s internal state.
7. **Observer**: Defines a dependency between objects so that one object’s state changes notify others.
8. **State**: Allows an object to alter its behavior when its internal state changes.
9. **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
10. **Template Method**: Defines the skeleton of an algorithm, allowing subclasses to redefine certain steps.
11. **Visitor**: Represents an operation to be performed on elements of an object structure.

---

## 2. SOLID Principles

The SOLID principles are a set of guidelines for designing software that is easy to understand, maintain, and extend. These principles include:

1. **S - Single Responsibility Principle (SRP)**: A class should have only one reason to change.
2. **O - Open/Closed Principle (OCP)**: A class should be open for extension but closed for modification.
3. **L - Liskov Substitution Principle (LSP)**: Subtypes must be substitutable for their base types.
4. **I - Interface Segregation Principle (ISP)**: Clients should not be forced to depend on interfaces they do not use.
5. **D - Dependency Inversion Principle (DIP)**: Depend on abstractions, not on concrete implementations.

---

## 3. Getting Started

### Prerequisites
- Java 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

### Running Examples
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/Java-Design-Patterns.git
   ```
2. Navigate to the project directory and open it in your IDE.
3. Run the examples to see how each pattern and principle works.

---

## 4. Contributing

We welcome contributions! If you would like to contribute:
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Submit a pull request with detailed information.

---

Happy coding! 😊