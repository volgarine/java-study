//toString method override

package OOP.iOverride.Domain;

public class Anime {
    private String name;

    @Override
    public String toString() { //CMD + N + toString
        return "Anime{" +
                "name='" + name + '\'' +
                '}';
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
