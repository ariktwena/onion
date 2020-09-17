package app;

import domian.Player;
import domian.PlayerInterface;
import protocal.TUIinterfaceContract;

public class Process implements Runnable{

    private final PlayerInterface playerInterface;
    private final Player player;
    private final TUIinterface TUIinterfaceContract;

    public Process(Player player, TUIinterface TUIinterfaceContract) {
        this.playerInterface = new PlayerInterfaceContract();
        this.player = player;
        this.TUIinterfaceContract = TUIinterfaceContract;
    }

    @Override
    public void run() {
        playerInterface.addPlayer(player);

        TUIinterfaceContract.printPlayerName(playerInterface.listPlayerNames());
    }
}
