package com.twu.biblioteca;

import java.io.PrintStream;

public class BookList extends PrintMessage {

    public BookList() {
    }

    public BookList(PrintStream printStream) {
        super(printStream);
    }

    public void printBook(String title) {
        print(title);
    }

    public void listBooks(String[] books) {
        for (String book : books) {
            printBook(book);
        }
    }
}
