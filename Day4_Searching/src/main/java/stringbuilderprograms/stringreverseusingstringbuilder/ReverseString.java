package stringbuilderprograms.stringreverseusingstringbuilder;

public class ReverseString {

    // Method to reverse the given string using StringBuilder
    public static String reverseString(String str) {
        // Create a StringBuilder object and append the input string to it
        StringBuilder str1 = new StringBuilder();
        str1.append(str);

        // Use the reverse() method of StringBuilder to reverse the string
        // Convert the reversed StringBuilder back to a string using toString() and return it
        return str1.reverse().toString();
    }

    public static void main(String[] args) {
        // Define a string that we want to reverse
        String str = "hello";

        // Call the reverseString method and print the reversed string
        System.out.println(reverseString(str)); // Output will be "olleh"
    }
}
