# Library Management System

A simple Library Management System built with Spring Boot that demonstrates the following Object-Oriented Programming (OOP) principles:

1. **Encapsulation**
2. **Abstraction**
3. **Inheritance**
4. **Polymorphism**
5. **Composition**

## Tech Stack

- Java 25
- Spring Boot 4.1.1
- Spring Data JPA
- H2 (in-memory database)
- Maven
- Docker Compose

## Prerequisites

- JDK 25 (e.g. `~/.jdks/openjdk-25.0.2`)
- Maven 3.9+
- Docker & Docker Compose (optional, for running the app and H2 via Compose)

## Build and Run

### Using Maven

```bash
mvn clean install
mvn spring-boot:run
```

The application starts on `http://localhost:8080`. The H2 console is available at `http://localhost:8082`.

### Using Docker Compose

```bash
docker compose up --build
```

## Tests

```bash
mvn test
```

Run a single test class:

```bash
mvn -Dtest=BookTest test
```

## OOP Principles

### 1. Encapsulation

Encapsulation hides the internal state of an object and requires all interaction to be performed through an object's methods. Fields are private and exposed via public getters and setters.

- **Classes:**
    - `Book` — `src/main/java/com/principals/oop/model/Book.java` (private `title`, `author`, `publisher`)
    - `Author` — `src/main/java/com/principals/oop/model/Author.java` (private `name`, `biography`)

### 2. Abstraction

Abstraction hides complex implementation details and exposes only the necessary features of an object.

- **Classes:**
    - `Author` — `src/main/java/com/principals/oop/model/Author.java` exposes only relevant details (name, biography).

### 3. Inheritance

Inheritance lets a class inherit fields and methods from another class, promoting code reuse.

- **Classes:**
    - `LibraryItem` — base class (`src/main/java/com/principals/oop/model/LibraryItem.java`)
    - `Book` extends `LibraryItem` — `src/main/java/com/principals/oop/model/Book.java`
    - `Magazine` extends `LibraryItem` — `src/main/java/com/principals/oop/model/Magazine.java`

### 4. Polymorphism

Polymorphism allows objects to take on many forms, enabling different behaviors based on the object acted upon.

- **Classes:**
    - `OopApplication` — `src/main/java/com/principals/oop/OopApplication.java` demonstrates different behaviors when saving and printing books.

### 5. Composition

Composition builds complex objects by combining simpler ones, representing a "has-a" relationship.

- **Classes:**
    - `Book` has a `Publisher` — `src/main/java/com/principals/oop/model/Book.java`
    - `Publisher` — `src/main/java/com/principals/oop/model/Publisher.java`

## Project Structure

```
src/
├── main/
│   ├── java/com/principals/oop/
│   │   ├── model/          # Domain entities (Book, Author, Library, ...)
│   │   ├── repositories/   # Spring Data JPA repositories
│   │   └── OopApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/com/principals/oop/model/   # Unit tests
```

## License

See [LICENSE](LICENSE).