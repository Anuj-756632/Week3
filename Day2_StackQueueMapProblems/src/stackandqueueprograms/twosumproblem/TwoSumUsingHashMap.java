package stackandqueueprograms.twosumproblem;
import java.util.HashMap;
public class TwoSumUsingHashMap {

    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the value and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two elements that add up to the target
                return new int[]{map.get(complement), i};
            }

            // If the complement is not found, store the current number and its index
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[]{};
    }
}
