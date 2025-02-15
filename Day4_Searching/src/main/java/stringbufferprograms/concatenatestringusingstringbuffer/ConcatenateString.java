package stringbufferprograms.concatenatestringusingstringbuffer;

import java.util.Scanner;

public class ConcatenateString {

    // Method to concatenate an array of strings using StringBuffer
    public static String concateString(String[] str) {
        // Create a new StringBuffer to efficiently build the concatenated string
        StringBuffer str1 = new StringBuffer();

        // Loop through each string in the input array
        for (int i = 0; i < str.length; i++) {
            // Append each string from the array to the StringBuffer
            str1.append(str[i]);
        }

        // Convert the StringBuffer to a String and return the result
        return str1.toString();
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user (currently not used)
        Scanner sc = new Scanner(System.in);

        // Hardcoding an array of strings to demonstrate concatenation
        String[] str = {"my", "name", "is", "Anuj"};

        // Call the concateString method and print the concatenated result
        System.out.println(concateString(str));
    }
}
