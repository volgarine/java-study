package OOP.gAssociation.Test;

import OOP.gAssociation.Domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Pele");
        Player player2 = new Player("Romario");
        Player player3 = new Player("Ronaldinho Gaucho");

        Player[] players = {player1, player2, player3};
        for (Player player : players) {
            player.print();
        }


    }
}
