package CircularLinkedList.taskschedulersystem;

public class TaskScheduler {
    public static void main(String[] args) {
        TaskNewNodes scheduler = new TaskNewNodes();

        // Adding tasks
        scheduler.addTaskAtBeginning(1, "Task 1", 3, "2025-02-01");
        scheduler.addTaskAtEnd(2, "Task 2", 1, "2025-02-02");
        scheduler.addTaskAtEnd(3, "Task 3", 2, "2025-02-03");
        scheduler.addTaskAtEnd(4, "Task 4", 3, "2025-02-04");

        // Display all tasks
        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        // View the current task and move to next task
        System.out.println("\nViewing tasks:");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();

        // Search for tasks with priority 3
        System.out.println("\nSearching for tasks with priority 3:");
        scheduler.searchTaskByPriority(3);

        // Remove a task by Task ID
        System.out.println("\nRemoving Task with ID 2:");
        scheduler.removeTaskById(2);
        scheduler.displayAllTasks();
    }
    
}
