# Simple Calculator Program  # Inverted Star Pattern Program

This is a simple Java console-based calculator program that allows users to perform basic arithmetic operations. The program takes two numbers as input and allows the user to select an operation.

This Java program prints an inverted star pattern on the console. The user inputs the number of rows, and the program generates a pattern where the number of stars decreases on each subsequent row.

## Features
- Supports the following operations:
  - Multiplication (`*`)
  - Addition (`+`)
  - Division (`/`)
  - Subtraction (`-`)
- Prevents division by zero
- Allows continuous operation until the user chooses to exit

## Features
- User Input: Prompts the user to enter the desired number of rows.
Pattern Generation: Uses nested loops to print an inverted triangle pattern with stars.
Dynamic Output: The number of stars on each row is determined by the formula 2 * i - 1, where i starts at the input number and decreases to 1.

## How to Use
1. Run the program.
2. Enter the first number.
3. Enter the second number.
4. Choose an operation from the menu.
5. View the result.
6. Optionally, choose to perform another operation or exit the program.

How It Works
The program asks the user for the number of rows.
For each row (from the highest number down to 1):
It prints a number of spaces to align the stars correctly.
It prints a corresponding number of stars.
The process continues until the inverted pattern is fully printed.

## Example Usage
```
Enter the first number: 10
Enter the second number: 5
Select an operation:
1: Multiplication
2: Addition
3: Division
4: Subtraction
Type 'q' to quit
Choose an operation: 1
Result: 50
Do you want to perform another operation? (yes/no): no
Exiting the program.
```

## Requirements
- Java Development Kit (JDK) installed
- A terminal or command prompt to run the program

## Running the Program
Compile and run the Java file:
```
javac Calculator.java
java Calculator
```

## License
This project is open-source and available for modification and distribution.

