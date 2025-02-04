package stackandqueueprograms.longestconsicutivesequence;
import java.util.HashSet;
public class LongestSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Return 0 if the array is empty
        }

        // Step 1: Insert all numbers into a hash set
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Step 2: Find the longest consecutive sequence
        for (int num : nums) {
            // If num-1 is not in the set, it means this is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Check for consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update longest streak
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
