package DublyLinkedList.moviemanagementsystem;

public class MovieManagement {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();

        // Add movies to the list
        movieList.addMovieAtBeginning("The Dark Knight", "Christopher Nolan", 2008, 9.0);
        movieList.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movieList.addMovieAtEnd("The Matrix", "Wachowskis", 1999, 8.7);
        movieList.addMovieAtPosition("The Prestige", "Christopher Nolan", 2006, 8.5, "Inception");

        // Display movies in forward order
        System.out.println("Movies in Forward Order:");
        movieList.displayMoviesForward();

        // Display movies in reverse order
        System.out.println("\nMovies in Reverse Order:");
        movieList.displayMoviesReverse();

        // Update a movie's rating
        movieList.updateMovieRating("Inception", 9.2);

        // Display updated movies in forward order
        System.out.println("\nMovies after updating Inception's rating:");
        movieList.displayMoviesForward();

        // Search for a movie by Director
        MovieNode foundMovie = movieList.searchMovieByDirector("Christopher Nolan");
        if (foundMovie != null) {
            System.out.println("\nFound movie by Director (Christopher Nolan): " + foundMovie.title);
        }

        // Search for a movie by Rating
        foundMovie = movieList.searchMovieByRating(8.7);
        if (foundMovie != null) {
            System.out.println("\nFound movie with Rating 8.7: " + foundMovie.title);
        }

        // Remove a movie by title
        movieList.removeMovieByTitle("Interstellar");

        // Display movies after removal
        System.out.println("\nMovies after removing Interstellar:");
        movieList.displayMoviesForward();
    }
    
}
