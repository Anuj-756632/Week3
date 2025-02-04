package sortingprogramsusingsortingalgorithms.quicksortproblem;
import java.util.Arrays;
public class QuickSort {
    public static void quickSort(double[] productPrice, int low, int high) {
        if (low < high) {
            int pi = partition(productPrice, low, high);
            quickSort(productPrice, low, pi - 1);
            quickSort(productPrice, pi + 1, high);
        }
    }

    private static int partition(double[] productPrice, int low, int high) {
        int pivot =(int) productPrice[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (productPrice[j] < pivot) {
                i++;
                double temp = productPrice[i];
                productPrice[i] = productPrice[j];
                productPrice[j] = temp;
            }
        }
        double temp = productPrice[i + 1];
        productPrice[i + 1] = productPrice[high];
        productPrice[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        double[] productPrice = {20, 340, 80, 420, 220};
        quickSort(productPrice, 0, productPrice.length - 1);
        System.out.println(Arrays.toString(productPrice));
    }
}

