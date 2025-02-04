package sortingprogramsusingsortingalgorithms.bubblesortprogram;

import java.util.Arrays;

public class BubbleSort {
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) break; // Optimization: Stop if no swaps occurred
            }
        }

        public static void main(String[] args) {
            int []studentMarks={60,70,54,35,87,98,68,90,34};
            bubbleSort(studentMarks);
            System.out.println("Student Marks in ascending order");
            System.out.println(Arrays.toString(studentMarks));
        }


}
