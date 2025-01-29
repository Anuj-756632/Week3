package DublyLinkedList.librarymanagementsystem;

public class LibraryBook {
    BookNode head;
    BookNode tail;
    int totalBooks;

    // Constructor
    public LibraryBook() {
        this.head = null;
        this.tail = null;
        this.totalBooks = 0;
    }

    // Add a new book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newBook = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
    }

    // Add a new book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newBook = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
    }

    // Add a new book at a specific position
    public void addBookAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int positionBookId) {
        BookNode newBook = new BookNode(title, author, genre, bookId, isAvailable);

        if (head == null || head.bookId == positionBookId) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        BookNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.bookId == positionBookId) {
                newBook.next = temp.next;
                newBook.prev = temp;
                temp.next.prev = newBook;
                temp.next = newBook;
                totalBooks++;
                return;
            }
            temp = temp.next;
        }

        // If positionBookId is not found, add the new book at the end
        addBookAtEnd(title, author, genre, bookId, isAvailable);
    }

    // Remove a book by Book ID
    public void removeBookById(int bookId) {
        if (head == null) {
            System.out.println("No books available in the library.");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp.prev == null) {  // If it's the head
                    head = temp.next;
                } else {
                    temp.prev.next = temp.next;
                }

                if (temp.next == null) {  // If it's the tail
                    tail = temp.prev;
                } else {
                    temp.next.prev = temp.prev;
                }

                totalBooks--;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Search for a book by Title
    public BookNode searchBookByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Search for a book by Author
    public BookNode searchBookByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Update a book’s Availability Status
    public void updateAvailabilityStatus(int bookId, boolean isAvailable) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("No books to display.");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId + ", Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Availability: " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("No books to display.");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId + ", Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Availability: " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.prev;
        }
    }

    // Count the total number of books
    public int countTotalBooks() {
        return totalBooks;
    }

    
}
