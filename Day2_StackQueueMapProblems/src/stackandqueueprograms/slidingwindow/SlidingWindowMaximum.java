package stackandqueueprograms.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    // Function to find the maximum element in each sliding window of size k
    public  int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        // Process the first k elements separately
        for (int i = 0; i < k; i++) {
            // Remove elements smaller than the current element from the deque
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            // Add the current element's index to the deque
            deque.offerLast(i);
        }

        // Add the maximum of the first window
        result[0] = nums[deque.peekFirst()];

        // Process the rest of the elements
        for (int i = k; i < n; i++) {
            // Remove elements outside the current window (i - k)
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove elements smaller than the current element from the deque
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add the current element's index to the deque
            deque.offerLast(i);

            // The current window's maximum element is at the front of the deque
            result[i - k + 1] = nums[deque.peekFirst()];
        }

        return result;
    }

    // Helper function to print the result array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

