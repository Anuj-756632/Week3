package stackandqueueprograms.implementqueueusingstack;

import java.util.Stack;

public class QueueUsingTwoStack {

    private Stack<Integer> stack1; // Stack for enqueue operation
    private Stack<Integer> stack2; // Stack for dequeue operation

    // Constructor
    public QueueUsingTwoStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation: Push element onto stack1
    public void enqueue(int value) {
        stack1.push(value);
    }

    // Dequeue operation: Pop element from stack2 (transfer elements from stack1 if stack2 is empty)
    public int dequeue() {
        if (stack2.isEmpty()) {
            // Transfer all elements from stack1 to stack2, reversing their order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        // Pop from stack2 to simulate dequeue
        return stack2.pop();
    }

    // Peek operation (optional): Return the front of the queue without removing it
    public int peek() {
        if (stack2.isEmpty()) {
            // Transfer all elements from stack1 to stack2 if needed
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        // Return the front element (top of stack2)
        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

}


