package stringbuilderprograms.removeduplicatevalueusingstringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

    // Method to remove duplicate characters from a string using StringBuilder
    public static String removeDuplicate(String str) {
        // Create a StringBuilder to store the result without duplicates
        StringBuilder str1 = new StringBuilder();

        // Create a HashSet to track characters that have already been encountered
        HashSet<Character> h = new HashSet<>();

        // Loop through each character in the input string
        for (char c : str.toCharArray()) {
            // Check if the character has already been added to the HashSet
            if (!h.contains(c)) {
                // If it's not a duplicate, append it to the StringBuilder
                str1.append(c);
                // Add the character to the HashSet to keep track of it
                h.add(c);
            }
        }

        // Convert the StringBuilder to a String and return it
        return str1.toString();
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the input string from the user
        String str = sc.next();

        // Call the removeDuplicate method and print the result
        System.out.println(removeDuplicate(str));
    }
}
