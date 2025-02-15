package binarysearchingprograms.rotationpointinrotatedsortedarray;

public class FindRotationPoint {

        // Function to find the index of the smallest element
        public static int findRotationPoint(int[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int mid = (left + right) / 2;

                // If the middle element is greater than the rightmost element,
                // the smallest element is in the right half
                if (arr[mid] > arr[right]) {
                    left = mid + 1;
                }
                // If the middle element is less than or equal to the rightmost element,
                // the smallest element is in the left half
                else {
                    right = mid;
                }
            }

            // Left will be at the smallest element after the loop
            return left;
        }

        public static void main(String[] args) {
            // Test the function with an example
            int[] arr = {6, 7, 9, 15, 19, 2, 3};
            int rotationPoint = findRotationPoint(arr);
            System.out.println("The rotation point index is: " + rotationPoint);
            System.out.println("The smallest element is: " + arr[rotationPoint]);
        }

}
