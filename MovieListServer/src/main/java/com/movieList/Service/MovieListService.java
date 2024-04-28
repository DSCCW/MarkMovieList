package com.movieList.Service;

import com.movieList.Repository.MovieRepository;
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

    public MovieListService() {

    }

    @Override
    public List<MovieDTO> getAllMovies() {
        Iterator<Movie> itMovie = movies.findAll().iterator();
        List<MovieDTO> movieList = new ArrayList<>();
        while (itMovie.hasNext())
            movieList.add(convertDto(itMovie.next()));

        return movieList;
    }

    @Override
    public List<MovieDTO> getTopRevenueMovies() {
        List<Movie> aux = movies.findTop10ByOrderByRevenueDesc();
        List<MovieDTO> movieList = new ArrayList<>();
        for (int i = 0; i < aux.size(); i++) {
            movieList.add(convertDto(aux.get(i)));
        }
        return movieList;
    }

    @Override
    public List<MovieDTO> getTopRevenueMoviesByYear(int year) {
        List<Movie> aux = movies.findTop10ByYearOrderByRevenueDesc(year);
        List<MovieDTO> movieList = new ArrayList<>();
        for (int i = 0; i < aux.size(); i++) {
            movieList.add(convertDto(aux.get(i)));
        }
        return movieList;
    }

    @Override
    public Movie getMovie(long id) {
        Optional<Movie> mov = movies.findById(id);
        if (mov.isPresent())
            return mov.get();
        return null;
    }

    private MovieDTO convertDto(Movie mov) {
        return new MovieDTO(mov.id, mov.movieTitle, mov.releaseYear, mov.description, mov.director, mov.actors, mov.runtime, mov.rating, mov.votes, mov.revenue, mov.metascore);
    }
}
