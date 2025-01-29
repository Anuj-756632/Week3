package CircularLinkedList.taskschedulersystem;

public class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    // Constructor to initialize the task node
    public TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null; // Will be linked to the next node later
    }
}

