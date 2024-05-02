package com.movieList.Service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {

    @Id
    long id;
    long revenue; // revenue de um filme pode ser maior do que uma variavel int consegue segura, causando overflow
    String movieTitle, description, director;
    String[] actors;
    int releaseYear, runtime, votes, metascore;
    double rating;

    public Movie(long id, String movieTitle, int releaseYear, String description, String director, String[] actors, int runtime, double rating, int votes, long revenue, int metascore) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.description = description;
        this.releaseYear = releaseYear;
        this.runtime = runtime;
        this.actors = actors;
        this.votes = votes;
        this.revenue = revenue;
        this.metascore = metascore;
        this.rating = rating;
        this.director = director;
    }

    public Movie() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public int getMetascore() {
        return metascore;
    }

    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


}
