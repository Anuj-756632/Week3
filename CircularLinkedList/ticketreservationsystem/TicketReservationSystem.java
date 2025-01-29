package CircularLinkedList.ticketreservationsystem;

public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketReservation system = new TicketReservation();

        // Adding some tickets to the system
        system.addTicket(1, "John Doe", "Avatar", "A1", "2025-02-01 14:00");
        system.addTicket(2, "Jane Smith", "Titanic", "B2", "2025-02-01 16:00");
        system.addTicket(3, "Alice Johnson", "Avatar", "C3", "2025-02-01 18:00");
        system.addTicket(4, "Bob Brown", "Inception", "D4", "2025-02-01 20:00");

        // Display all tickets
        system.displayTickets();

        // Search for a ticket by customer name
        system.searchTicket("Jane Smith");

        // Remove a ticket by Ticket ID
        system.removeTicket(2);
        system.displayTickets();

        // Search for a ticket by movie name
        system.searchTicket("Avatar");

        // Display total number of booked tickets
        System.out.println("Total Booked Tickets: " + system.getTotalBookedTickets());
    }
    
}
