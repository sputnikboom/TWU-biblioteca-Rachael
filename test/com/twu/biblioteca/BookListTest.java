package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import static org.junit.Assert.*;

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
    public void shouldPrintSingleBookTitleInList() {
        String[] books = {"I'm one of many possible books"};

        PrintStream mockPrintStream = mock(PrintStream.class);
        BookList bookList = new BookList(mockPrintStream);

        bookList.listBooks(books);

        verify(mockPrintStream).println("I'm one of many possible books");
    }

    @Test
    public void shouldPrintMultipleBooksTitles() {
        String[] books = {"book 1", "book 2", "book 3"};

        PrintStream mockPrintStream = mock(PrintStream.class);
        BookList bookList = new BookList(mockPrintStream);

        bookList.listBooks(books);

        verify(mockPrintStream, times(books.length)).println(any(String.class));
    }

    @Test
    public void shouldPrintBookDetailsOnSingleLine() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("book title", "book author", "2000", 1));

        PrintStream mockPrintStream = mock(PrintStream.class);
        BookList bookList = new BookList(mockPrintStream);

        bookList.listBooks(books);

        verify(mockPrintStream).println("|0    |book title     |book author    |2000           |");
    }

    @Test
    public void shouldPrintMultipleBookDetails() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("book title", "book author", "2000", 1));
        books.add(new Book("book title 2", "not real", "1980", 2));

        PrintStream mockPrintStream = mock(PrintStream.class);
        BookList bookList = new BookList(mockPrintStream);

        bookList.listBooks(books);

        verify(mockPrintStream, times(books.size())).println(any(String.class));
    }

    @Test
    public void shouldOnlyListAvailableBooks() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("book 1", "author 1", "2000", 1));
    }

}
