package components.Service;

public record Movie(long id, String movieTitle, int releaseYear, String description, String director, String[] actors, int runtime, float rating, int votes, int revenue, int metascore) {

}
