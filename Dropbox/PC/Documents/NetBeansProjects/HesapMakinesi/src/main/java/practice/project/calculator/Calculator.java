package practice.project.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int last = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        String menu = "Select an operation:\n" +
                      "1: Multiplication\n" +
                      "2: Addition\n" +
                      "3: Division\n" +
                      "4: Subtraction\n" +
                      "Type 'q' to quit";
        
        while (true) {
            System.out.println(menu);
            System.out.print("Choose an operation: ");
            String operation = sc.nextLine();
            
            if (operation.equals("q")) {
                System.out.println("Application exited.");
                break;
            }
            
            int result = 0;
            boolean validOperation = true;
            
            switch (operation) {
                case "1":
                    result = first * last;
                    System.out.println("Result: " + result);
                    break;
                case "2":
                    result = first + last;
                    System.out.println("Result: " + result);
                    break;
                case "3":
                    if (last == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = first / last;
                        System.out.println("Result: " + result);
                    }
                    break;
                case "4":
                    result = first - last;
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation selected.");
                    validOperation = false;
            }
            
            if (validOperation) {
                System.out.print("Do you want to perform another operation? (yes/no): ");
                String response = sc.nextLine();
                if (response.equalsIgnoreCase("no")) {
                    System.out.println("Exiting the program.");
                    break;
                }
            }
        }
        
        sc.close();
    }
}
