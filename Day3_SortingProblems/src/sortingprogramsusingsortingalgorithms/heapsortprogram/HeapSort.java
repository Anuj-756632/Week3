package sortingprogramsusingsortingalgorithms.heapsortprogram;

public class HeapSort {

    // Method to heapify a subtree rooted with node i which is an index in array[].
    // n is the size of the heap
    static void sortHeap(int[] arr, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;  // left = 2*i + 1
        int right = 2 * i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            // Swap arr[i] with arr[largest]
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            sortHeap(arr, n, largest);
        }
    }

    // Method to perform heap sort
    static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            sortHeap(arr, n, i);
        }

        // One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root (largest element) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            sortHeap(arr, i, 0);
        }
    }

    // Method to print the array
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] salaryDemands = {45000, 30000, 60000, 40000, 50000, 55000, 70000};

        System.out.print("Original array: ");
        printArray(salaryDemands);

        // Perform heap sort
        heapSort(salaryDemands);

        System.out.print("Sorted array (Ascending Order): ");
        printArray(salaryDemands);
    }
}

