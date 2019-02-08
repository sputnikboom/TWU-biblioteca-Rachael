package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class BibliotecaApp {

    private static ArrayList<Book> books = new ArrayList<Book>();
    private static Menu menu = new Menu();
    private static PrintGreeting printGreeting = new PrintGreeting();
    private static PrintStream printStream = System.out;

    public static void main(String[] args) {

        printGreeting.greet();

        menu.printMenu(printStream);

//        BookList bookList = new BookList();
//        books.add(new Book("the book of books", "mr book", "1969"));
//        books.add(new Book("another book", "ms book", "2010"));
//        bookList.listBooks(books);
    }
}
