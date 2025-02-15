package challengeproblem.linearandbinarysearchproblem;
import java.util.Arrays;
public class SearchMissingPositiveInteger {


        // Function to find the first missing positive integer using Linear Search
        public static int firstMissingPositive(int[] nums) {
            int n = nums.length;

            // Mark elements outside the range [1, n] as n+1 (which is an invalid number)
            for (int i = 0; i < n; i++) {
                if (nums[i] <= 0 || nums[i] > n) {
                    nums[i] = n + 1;
                }
            }

            // Use the index as a hash to mark the presence of elements in the range [1, n]
            for (int i = 0; i < n; i++) {
                int num = Math.abs(nums[i]);
                if (num <= n) {
                    nums[num - 1] = -Math.abs(nums[num - 1]);
                }
            }

            // The first index with a positive number is the missing number
            for (int i = 0; i < n; i++) {
                if (nums[i] > 0) {
                    return i + 1;
                }
            }

            // If all numbers in the range [1, n] are marked, the missing number is n+1
            return n + 1;
        }

        // Function to perform Binary Search to find the index of the target number
        public static int binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return mid;  // Target found, return index
                }
                if (arr[mid] < target) {
                    left = mid + 1;  // Search in the right half
                } else {
                    right = mid - 1;  // Search in the left half
                }
            }

            return -1;  // Target not found
        }

        public static void main(String[] args) {
            // Example for first missing positive
            int[] nums = {3, 4, -1, 1};
            int missingPositive = firstMissingPositive(nums);
            System.out.println("First missing positive integer: " + missingPositive);

            // Example for Binary Search
            int[] sortedArr = {-1, 0, 3, 5, 9, 12};
            int target = 9;
            int targetIndex = binarySearch(sortedArr, target);

            if (targetIndex != -1) {
                System.out.println("Target " + target + " found at index: " + targetIndex);
            } else {
                System.out.println("Target " + target + " not found in the array.");
            }
        }

}
