package binarysearchingprograms.searchtargetvaluein2dsortedmatrix;

public class BinarySearchIn2DMatrix {

        // Function to perform binary search in the matrix
        public static boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false; // Return false if the matrix is empty
            }

            int rows = matrix.length;
            int cols = matrix[0].length;

            // Initialize left and right pointers
            int left = 0;
            int right = rows * cols - 1;

            while (left <= right) {
                // Find the middle element index
                int mid = left + (right - left) / 2;

                // Convert mid to row and column indices
                int row = mid / cols;
                int col = mid % cols;

                // Compare the middle element with the target
                if (matrix[row][col] == target) {
                    return true; // Target found
                }
                // If the target is smaller, search the left half
                else if (matrix[row][col] > target) {
                    right = mid - 1;
                }
                // If the target is larger, search the right half
                else {
                    left = mid + 1;
                }
            }

            // Target not found
            return false;
        }

        public static void main(String[] args) {
            // Example matrix where each row is sorted, and the first element of each row is greater than the last element of the previous row
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {2, 5, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            int target =5;
            boolean found = searchMatrix(matrix, target);

            // Output the result
            System.out.println("Target " + target + " found: " + found);
        }

}
