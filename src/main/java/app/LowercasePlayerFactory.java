package app;

import domian.Player;

public class LowercasePlayerFactory extends PlayerFactory{
    @Override
    public Player readPlayerFromLine(String input) {
        return super.readPlayerFromLine(input.toLowerCase());
    }
}
