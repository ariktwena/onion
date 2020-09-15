package app;

import domian.Player;
import protocal.TUI;

public class Process implements Runnable{

    private final PlayerInterfaceContract playerInterfaceContract;
    private final Player player;
    private final TUI tui;

    public Process(Player player, TUI tui) {
        this.playerInterfaceContract = new PlayerInterfaceContract();
        this.player = player;
        this.tui = tui;
    }

    @Override
    public void run() {
        playerInterfaceContract.addPlayer(player);

        tui.printPlayerName(playerInterfaceContract.listPlayerNames());
    }
}
