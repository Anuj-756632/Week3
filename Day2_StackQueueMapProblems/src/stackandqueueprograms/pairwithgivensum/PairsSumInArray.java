package stackandqueueprograms.pairwithgivensum;
import java.util.HashSet;
public class PairsSumInArray {


        // Function to find if there exists a pair with the given sum
        public boolean pairWithSum(int[] arr, int target) {
            // Create a hash set to store the visited numbers
            HashSet<Integer> visitedNumbers = new HashSet<>();

            // Traverse the array
            for (int num : arr) {
                // Calculate the complement
                int complement = target - num;

                // If complement is in the set, we found a pair
                if (visitedNumbers.contains(complement)) {
                    return true;
                }

                // Otherwise, add the current number to the set
                visitedNumbers.add(num);
            }

            // If no pair is found
            return false;
        }


}
