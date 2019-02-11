package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends PrintMessage {

    private static InputStream inputStream;

    public static ArrayList<Book> books;
    public static char menuSelection;

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

    public static void menuInput() {
        Scanner menu = new Scanner(inputStream);

        menuSelection = menu.next().charAt(0);

        menuSelector(menuSelection);
    }

    public static void menuSelector(char selection) {
        BookLoan bookLoan = new BookLoan(books);
        switch (selection) {
            case('0'):
                PrintMessage.print("Goodbye!");
                System.exit(0);
                break;
            case('1'):
                BookList bookList = new BookList();
                bookList.listBooks(books);
                menuInput();
                break;
            case('2'):
                bookLoan.loanMenu();
                break;
            case('3'):
                bookLoan.returnMenu();
                break;
            default:
                print("Please select a valid option");
                menuInput();
        }
    }

    //TODO: replace breaks with string formatter -> extract into utils??
    public static void printMenu() {
        print("-------------------------------------------------");
        print("Please Select An Option:");
        print("0. Exit Programme");
        print("1. View All Books");
        print("2. Checkout Book");
        print("3. Return Book");
        print("------------------------------------------------");
        menuInput();
    }


}
