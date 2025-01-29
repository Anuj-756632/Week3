package DublyLinkedList.librarymanagementsystem;

public class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;  // Availability status (true = available, false = not available)
    BookNode next;
    BookNode prev;

    // Constructor
    public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

