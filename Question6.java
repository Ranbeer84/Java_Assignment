/*
Write a program that accepts n integers from the user (where n is also
provided by the user). Store the numbers in an array and write a method
to find and display the second largest number in the array.
 */
import java.util.Scanner;

public class Question6 {
    // Method to find second largest number in array
    public static Integer findSecondLargest(int[] arr) {
        // Check if array has less than 2 elements
        if (arr.length < 2) {
            return null;
        }
        
        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // First pass to find largest
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        
        // Second pass to find second largest
        for (int num : arr) {
            if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        
        // Check if second largest was found
        if (secondLargest == Integer.MIN_VALUE) {
            // This happens when all elements are equal
            return null;
        }
        
        return secondLargest;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get array size from user
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            scanner.close();
            return;
        }
        
        // Create and populate array
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Find and display second largest
        Integer secondLargest = findSecondLargest(numbers);
        
        // Display results
        System.out.println("\nArray elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        if (secondLargest != null) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There is no second largest number (all numbers might be equal or array has less than 2 elements)");
        }
        
        scanner.close();
    }
}
 /*
Enter the number of elements (n): 4
Enter 4 integers:
Enter number 1: 15
Enter number 2: 15
Enter number 3: 12
Enter number 4: 15

Array elements: 
15 15 12 15
The second largest number is: 12
  */