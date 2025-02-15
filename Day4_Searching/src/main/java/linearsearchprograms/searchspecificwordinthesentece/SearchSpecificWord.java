package linearsearchprograms.searchspecificwordinthesentece;
import java.util.Scanner;

public class SearchSpecificWord {

    // Method to search for a specific word in the array of sentences
    public static String findWord(String[] sentences, String specificWord) {
        // Loop through each sentence in the sentences array
        for(String sentence : sentences) {
            // Check if the sentence contains the specific word
            if(sentence.contains(specificWord)) {
                return sentence;  // Return the sentence if the word is found
            }
        }
        // If the word is not found in any sentence, return "Not Found"
        return "Not Found";
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the array (number of sentences)
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        sc.nextLine();  // Consume the newline character left by nextInt()

        // Declare an array of strings to store the sentences
        String[] sentences = new String[size];

        // Ask the user to input sentences
        System.out.println("Enter sentences in array");
        for(int i = 0; i < size; i++) {
            sentences[i] = sc.nextLine();  // Store each sentence in the array
        }

        // Ask the user to input the word to search for
        System.out.println("Enter word");
        String specificWord = sc.next();  // Read the word to search for

        // Call the findWord method to search for the specific word in the sentences
        // Print the result
        System.out.println("Word " + specificWord + " is: " + findWord(sentences, specificWord));
    }
}
