package linearsearchprograms.findindexofnegativenumber;
import java.util.Scanner;

public class FindFirstNegativeNumber {

    // Method to find the index of the first negative number in the array
    public static int checkNumber(int[] num) {
        // Loop through the array to check each number
        for(int i = 0; i < num.length; i++) {
            // If a negative number is found, return its index
            if(num[i] < 0) {
                return i;  // Return the index of the first negative number
            }
        }
        // If no negative number is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.println("Enter size of array");
        int size = sc.nextInt();  // Read the size of the array

        // Declare an array to store the numbers
        int[] num = new int[size];

        // Ask the user to input numbers into the array
        System.out.println("Enter numbers in array");
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();  // Store each number in the array
        }

        // Call the checkNumber method to find the index of the first negative number
        // Print the result
        System.out.println("Index of negative number is: " + checkNumber(num));
    }
}
