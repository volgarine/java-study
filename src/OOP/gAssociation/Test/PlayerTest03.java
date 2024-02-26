package OOP.gAssociation.Test;

import OOP.gAssociation.Domain.Player;
import OOP.gAssociation.Domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player01 = new Player("Marcos");
        Player player02 = new Player("Cafu");
        Player player03 = new Player("Roberto Carlos");
        Team team = new Team("Brasil");
        Player[] players = {player01, player02, player03};

        player01.setTeam(team);
        player02.setTeam(team);
        player03.setTeam(team);
        team.setPlayers(players);

        System.out.println("***** PLAYERS *****");
        player01.print();
        System.out.println("---------------------");

        System.out.println("***** TEAM *****");
        team.print();
        System.out.println("---------------------");
    }
}
