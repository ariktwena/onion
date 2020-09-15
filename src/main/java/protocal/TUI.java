package protocal;

import java.io.PrintWriter;
import java.util.Scanner;

public class TUI {

    private final Scanner scanner;
    private final PrintWriter writer;


    public TUI(Scanner scanner, PrintWriter writer) {
        this.scanner = scanner;
        this.writer = writer;
    }

    public void inputField(){
        writer.print("Write you name > ");
        writer.flush();
    }

    public void printPlayerName(String name){
        writer.println(name);
        writer.flush();
    }
}
