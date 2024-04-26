package components.Service;

import components.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        return null;
    }

    @Override
    public List<Movie> getTopRevenueMoviesByYear(int year) {
        return null;
    }
}
