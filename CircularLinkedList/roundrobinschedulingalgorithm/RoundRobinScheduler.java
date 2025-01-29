package CircularLinkedList.roundrobinschedulingalgorithm;

public class RoundRobinScheduler {
    public static void main(String[] args) {
        RoundRobinNodes scheduler = new RoundRobinNodes();

        // Add some processes with their burst time and priority
        scheduler.addProcess(1, 10, 3);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 2);
        scheduler.addProcess(4, 6, 1);

        // Display all processes
        scheduler.displayProcesses();

        // Simulate Round-Robin scheduling with a time quantum of 4 units
        scheduler.roundRobinScheduling(4);
    }
    
}
