package stackandqueueprograms.sortstackusingrecursion;

import java.util.Stack;

public class SortStack {


        // Function to sort the stack
        public  void sortStack(Stack<Integer> stack) {
            // Base case: if stack is empty or has only one element, it's already sorted
            if (stack.isEmpty()) {
                return;
            }

            // Pop the top element
            int top = stack.pop();

            // Recursively sort the remaining stack
            sortStack(stack);

            // Insert the popped element back into the sorted stack
            insertSorted(stack, top);
        }

        // Function to insert an element in the sorted stack
        public static void insertSorted(Stack<Integer> stack, int element) {
            // Base case: if stack is empty or element is greater than the top element
            if (stack.isEmpty() || stack.peek() <= element) {
                stack.push(element);
                return;
            }

            // If the element is smaller than the top of the stack, pop the top
            int temp = stack.pop();

            // Recursively call insertSorted to find the correct position
            insertSorted(stack, element);

            // Push the popped element back to stack
            stack.push(temp);
        }

        // Helper function to print the stack (for testing purposes)
        public  void printStack(Stack<Integer> stack) {
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }

}
