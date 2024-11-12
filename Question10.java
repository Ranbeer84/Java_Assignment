/* 
Take a string input from the user and a character to search for. Write a
method to count the occurrences of the character in the string and return
the count. Then display the count to the user.
*/

import java.util.Scanner;

class Main {

    // Method to count occurrences of a character in a string
    static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        int occurrences = countOccurrences(inputString, searchChar);

        System.out.println("The character '" + searchChar + "' appears " + occurrences + " times in the string.");

        scanner.close();
    }
}

/*
Enter a string: Ranbeer Singh
Enter a character to search for: n
The character 'n' appears 2 times in the string.
 */