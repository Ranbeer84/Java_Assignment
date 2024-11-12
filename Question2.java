/* 
Create a program that accepts 10 integers from the user, stores them in
an array, and then prints only the prime numbers in that array.
Implement a separate method to check if a number is prime.
*/

import java.util.Scanner;

class Main {


    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; 

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < 10; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }

        scanner.close();
    }
}

/*
Enter 10 integers:
1 2 3 4 5 6 7 8 9 10
Prime numbers in the array:
2 3 5 7
*/