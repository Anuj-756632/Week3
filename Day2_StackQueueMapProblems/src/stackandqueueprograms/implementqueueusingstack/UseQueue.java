package stackandqueueprograms.implementqueueusingstack;

public class UseQueue {

    public static void main(String[] args) {
        QueueUsingTwoStack queue = new QueueUsingTwoStack();

        // Enqueue some elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue elements and print them
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2

        // Enqueue another element
        queue.enqueue(4);

        // Peek the front element
        System.out.println(queue.peek());   // 3

        // Dequeue remaining elements
        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 4
    }
}
