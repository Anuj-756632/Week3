package DublyLinkedList.librarymanagementsystem;

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryBook library = new LibraryBook();

        // Adding books to the library
        library.addBookAtBeginning("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true);
        library.addBookAtEnd("Moby Dick", "Herman Melville", "Adventure", 102, false);
        library.addBookAtEnd("1984", "George Orwell", "Dystopian", 103, true);
        library.addBookAtEnd("To Kill a Mockingbird", "Harper Lee", "Fiction", 104, true);

        // Display books in forward order
        System.out.println("Books in Forward Order:");
        library.displayBooksForward();

        // Display books in reverse order
        System.out.println("\nBooks in Reverse Order:");
        library.displayBooksReverse();

        // Search for a book by title
        BookNode foundBook = library.searchBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("\nFound book by Title: " + foundBook.title);
        }

        // Search for a book by author
        foundBook = library.searchBookByAuthor("Harper Lee");
        if (foundBook != null) {
            System.out.println("\nFound book by Author: " + foundBook.title);
        }

        // Update availability status
        library.updateAvailabilityStatus(102, true);
        System.out.println("\nBooks after updating availability status for Moby Dick:");
        library.displayBooksForward();

        // Count total number of books in the library
        System.out.println("\nTotal number of books in the library: " + library.countTotalBooks());

        // Remove a book by Book ID
        library.removeBookById(103);
        System.out.println("\nBooks after removing '1984':");
        library.displayBooksForward();
    }
    
}
