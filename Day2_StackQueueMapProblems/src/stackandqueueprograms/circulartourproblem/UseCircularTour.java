package stackandqueueprograms.circulartourproblem;

public class UseCircularTour {

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4}; // Petrol available at each pump
        int[] distance = {6, 5, 3, 5}; // Distance to the next pump

        CircularTour tour=new CircularTour();
        int startPoint = tour.findStartPoint(petrol, distance);

        if (startPoint == -1) {
            System.out.println("No solution exists. The tour is not possible.");
        } else {
            System.out.println("The tour can be completed starting from pump " + startPoint);
        }
    }
}
