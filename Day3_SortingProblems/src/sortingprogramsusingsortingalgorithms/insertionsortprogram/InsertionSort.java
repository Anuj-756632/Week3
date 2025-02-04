package sortingprogramsusingsortingalgorithms.insertionsortprogram;
import java.util.Arrays;
public class InsertionSort {
        public static void insertionSort(int[] empId) {
            int n = empId.length;
            for (int i = 1; i < n; i++) {
                int key = empId[i];
                int j = i - 1;
                // Move elements that are greater than key to one position ahead
                while (j >= 0 && empId[j] > key) {
                    empId[j + 1] = empId[j];
                    j--;
                }
                empId[j + 1] = key;
            }
        }

        public static void main(String[] args) {
            int[] empId = {5, 3, 8, 4, 2};
            insertionSort(empId);
            System.out.println(Arrays.toString(empId));
        }

}
