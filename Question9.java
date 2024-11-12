/*
Implement a program that accepts an integer input n and prints Floyd's
Triangle up to n rows. Floyd’s Triangle has consecutive numbers starting
from 1. For example, if n = 4, the output should be:
 */

 import java.util.Scanner;

class Main {
   
   static void pattern(int N) {
       int num = 1; 

       for (int i = 1; i <= N; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(num + " ");
               num += 1;  
           }
           System.out.println();  
       }
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number of rows: ");
       int N = scanner.nextInt();  
       
       pattern(N); 
       
       scanner.close();
   }
}

/*
Enter the number of rows: 5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/