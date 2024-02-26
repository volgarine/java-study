package OOP.dConstructor.Test;

import OOP.dConstructor.Domain.TvShowConstructor;

public class TvShowConstructorTest01 {
    public static void main(String[] args) {
        TvShowConstructor tvShow = new TvShowConstructor("The Walking Dead", 3, 4, "Action");
        TvShowConstructor tvShow2 = new TvShowConstructor();
        tvShow.print();
        tvShow2.print();
    }

}
