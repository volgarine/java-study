package OOP.cMethodOverloading.Domain;

// OVERLOADING WITH public void init
public class TvShow {
    private String name;
    private int seasons;
    private int episode;
    private String genre;

    public void init(String name, int seasons, int episode) {
        this.name = name;
        this.seasons = seasons;
        this.episode = episode;
    }

    // EXAMPLE WITH METHOD INIT
    // With method overloading, multiple methods can have the same name with different parameters:
    public void init(String name, int seasons, int episode, String genre) { //Method Overloading
        this.name = name;
        this.seasons = seasons;
        this.episode = episode;
        this.genre = genre;
    }

    public void print() {
        System.out.println("TV Show: " + this.name);
        System.out.println("Season: " + this.seasons);
        System.out.println("Episode: " + this.episode);
        System.out.println("Genre: " + this.genre);
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
}
