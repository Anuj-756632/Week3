package stackandqueueprograms.subarraywithzerosum;


import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class SubArray {
        // Function to find all subarrays whose sum is zero
        public List<int[]> findZeroSumSubarrays(int[] arr) {
            List<int[]> result = new ArrayList<>();
            HashMap<Integer, List<Integer>> sumMap = new HashMap<>();
            int cumulativeSum = 0;

            // Traverse the array
            for (int i = 0; i < arr.length; i++) {
                // Add the current element to the cumulative sum
                cumulativeSum += arr[i];

                // If the cumulative sum is zero, the subarray from the start to the current index has a sum of zero
                if (cumulativeSum == 0) {
                    result.add(new int[]{0, i});
                }

                // If the cumulative sum has been seen before, there exists a subarray with zero sum
                if (sumMap.containsKey(cumulativeSum)) {
                    // Fetch the list of previous indices where the same cumulative sum was found
                    List<Integer> previousIndices = sumMap.get(cumulativeSum);
                    for (int start : previousIndices) {
                        result.add(new int[]{start + 1, i});
                    }
                }

                // Add the current index to the list of indices for this cumulative sum
                sumMap.putIfAbsent(cumulativeSum, new ArrayList<>());
                sumMap.get(cumulativeSum).add(i);
            }

            return result;
        }

        // Helper function to print the subarrays
        public void printSubarrays(List<int[]> subarrays) {
            for (int[] subarray : subarrays) {
                System.out.println("Subarray from index " + subarray[0] + " to " + subarray[1]);
            }
        }

}
