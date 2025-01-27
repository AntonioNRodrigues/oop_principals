# Library Management System

This is a simple Library Management System built using Spring Boot that demonstrates the following Object-Oriented Programming (OOP) principles:

1. **Encapsulation**
2. **Abstraction**
3. **Inheritance**
4. **Polymorphism**
5. **Composition (Special guest!!!!)** 

## OOP Principles

### 1. Encapsulation

Encapsulation is the practice of hiding the internal state of an object and requiring all interaction to be performed through an object's methods. This is implemented by making the fields of a class private and providing public getter and setter methods to modify and view these fields.

- **Classes:**
    - `Book` class
        - Code: `src/main/java/com/example/library/model/Book.java`
        - Example: Fields `title` and `author` are private and accessed through public getter and setter methods.
    - `Author` class
        - Code: `src/main/java/com/example/library/model/Author.java`
        - Example: Fields `name` and `biography` are private and accessed through public getter and setter methods.

### 2. Abstraction

Abstraction is the concept of hiding the complex implementation details and showing only the necessary features of an object. This allows for a simplified interaction with objects and focuses on the essential aspects.

- **Classes:**
    - `Author` class
        - Code: `src/main/java/com/example/library/model/Author.java`
        - Example: Only the relevant details (name, biography) are exposed to interact with an `Author` object.

### 3. Inheritance

Inheritance allows a class to inherit fields and methods from another class, promoting code reuse and establishing a relationship between the base class and the derived class.

- **Classes:**
    - `LibraryItem` class
        - Code: `src/main/java/com/example/library/model/LibraryItem.java`
        - Example: Base class for `Book` and `Magazine` classes.
    - `Book` class inherits from `LibraryItem`
        - Code: `src/main/java/com/example/library/model/Book.java`
    - `Magazine` class inherits from `LibraryItem`
        - Code: `src/main/java/com/example/library/model/Magazine.java`

### 4. Polymorphism

Polymorphism is the ability of objects to take on many forms. It allows methods to do different things based on the object it is acting upon, often achieved through method overriding or method overloading.

- **Classes:**
    - `LibraryApplication` class
        - Code: `src/main/java/com/example/library/LibraryApplication.java`
        - Example: The `run` method demonstrates different behaviors of objects, such as adding books to the library and printing book details.

### 5. Composition

Composition is a design principle that builds complex objects by combining simpler objects, representing a "has-a" relationship. It promotes modularity, flexibility, and code reuse.

- **Classes:**
    - `Book` class has a `Publisher`
        - Code: `src/main/java/com/example/library/model/Book.java`
        - Example: The `Book` class includes an instance of the `Publisher` class, representing a "has-a" relationship.
    - `Publisher` class
        - Code: `src/main/java/com/example/library/model/Publisher.java`
        - Example: The `Publisher` class includes details like name and address.
