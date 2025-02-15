package inputstreamreaderprograms.covertbytetocharacterstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertByteStreamToCharacterStream {

    // Method to convert byte stream to character stream and read content from the file
    public static void convertStream(String path) {
        try {
            // Create a FileInputStream to read the file at the specified path
            FileInputStream file = new FileInputStream(path);

            // Create an InputStreamReader to convert the byte stream into a character stream
            InputStreamReader reader = new InputStreamReader(file);

            // Wrap the InputStreamReader with BufferedReader for efficient reading of lines
            BufferedReader br = new BufferedReader(reader);

            String line;
            // Read each line from the BufferedReader
            while ((line = br.readLine()) != null) {
                // Print each line read from the file
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle IO exceptions, e.g., file not found or other input-output issues
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Define the file path from which to read data
        String path = "D:\\NormalFile.txt";

        // Call the method to convert the byte stream to a character stream and print file content
        convertStream(path);
    }
}
