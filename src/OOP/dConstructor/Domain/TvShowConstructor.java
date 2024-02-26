package OOP.dConstructor.Domain;

public class TvShowConstructor {
    private String name;
    private int seasons;
    private int episode;
    private String genre;

    /*** Java Constructors:
     * A constructor in Java is a special method that is used to initialize objects.
     * The constructor is called when an object of a class is created.
     * It can be used to set initial values for object attributes:
     */

    public TvShowConstructor(String name, int seasons, int episode, String genre){ // JAVA CONSTRUCTOR without void because with void is a method
        this.name = name;
        this.seasons = seasons;
        this.episode = episode;
        this.genre = genre;
    }
    public TvShowConstructor(){ // Constructor Overloading
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
