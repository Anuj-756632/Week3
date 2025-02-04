package stackandqueueprograms.slidingwindow;

public class UseSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        SlidingWindowMaximum slide=new SlidingWindowMaximum();

        System.out.println("Input Array:");
        slide.printArray(nums);

        int[] result = slide.maxSlidingWindow(nums, k);

        System.out.println("Maximums in each sliding window:");
        slide.printArray(result);
    }
}
