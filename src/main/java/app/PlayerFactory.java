package app;

import domian.Player;

import java.util.Scanner;

public class PlayerFactory {

    public PlayerFactory() {

    }

    public Player readPlayerFromLine(String input){

        Player player = new Player(input);

        return player;
    }

}
