package components.Service;

import components.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class MovieListService implements MovieList {

    @Autowired
    MovieRepository movies;


    @Override
    public List<Movie> getAllMovies() {
        Iterator<Movie> itMovie = movies.findAll().iterator();
        List<Movie> movieList = new ArrayList<>();
        while (itMovie.hasNext())
            movieList.add(itMovie.next());

        return movieList;
    }

    @Override
    public List<Movie> getTopRevenueMovies() {
        return movies.findTop10TopByRevenue();
    }

    @Override
    public List<Movie> getTopRevenueMoviesByYear(int year) {
        return movies.findTop10ByRevenueByYear(year);
    }

    @Override
    public Movie getMovie(long id) {
        Optional<Movie> mov = movies.findById(id);
        if (mov.isPresent())
            return mov.get();
        return null;
    }
}
