package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        PrintGreeting printGreeting = new PrintGreeting();
        printGreeting.greet();

        BookList bookList = new BookList();
        String[] books = {"Book Title 1", "Book Title 2", "Book Title 3"};
        bookList.listBooks(books);
    }
}
