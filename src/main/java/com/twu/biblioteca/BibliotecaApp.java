package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    private static ArrayList<Book> books = new ArrayList<Book>();

    public static void main(String[] args) {
        PrintGreeting printGreeting = new PrintGreeting();
        printGreeting.greet();

        BookList bookList = new BookList();
        books.add(new Book("the book of books", "mr book", "1969"));
        books.add(new Book("another book", "ms book", "2010"));
        bookList.listBooks(books);
    }
}
