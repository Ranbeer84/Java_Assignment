/*
Write a program that takes an integer input n and prints a pyramid of
numbers up to n rows, where each row has an increasing count of
numbers. For example, if n = 4, the output should be:
 */
class Main {
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
     }
 }

 /*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
  */