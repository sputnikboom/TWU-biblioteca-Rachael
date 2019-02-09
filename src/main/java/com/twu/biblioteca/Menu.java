package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private PrintStream printStream;
    private InputStream inputStream;

    public ArrayList<Book> books;
    public char menuSelection;

    public Menu() {
    }

    public Menu(PrintStream printStream){
        this.printStream = printStream;
    }


    public Menu(InputStream inputStream){
        this.inputStream = inputStream;
    }

    public Menu(PrintStream printStream, InputStream inputStream, ArrayList<Book> books) {
        this.printStream = printStream;
        this.inputStream = inputStream;
        this.books = books;
    }

    public void menuInput() {
        Scanner menu = new Scanner(inputStream);

        menuSelection = menu.next().charAt(0);

        menuSelector(menuSelection);
    }

    public void menuSelector(char selection) {
        switch (selection) {
            case('0'):
                System.exit(0);
                break;
            case ('1'):
                BookList bookList = new BookList();
                bookList.listBooks(books);
                break;
            default:
                PrintMessage printMessage = new PrintMessage();
                printMessage.print("Please select a valid option!");
                menuInput();
        }
    }

    //TODO: replace breaks with string formatter -> extract into utils??
    public void printMenu() {
        PrintMessage printMessage = new PrintMessage(printStream);
        printMessage.print("-------------------------------------------------");
        printMessage.print("Please Select An Option:");
        printMessage.print("0. Exit Programme");
        printMessage.print("1. View All Books");
        printMessage.print("------------------------------------------------");
        menuInput();
    }


}
