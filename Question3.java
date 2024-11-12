/*
Build a menu-driven calculator that performs addition, subtraction,
multiplication, or division based on the user's choice. Use if-else
statements to determine the operation.
Keep prompting the user to perform another operation until they choose
to exit.
 */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;
        
        while (continueCalculation) {

            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice (1-5): ");
            
            int choice = scanner.nextInt();
            

            if (choice == 5) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                continueCalculation = false;
                continue;
            }
            

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please select a valid option (1-5).");
                continue;
            }
            

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            

            double result = 0;
            String operation = "";
            
            if (choice == 1) {
                result = num1 + num2;
                operation = "+";
            } else if (choice == 2) {
                result = num1 - num2;
                operation = "-";
            } else if (choice == 3) {
                result = num1 * num2;
                operation = "*";
            } else if (choice == 4) {

                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    continue;
                }
                result = num1 / num2;
                operation = "/";
            }
            

            System.out.printf("\n%.2f %s %.2f = %.2f%n", 
                            num1, operation, num2, result);
            

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            char response = scanner.next().charAt(0);
            if (response != 'y' && response != 'Y') {
                System.out.println("Thank you for using the calculator. Goodbye!");
                continueCalculation = false;
            }
        }
        
        scanner.close();
    }
}

/*
 === Calculator Menu ===
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Exit

Enter your choice (1-5): 1
Enter first number: 10.5
Enter second number: 5.5

10.50 + 5.50 = 16.00

Do you want to perform another calculation? (y/n): y

=== Calculator Menu ===
...
 */