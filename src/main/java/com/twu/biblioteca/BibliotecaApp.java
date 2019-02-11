package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class BibliotecaApp {

    private static ArrayList<Book> books = new ArrayList<Book>();
    private static PrintGreeting printGreeting = new PrintGreeting();
    private static PrintStream printStream = System.out;
    private static InputStream inputStream = System.in;
    private static Menu menu = new Menu(printStream, inputStream, books);

    public static void main(String[] args) {
        books.add(new Book("the book of books", "mr book", "1969", 1));
        books.add(new Book("another book", "ms book", "2010", 2));

        printGreeting.greet();

        menu.printMenu();
    }
}
