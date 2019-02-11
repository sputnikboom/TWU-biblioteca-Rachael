package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class BibliotecaApp extends PrintMessage {

    private static ArrayList<Book> books = new ArrayList<Book>();
    private static PrintGreeting printGreeting = new PrintGreeting();
    private static PrintStream printStream = System.out;
    private static InputStream inputStream = System.in;
    private static UserInput userInput = new UserInput(inputStream);
    private static Menu menu = new Menu(printStream, userInput, books, inputStream);


    public static void main(String[] args) {
        books.add(new Book("the book of books", "mr book", "1969", 1));
        books.add(new Book("another book", "ms book", "2010", 2));

        printGreeting.greet();

        menu.printMenu();
        char inputChar = userInput.charInput();
        menu.menuSelector(inputChar);

    }
}
