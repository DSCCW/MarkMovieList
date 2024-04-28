package com.movieList.Controller;

import com.movieList.Service.MovieDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/movies")
public interface MovieListAPI {

    @GetMapping("/")
    List<MovieDTO> getAllMovies();

    @GetMapping("/revenue")
    List<MovieDTO> getTop10RevenueMovies();

    @GetMapping("/revenue/{year}")
    List<MovieDTO> getTop10RevenueMoviesByYear(@PathVariable int year);

}
