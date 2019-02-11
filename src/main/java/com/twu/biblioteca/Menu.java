package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends PrintMessage{

    public static UserInput userInput;
    public static ArrayList<Book> books;
    public static InputStream inputStream;

    public Menu(PrintStream printStream) {
        this.printStream = printStream;
    }

    public Menu(PrintStream printStream, UserInput userInput, ArrayList<Book> books, InputStream inputStream) {
        super(printStream);
        this.userInput = userInput;
        this.books = books;
        this.inputStream = inputStream;
    }

    public static void menuSelector(char selection) {
        BookLoan bookLoan = new BookLoan(books, inputStream);
        switch (selection) {
            case('0'):
                print("Goodbye!");
                System.exit(0);
                break;
            case('1'):
                BookList bookList = new BookList();
                bookList.listBooks(books);
                menuSelector(userInput.charInput());
                break;
            case('2'):
                bookLoan.loanMenu();
                break;
            case('3'):
                bookLoan.returnMenu();
                break;
            default:
                print("Please select a valid option");
                menuSelector(userInput.charInput());
        }
    }

    public static void printMenu() {
        print("-------------------------------------------------");
        print("Please Select An Option:");
        print("0. Exit Programme");
        print("1. View All Books");
        print("2. Checkout Book");
        print("3. Return Book");
        print("------------------------------------------------");
    }
}
