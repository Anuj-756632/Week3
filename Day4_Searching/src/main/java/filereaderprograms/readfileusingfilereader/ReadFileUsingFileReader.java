package filereaderprograms.readfileusingfilereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

    // Method to read and print the contents of a file
    public static void readFile(String path) {
        try {
            // Create a FileReader to open the file at the specified path
            FileReader file = new FileReader(path);

            // Wrap the FileReader in a BufferedReader for efficient line-by-line reading
            BufferedReader br = new BufferedReader(file);
            String line;

            // Read each line from the BufferedReader until the end of the file (null is returned)
            while ((line = br.readLine()) != null) {
                // Print the line to the console
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle any IO exceptions that occur (e.g., file not found, read error)
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Define the file path where the text file is located
        String path = "D:\\NormalFile.txt";

        // Call the readFile method to read and display the contents of the file
        readFile(path);
    }
}
