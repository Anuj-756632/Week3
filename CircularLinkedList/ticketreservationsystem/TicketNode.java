package CircularLinkedList.ticketreservationsystem;

public class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    // Constructor to initialize the ticket node
    public TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;  // Next pointer will be updated when linked
    }
}
