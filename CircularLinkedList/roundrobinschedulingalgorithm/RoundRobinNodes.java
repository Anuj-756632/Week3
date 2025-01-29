package CircularLinkedList.roundrobinschedulingalgorithm;

public class RoundRobinNodes {
    private ProcessNode head;  // Head of the circular linked list
    private ProcessNode tail;  // Tail of the circular linked list
    private int totalProcesses;
    private int totalWaitTime;
    private int totalTurnAroundTime;

    // Constructor to initialize the scheduler
    public RoundRobinNodes() {
        head = null;
        tail = null;
        totalProcesses = 0;
        totalWaitTime = 0;
        totalTurnAroundTime = 0;
    }

    // Add a new process to the circular linked list (queue)
    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newProcess = new ProcessNode(processId, burstTime, priority);

        if (head == null) {
            head = newProcess;
            tail = newProcess;
            newProcess.next = head;  // Circular link
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;  // Circular link
        }
        totalProcesses++;
    }

    // Remove a process by its Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }

        ProcessNode temp = head;
        ProcessNode prev = null;

        // If the process to be removed is the head
        if (head.processId == processId) {
            if (head == head.next) {
                head = null;
                tail = null;
            } else {
                tail.next = head.next;  // Update tail to skip the head
                head = head.next;
            }
            totalProcesses--;
            return;
        }

        // Traverse the list to find the process to remove
        do {
            prev = temp;
            temp = temp.next;
            if (temp.processId == processId) {
                prev.next = temp.next;
                if (temp == tail) {
                    tail = prev;  // Update tail if we removed the last process
                }
                totalProcesses--;
                return;
            }
        } while (temp != head);

        System.out.println("Process with ID " + processId + " not found.");
    }

    // Simulate Round-Robin Scheduling with a fixed time quantum
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalBurstTime = 0;
        ProcessNode temp = head;
        while (temp != null) {
            totalBurstTime += temp.burstTime;
            temp = temp.next;
            if (temp == head) break;
        }

        int totalTimeElapsed = 0;
        while (totalProcesses > 0) {
            temp = head;
            while (temp != null) {
                if (temp.burstTime > 0) {
                    int executionTime = Math.min(temp.burstTime, timeQuantum);
                    temp.burstTime -= executionTime;
                    totalTimeElapsed += executionTime;

                    // Calculate waiting time and turn-around time
                    totalWaitTime += totalTimeElapsed - executionTime;
                    totalTurnAroundTime += totalTimeElapsed;

                    System.out.println("Process " + temp.processId + " executed for " + executionTime + " units.");

                    // If the process finishes, remove it
                    if (temp.burstTime == 0) {
                        System.out.println("Process " + temp.processId + " completed execution.");
                        removeProcess(temp.processId);
                    }
                }

                temp = temp.next;
                if (temp == head) break;
            }
            displayProcesses();  // Display the remaining processes after each round
        }

        // After all processes are completed, calculate the average wait time and turn-around time
        calculateAverages();
    }

    // Display the list of processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode temp = head;
        System.out.println("Current processes in the queue:");
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime +
                    ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Calculate and display the average waiting time and turn-around time
    private void calculateAverages() {
        if (totalProcesses == 0) {
            System.out.println("No processes to calculate averages.");
            return;
        }

        double avgWaitTime = (double) totalWaitTime / totalProcesses;
        double avgTurnAroundTime = (double) totalTurnAroundTime / totalProcesses;

        System.out.println("Average Waiting Time: " + avgWaitTime);
        System.out.println("Average Turn-Around Time: " + avgTurnAroundTime);
    }
    
}
