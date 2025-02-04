package stackandqueueprograms.circulartourproblem;

public class CircularTour {

    // Function to find the starting point for completing the circular tour
    public int findStartPoint(int[] petrol, int[] distance) {
        int total_petrol = 0;
        int total_distance = 0;
        int current_petrol = 0;
        int start = 0;

        // Loop through all the petrol pumps
        for (int i = 0; i < petrol.length; i++) {
            total_petrol += petrol[i]; // Add the petrol at pump i
            total_distance += distance[i]; // Add the distance to the next pump

            current_petrol += petrol[i] - distance[i]; // Surplus petrol at pump i

            // If current_petrol becomes negative, reset the start point
            if (current_petrol < 0) {
                start = i + 1; // Start from the next pump
                current_petrol = 0; // Reset current_petrol
            }
        }

        // If total_petrol is greater than or equal to total_distance, the tour is possible
        return total_petrol >= total_distance ? start : -1;
    }
}

