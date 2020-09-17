package protocal;

import app.TUIinterface;

import java.io.PrintWriter;
import java.util.Scanner;

public class TUIinterfaceContract implements TUIinterface {

    private final Scanner scanner;
    private final PrintWriter writer;


    public TUIinterfaceContract(Scanner scanner, PrintWriter writer) {
        this.scanner = scanner;
        this.writer = writer;
    }

    @Override
    public void inputField(){
        writer.print("Write you name > ");
        writer.flush();
    }

    @Override
    public void printPlayerName(String name){
        writer.println(name);
        writer.flush();
    }
}
