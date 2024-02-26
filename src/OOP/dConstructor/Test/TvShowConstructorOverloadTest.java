package OOP.dConstructor.Test;

import OOP.dConstructor.Domain.TvShowConstructorOverload;

public class TvShowConstructorOverloadTest {
    public static void main(String[] args) {
        TvShowConstructorOverload tvShow = new TvShowConstructorOverload("The Walking Dead", 3, 4, "Action", 5);
        tvShow.print();
    }

}
