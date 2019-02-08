package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class BookListTest {

    @Test
    public void shouldPrintSingleBookTitle() {
        PrintStream mockPrintStream = mock(PrintStream.class);
        BookList bookList = new BookList(mockPrintStream);

        bookList.printBook("I am a book title");

        verify(mockPrintStream).println("I am a book title");
    }

    @Test
    public void shouldPrintSingleBookInList() {
        String[] books = {"I'm one of many possible books"};

        PrintStream mockPrintStream = mock(PrintStream.class);
        BookList bookList = new BookList(mockPrintStream);

        bookList.listBooks(books);

        verify(mockPrintStream).println("I'm one of many possible books");
    }

    @Test
    public void shouldPrintMultipleBooks() {
        String[] books = {"book 1", "book 2", "book 3"};

        PrintStream mockPrintStream = mock(PrintStream.class);
        BookList bookList = new BookList(mockPrintStream);

        bookList.listBooks(books);

        verify(mockPrintStream, times(3)).println(any(String.class));
    }


}
