package CircularLinkedList.taskschedulersystem;

public class TaskNewNodes {
    private TaskNode head;
    private TaskNode currentTask;

    // Constructor to initialize the scheduler
    public TaskNewNodes() {
        this.head = null;
        this.currentTask = null;
    }

    // Add a task at the beginning of the circular list
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head; // Circular link
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head; // Circular link
            head = newTask; // Update head to the new task
        }
    }

    // Add a task at the end of the circular list
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head; // Circular link
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head; // Circular link
        }
    }

    // Add a task at a specific position (by Task ID)
    public void addTaskAtPosition(int taskId, String taskName, int priority, String dueDate, int positionTaskId) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null || head.taskId == positionTaskId) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        while (temp.next != head && temp.taskId != positionTaskId) {
            temp = temp.next;
        }

        if (temp.taskId == positionTaskId) {
            newTask.next = temp.next;
            temp.next = newTask;
        } else {
            addTaskAtEnd(taskId, taskName, priority, dueDate);
        }
    }

    // Remove a task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        // If head node is to be removed
        if (head.taskId == taskId) {
            if (head.next == head) {
                head = null; // Only one task in the list
            } else {
                TaskNode temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next; // Update the last node's next pointer
                head = head.next; // Move head to the next task
            }
            return;
        }

        // Traverse to find and remove the task node
        TaskNode temp = head;
        while (temp.next != head && temp.next.taskId != taskId) {
            temp = temp.next;
        }

        if (temp.next != head) {
            temp.next = temp.next.next; // Bypass the node to be removed
        } else {
            System.out.println("Task with ID " + taskId + " not found.");
        }
    }

    // View the current task and move to the next task in the circular list
    public void viewCurrentTask() {
        if (currentTask == null) {
            currentTask = head;
        }
        if (currentTask != null) {
            System.out.println("Current Task: " + currentTask.taskId + " - " + currentTask.taskName);
            currentTask = currentTask.next;
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display all tasks starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by Priority
    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task found - ID: " + temp.taskId + ", Name: " + temp.taskName +
                        ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with priority " + priority);
        }
    }
    
}
