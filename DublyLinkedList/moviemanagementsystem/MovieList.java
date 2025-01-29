package DublyLinkedList.moviemanagementsystem;

public class MovieList {
    MovieNode head;
    MovieNode tail;

    // Constructor
    public MovieList() {
        this.head = null;
        this.tail = null;
    }

    // Add a movie at the beginning
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add a movie at the end
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add a movie at a specific position
    public void addMovieAtPosition(String title, String director, int year, double rating, String positionTitle) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (head == null || head.title.equals(positionTitle)) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.title.equals(positionTitle)) {
                newMovie.next = temp.next;
                newMovie.prev = temp;
                temp.next.prev = newMovie;
                temp.next = newMovie;
                return;
            }
            temp = temp.next;
        }

        // If the position title is not found, add at the end
        addMovieAtEnd(title, director, year, rating);
    }

    // Remove a movie record by Movie Title
    public void removeMovieByTitle(String title) {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp.prev == null) {
                    head = temp.next;
                } else {
                    temp.prev.next = temp.next;
                }

                if (temp.next == null) {
                    tail = temp.prev;
                } else {
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    // Search for a movie by Director
    public MovieNode searchMovieByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Search for a movie by Rating
    public MovieNode searchMovieByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Display all movie records in forward order
    public void displayMoviesForward() {
        if (head == null) {
            System.out.println("No movies to display.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movie records in reverse order
    public void displayMoviesReverse() {
        if (tail == null) {
            System.out.println("No movies to display.");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update a movie's Rating based on Movie Title
    public void updateMovieRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }
    
}
