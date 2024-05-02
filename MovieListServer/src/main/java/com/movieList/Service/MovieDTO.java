package com.movieList.Service;

public record MovieDTO(long id, String movieTitle, int releaseYear, String description, String director, String[] actors, int runtime, double rating, int votes, long revenue, int metascore) {

}


