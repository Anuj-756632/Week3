package filereaderprograms.countoccurrencesofword;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class CountSpecificWordOccurrence {

    // Method to count the number of occurrences of a specific word in a given text file
    public static int countOccurrence(String path, String word) {
        int count = 0;  // Initialize a counter variable to store the word occurrences

        try {
            // Create a BufferedReader to read the file line by line
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;

            // Loop through each line in the file
            while ((line = br.readLine()) != null) {
                // Split the line into words using a space delimiter
                String[] words = line.split(" ");

                // Loop through each word in the line
                for (int i = 0; i < words.length; i++) {
                    // Check if the current word equals the specified word
                    if (words[i].equals(word)) {
                        count++;  // Increment the counter if the word matches
                    }
                }
            }
        } catch (IOException e) {
            // Catch and print the stack trace in case of IO exceptions (e.g., file not found)
            e.printStackTrace();
        }

        // Return the total count of occurrences
        return count;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Define the path of the text file (hardcoded in this case)
        String path = "D:\\NormalFile.txt";

        // Prompt the user to enter the word they want to count
        System.out.println("Enter the word to count occurrences:");
        String word = sc.next();  // Read the word from the user

        // Call the countOccurrence method to count the occurrences of the word in the file
        System.out.println("Occurrences of the word '" + word + "': " + countOccurrence(path, word));
    }
}
