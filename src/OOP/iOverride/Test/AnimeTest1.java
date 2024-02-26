package OOP.iOverride.Test;

import OOP.iOverride.Domain.Anime;

// CLASS: toString method override

public class AnimeTest1 {
    public static void main(String[] args) {
        Anime anime = new Anime("The Simpsons");
        System.out.println("Before using toString the result was: OOP.iOverwriting.Domain.Anime@5305068a");
        System.out.println();
        System.out.println("After toString:");
        System.out.println(anime);

    }
}
