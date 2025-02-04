package stackandqueueprograms.sortstackusingrecursion;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        SortStack sortList=new SortStack();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        // Pushing elements onto the stack
        System.out.println("Original Stack:");
        // printStack(stack); // Making a copy to print without affecting the original

        // Sort the stack (pass the original stack here)
        sortList.sortStack(stack);

        System.out.println("Sorted Stack:");
        sortList.printStack(stack); // Printing the sorted stack
    }
}
