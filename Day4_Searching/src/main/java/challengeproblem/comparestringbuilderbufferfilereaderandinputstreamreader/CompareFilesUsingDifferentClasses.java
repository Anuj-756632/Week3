package challengeproblem.comparestringbuilderbufferfilereaderandinputstreamreader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareFilesUsingDifferentClasses {

    public static void main(String[] args) {
        // 1. String concatenation using StringBuilder and StringBuffer
        String str = "hello";  // Sample string for concatenation
        int iterations = 1_000_000;  // Number of iterations

        // StringBuilder concatenation
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(str);
        }
        long endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("Time taken using StringBuilder: " + stringBuilderTime / 1_000_000.0 + " milliseconds");

        // StringBuffer concatenation
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(str);
        }
        endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("Time taken using StringBuffer: " + stringBufferTime / 1_000_000.0 + " milliseconds");

        // 2. Reading large file (e.g., 100MB) and counting the number of words
        String filePath = "D:\\Dbmsfile.txt";  // Ensure this file path is correct

        // Call the helper method to read and count words in the file
        int wordCount = readFileAndCountWords(filePath);
        System.out.println("Number of words in the file: " + wordCount);
    }

    // Helper function to read a file and count the number of words
    public static int readFileAndCountWords(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (FileInputStream file = new FileInputStream(filePath);
             InputStreamReader reader = new InputStreamReader(file, StandardCharsets.UTF_8);  // Charset set for UTF-8
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words and count them
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        long endTime = System.nanoTime();
        long fileReadingTime = endTime - startTime;
        System.out.println("Time taken to read the file: " + fileReadingTime / 1_000_000.0 + " milliseconds");
        return wordCount;
    }
}
