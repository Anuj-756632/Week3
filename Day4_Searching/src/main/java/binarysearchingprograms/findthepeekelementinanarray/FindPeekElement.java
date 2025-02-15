package binarysearchingprograms.findthepeekelementinanarray;

public class FindPeekElement {


        // Function to find a peak element using binary search
        public static int findPeekElement(int[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                // Check if mid is a peak element
                if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                        (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                    return mid;  // Return the index of peak element
                }

                // If the left neighbor is greater, search the left half
                if (mid > 0 && arr[mid] < arr[mid - 1]) {
                    right = mid - 1;
                }
                // If the right neighbor is greater, search the right half
                else {
                    left = mid + 1;
                }
            }

            return -1;  // This line should never be reached if the array has at least one peak element
        }

        public static void main(String[] args) {
            // Test the function with an example
            int[] arr = {1, 3, 20, 4, 1, 0};
//            int peakIndex = findPeakElement(arr);

            // Output the peak element index and its value
            System.out.println("Peak element index: " + findPeekElement(arr));
            System.out.println("Peak element value: " + arr[findPeekElement(arr)]);
        }


}
