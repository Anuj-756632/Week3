package inputstreamreaderprograms.readinputandwriteintofile;
import java.io.*;
import java.util.*;

public class ReadInputuserAndWriteInToFile {
    // Function to read input from the console and write it to a file
    public static void readInputAndWriteToFile(String fileName) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(fileName, true); // 'true' to append to the file
             BufferedWriter bw = new BufferedWriter(fw)) {

            String userInput;
            System.out.println("Enter input (type 'exit' to stop):");

            // Loop to read input and write to the file
            while (true) {
                userInput = br.readLine();  // Read user input from console

                if (userInput.equalsIgnoreCase("exit")) {
                    break;  // Exit the loop if user types 'exit'
                }

                // Write the input to the file
                bw.write(userInput);
                bw.newLine();  // Add a new line after each input
            }

            System.out.println("Input has been written to '" + fileName + "'.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String fileName = "D:\\NormalFile.txt";
        readInputAndWriteToFile(fileName);
    }

}
