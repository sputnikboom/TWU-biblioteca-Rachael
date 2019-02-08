package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.Scanner;

public class Menu {
    private PrintStream printStream;

    public Menu() {
    }

    public Menu(PrintStream printStream) {
        this.printStream = printStream;
    }

    public int menuSelector() {
        int selection;
        Scanner menu = new Scanner(System.in);

        printMenu(printStream);

        selection = menu.nextInt();

        return selection;
    }

    //TODO: replace breaks with string formatter -> extract into utils??
    public void printMenu(PrintStream printStream) {
        PrintMessage printMessage = new PrintMessage(printStream);
        printMessage.print("-------------------------------------------------");
        printMessage.print("Please Select An Option:");
        printMessage.print("1. View All Books");
        printMessage.print("------------------------------------------------");
    }


}
