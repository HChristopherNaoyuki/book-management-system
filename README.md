# Book Management System

This project is a simple **Book Management System** that allows managing books and textbooks, with the ability to set prices and display detailed information about each book. It demonstrates the use of **abstract classes**, **interfaces**, and **inheritance** in Java.

## Features

- **Book Class**: An abstract class that represents a generic book with properties such as author, title, category, and price.
- **TextBook Class**: A subclass of `Book` that represents textbooks. It includes additional functionality to track the year the textbook was prescribed.
- **iPrintable Interface**: An interface implemented by the `TextBook` class to display book details.
- **Display Details**: Allows for displaying all relevant details of a book or textbook in a formatted manner.
  
## Classes & Structure

- **Book (Abstract Class)**: Contains the common properties and methods for all types of books.
  - Properties: `author`, `title`, `category`, `price`.
  - Abstract Method: `setPrice(double price)` to set the price.
  
- **TextBook (Subclass of `Book`)**: Inherits from `Book` and implements the `iPrintable` interface.
  - Adds a `yearPrescribed` field (stored as a String) to track the prescribed year for textbooks.
  - Implements `setPrice(double price)` to set the price for textbooks.
  - Implements `DisplayDetails()` to print detailed information about the textbook.

- **iPrintable (Interface)**: Defines the `DisplayDetails()` method for displaying book information in a formatted way.

- **useBook (Main Class)**: Demonstrates the creation of `TextBook` objects, setting their prices, and displaying their details.

## How to Use

1. **Clone the repository**:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/book-management-system.git
   ```

2. **Build and run** the project:
   - Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans).
   - Compile and run the `useBook` class to see the demonstration of creating books and displaying their details.

3. **Add new book types**:
   - You can extend the `Book` class and implement the `iPrintable` interface to create different types of books (e.g., novels, reference books, etc.).
   - Override the `setPrice` method to provide different price-setting mechanisms for other book types.

## Example Output

When running the `useBook` class, you will get output like this for two textbooks:

```
Author: N.O. Body
Title: Introduction to Programming
Category: Education
Price: R59.99
Year Prescribed: DISD1

Author: S.O. Melody
Title: Web Development Intermediate
Category: Education
Price: R79.99
Year Prescribed: DISD2
```

## Technologies Used

- Java (Object-Oriented Programming)
- Abstract Classes
- Interfaces
- Inheritance

---
