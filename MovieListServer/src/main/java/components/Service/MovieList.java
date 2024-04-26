package components.Service;

import java.util.List;

public interface MovieList {

    /**
     * This method will return the list of all movies in the database.
     */
    List<Movie> getAllMovies();

    /**
     * This method returns a list with the 10 movies with the highest revenue overall.
     * Should this be a ten element array instead?
     */
    List<Movie> getTopRevenueMovies();

    /**
     * This method returns a list with the 10 movies with the highest revenue that were released in that year.
     * Should this be a ten element array instead?
     * @param year - The year that that we want to check. Should this be an int?
     */
    List<Movie> getTopRevenueMoviesByYear(int year);

}
