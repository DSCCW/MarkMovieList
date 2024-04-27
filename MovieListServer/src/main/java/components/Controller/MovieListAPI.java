package components.Controller;

import components.Service.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/movies")
public interface MovieListAPI {

    @GetMapping("/")
    List<Movie> getAllMovies();

    @GetMapping("/revenue")
    List<Movie> getTop10RevenueMovies();

    @GetMapping("/revenue/{year}")
    List<Movie> getTop10RevenueMoviesByYear(@PathVariable int year);

    @GetMapping("/movie/{id}")
    Movie getMovie(@PathVariable long id);
}
