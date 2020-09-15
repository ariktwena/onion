package app;

import protocal.TUI;

import java.io.PrintWriter;
import java.util.Scanner;

public class InputStream {

    private final PlayerFactory playerFactory;
    private final TUI tui;

    public InputStream(PlayerFactory playerFactory) {
        this.playerFactory = playerFactory;
        this.tui = new TUI(new Scanner(System.in), new PrintWriter(System.out));
    }

    public void inputStream(){

        Scanner scanner = new Scanner(System.in);

        tui.inputField();

        String input = scanner.nextLine();

        //Makes the player from the input
        //playerFactory.readPlayerFromLine(input);

        new Process(playerFactory.readPlayerFromLine(input), tui).run();



    }


    public static void main(String[] args) {

        new InputStream(new PlayerFactory()).inputStream();
        new InputStream(new LowercasePlayerFactory()).inputStream();
    }


}
