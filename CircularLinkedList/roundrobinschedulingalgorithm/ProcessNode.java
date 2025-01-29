package CircularLinkedList.roundrobinschedulingalgorithm;

public class ProcessNode {
    int processId;
    int burstTime;  // Remaining burst time
    int priority;
    ProcessNode next;

    // Constructor to initialize the process node
    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

