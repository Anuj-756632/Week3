package stackandqueueprograms.twosumproblem;

public class UseTwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSumUsingHashMap twoSum=new TwoSumUsingHashMap();
        int[] result = twoSum.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices found: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
