package stackandqueueprograms.pairwithgivensum;

import javafx.util.Pair;

public class UsePairSum {

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        PairsSumInArray pair=new PairsSumInArray();
        if (pair.pairWithSum(arr, target)) {
            System.out.println("There exists a pair with the sum " + target);
        } else {
            System.out.println("No pair found with the sum " + target);
        }
    }
}
