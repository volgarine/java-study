package OOP.dConstructor.Domain;

public class TvShowConstructorOverload {
    private String name;
    private int seasons;
    private int episode;
    private String genre;
    private int rating;

    public TvShowConstructorOverload(String name, int seasons, int episode, String genre) { // JAVA CONSTRUCTOR without void because with void is a method
        this(); // call the overloading constructor and need to be the first line, nothing before
        this.name = name;
        this.seasons = seasons;
        this.episode = episode;
        this.genre = genre;
    }

    public TvShowConstructorOverload(String name, int seasons, int episode, String genre, int rating) { // Constructor Overloading
        this(name, seasons, episode, genre); // call the overloading constructor
        this.rating = rating;
    }

    public TvShowConstructorOverload() {
        System.out.println("Inside the Constructor without arguments");
    }

    public void print() {
        System.out.println("TV Show: " + this.name);
        System.out.println("Season: " + this.seasons);
        System.out.println("Episode: " + this.episode);
        System.out.println("Genre: " + this.genre);
        System.out.println("Rating: " + this.rating);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
