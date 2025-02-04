package stackandqueueprograms.subarraywithzerosum;

import java.util.List;

public class UseSubArray {

    public static void main(String[] args) {
        int[] arr = {6, -1, 3, -3, 4, -2, 2, 5};
        SubArray subArray=new SubArray();
        List<int[]> zeroSumSubarrays = subArray.findZeroSumSubarrays(arr);

        if (zeroSumSubarrays.isEmpty()) {
            System.out.println("No subarrays with sum zero found.");
        } else {
            System.out.println("Subarrays with sum zero:");
            subArray.printSubarrays(zeroSumSubarrays);
        }
    }
}
