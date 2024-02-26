package OOP.gAssociation.Test;

import OOP.gAssociation.Domain.Player;
import OOP.gAssociation.Domain.Team;

// Association: unidirectional one-to-many

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        Team team = new Team("Barcelona");

        player1.setTeam(team);
        player1.print();

    }
}
