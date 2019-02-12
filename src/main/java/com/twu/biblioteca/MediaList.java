package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class MediaList {
    private PrintMessage printMessage;

    public MediaList() {

    }

    public MediaList(PrintStream printStream) {
        printMessage = new PrintMessage(printStream);
    }

    public void printMedia(String title) {
        PrintMessage.print(title);
    }

    public void listBooks(String[] books) {
        for (String book : books) {
            printMedia(book);
        }
    }

    public void listBooks(ArrayList<Book> books) {
        for (Book book : books) {
            if(!book.getOnLoan()) {
                String formattedItem = book.format(book);
                PrintMessage.print(formattedItem);
            }
        }
    }

    public void listMovies(ArrayList<Movie> movies) {
        for (Movie movie : movies) {
            if(!movie.getOnLoan()) {
                String formattedItem = movie.format(movie);
                PrintMessage.print(formattedItem);
            }
        }
    }
}
