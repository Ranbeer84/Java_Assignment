/* 
Write a program that takes an integer input n and stores the first n terms
of the Fibonacci sequence in an array. Then, print the array. For example,
if the user enters 7, store and display the first 7 terms of the Fibonacci
sequence: 0, 1, 1, 2, 3, 5, 8.
 */

 import java.util.Scanner;

class Solution {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Fibonacci sequence: ");
            for (int i = 0; i < n; i++) {
                System.out.print(solution.fib(i) + " ");
            }
        }
        
        scanner.close();
    }
}

/*
Enter the number of terms for the Fibonacci sequence: 4
Fibonacci sequence: 0 1 1 2 
 */