package sortingprogramsusingsortingalgorithms.selectionsortprogram;

public class SelectionSort {
        static void selectionSort(int[] examScore){
            int n = examScore.length;
            for (int i = 0; i < n - 1; i++) {

                // Assume the current position holds
                // the minimum element
                int min_idx = i;

                // Iterate through the unsorted portion
                // to find the actual minimum
                for (int j = i + 1; j < n; j++) {
                    if (examScore[j] < examScore[min_idx]) {

                        // Update min_idx if a smaller element
                        // is found
                        min_idx = j;
                    }
                }

                // Move minimum element to its
                // correct position
                int temp = examScore[i];
                examScore[i] = examScore[min_idx];
                examScore[min_idx] = temp;
            }
        }

        public static void printArray(int[] examScore){
            for (int val : examScore) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    public static void main(String[] args){
        int []examScore= {97,86,75,64,78,79};
        System.out.print("Original array: ");
        printArray(examScore);

        selectionSort(examScore);

        System.out.print("Sorted array: ");
        printArray(examScore);
    }
}
