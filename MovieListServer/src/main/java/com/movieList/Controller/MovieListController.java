package com.movieList.Controller;

import com.movieList.Service.MovieDTO;
import com.movieList.Service.MovieListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") //Para ignorar CORS
@RestController
public class MovieListController implements MovieListAPI {

    @Autowired
    MovieListService ms;
    @Override
    public List<MovieDTO> getAllMovies() {
        return ms.getAllMovies();
    }

    @Override
    public List<MovieDTO> getTop10RevenueMovies() {
        return ms.getTopRevenueMovies();
    }

    @Override
    public List<MovieDTO> getTop10RevenueMoviesByYear(int year) {
        System.out.println(year);
        return ms.getTopRevenueMoviesByYear(year);
    }

}
