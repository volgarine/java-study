package OOP.cMethodOverloading.Test;

import OOP.cMethodOverloading.Domain.TvShow;

public class TvShowTest01 {
    public static void main(String[] args) {
        TvShow tvShow = new TvShow();
//        tvShow.setName("Game of Thrones");
//        tvShow.setSeasons(8);
        tvShow.init("Game of Thrones", 8,5,"adventure");
        tvShow.print();
    }

}
