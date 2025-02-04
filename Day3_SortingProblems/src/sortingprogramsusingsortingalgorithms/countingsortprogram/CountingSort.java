package sortingprogramsusingsortingalgorithms.countingsortprogram;

public class CountingSort {

    // Method to implement Counting Sort
    static void countingSort(int[] arr) {
        int max = 18;  // Maximum possible age (based on the problem statement)
        int min = 10;  // Minimum possible age (based on the problem statement)

        // Step 1: Create a count array to store frequencies of ages
        int[] count = new int[max - min + 1];

        // Step 2: Store the frequency of each age in the count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        // Step 3: Modify the count array to store cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Place elements in their correct position in the output array
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Step 5: Copy the output array to the original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    // Method to print the array
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 14, 13, 16, 12, 15, 18, 17, 13, 14};

        System.out.print("Original array: ");
        printArray(studentAges);

        // Perform counting sort
        countingSort(studentAges);

        System.out.print("Sorted array: ");
        printArray(studentAges);
    }
}

