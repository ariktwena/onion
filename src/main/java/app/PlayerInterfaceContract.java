package app;

import domian.Player;
import domian.PlayerInterface;

import java.util.ArrayList;

public class PlayerInterfaceContract implements PlayerInterface {

    private final ArrayList<Player> listOfPlayers;

    public PlayerInterfaceContract() {
        this.listOfPlayers = new ArrayList<>();
    }

    @Override
    public void addPlayer(Player player) {

        listOfPlayers.add(player);

    }

    @Override
    public String listPlayerNames() {

        for(Player player: listOfPlayers){
            return player.getName();
        }

        return null;

    }
}
