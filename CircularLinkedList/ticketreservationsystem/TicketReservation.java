package CircularLinkedList.ticketreservationsystem;

public class TicketReservation {
    private TicketNode head;  // Head of the circular linked list
    private TicketNode tail;  // Tail of the circular linked list
    private int totalTickets; // Total number of booked tickets

    // Constructor to initialize the reservation system
    public TicketReservation() {
        head = null;
        tail = null;
        totalTickets = 0;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            // If the list is empty, the new ticket is both the head and the tail
            head = newTicket;
            tail = newTicket;
            newTicket.next = head;  // Circular link
        } else {
            // Otherwise, add the new ticket to the end of the list
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;  // Circular link
        }

        totalTickets++;  // Increment the total number of tickets
    }

    // Remove a ticket reservation by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode temp = head;
        TicketNode prev = null;

        // If the ticket to be removed is the head node
        if (head.ticketId == ticketId) {
            if (head == head.next) {
                head = null;  // Only one ticket in the list
                tail = null;
            } else {
                tail.next = head.next;  // Update tail to skip the head node
                head = head.next;       // Move head to the next ticket
            }
            totalTickets--;
            return;
        }

        // Traverse the list to find the ticket to remove
        do {
            prev = temp;
            temp = temp.next;
            if (temp.ticketId == ticketId) {
                prev.next = temp.next;  // Skip the node to be removed
                if (temp == tail) {
                    tail = prev;  // Update tail if the last node is removed
                }
                totalTickets--;
                return;
            }
        } while (temp != head);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Display the current tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode temp = head;
        System.out.println("Current Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer Name: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println("Ticket found: " + "Ticket ID: " + temp.ticketId + ", Customer Name: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Booking Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for customer or movie: " + query);
        }
    }

    // Calculate the total number of booked tickets
    public int getTotalBookedTickets() {
        return totalTickets;
    }
    
}
