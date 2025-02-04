package stackandqueueprograms.longestconsicutivesequence;

public class UseLongestSequence {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        LongestSequence sequence=new LongestSequence();
        int result = sequence.longestConsecutive(nums);

        System.out.println("Length of the longest consecutive sequence: " + result);
    }
}
