/* 
Write a Java program that takes an integer input from the user and
calculates the factorial of the number. Then, write a method to calculate
the sum of the digits of this factorial. For example, if the user enters 5,
calculate 5! (120) and then find the sum of its digits (1 + 2 + 0 = 3).
*/
import java.util.Scanner;

class Main {

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;  
            number /= 10;        
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int factorialResult = factorial(n);
        System.out.println("Factorial of " + n + " is: " + factorialResult);

        int digitSum = sumOfDigits(factorialResult);
        System.out.println("Sum of the digits of the factorial is: " + digitSum);

        scanner.close();
    }
}
/* 
Output
Enter a number: 7
Factorial of 7 is: 5040
Sum of the digits of the factorial is: 9
*/
