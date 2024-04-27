package components.Controller;

import components.Service.Movie;
import components.Service.MovieListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MovieListController implements MovieListAPI {

    @Autowired
    MovieListService ms;
    @Override
    public List<Movie> getAllMovies() {
        return ms.getAllMovies();
    }

    @Override
    public List<Movie> getTop10RevenueMovies() {
        return ms.getTopRevenueMovies();
    }

    @Override
    public List<Movie> getTop10RevenueMoviesByYear(int year) {
        return ms.getTopRevenueMoviesByYear(year);
    }

    @Override
    public Movie getMovie(long id) {
        return null;
    }
}
