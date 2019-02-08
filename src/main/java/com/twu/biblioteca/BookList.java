package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

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

    public void listBooks(ArrayList<Book> books) {
        for (Book book : books) {
            String formattedBook = book.formatBook(book);
            print(formattedBook);
        }
    }
}
