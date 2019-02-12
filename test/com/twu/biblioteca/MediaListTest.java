package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class MediaListTest {

    @Test
    public void shouldPrintSingleBookTitle() {
        PrintStream mockPrintStream = mock(PrintStream.class);
        MediaList bookList = new MediaList(mockPrintStream);

        bookList.printMedia("I am a book title");

        verify(mockPrintStream).println("I am a book title");
    }

    @Test
    public void shouldPrintSingleBookInList() {
        String[] books = {"I'm one of many possible books"};

        PrintStream mockPrintStream = mock(PrintStream.class);
        MediaList bookList = new MediaList(mockPrintStream);

        bookList.listBooks(books);

        verify(mockPrintStream).println("I'm one of many possible books");
    }

    @Test
    public void shouldPrintMultipleBooksTitles() {
        String[] books = {"book 1", "book 2", "book 3"};

        PrintStream mockPrintStream = mock(PrintStream.class);
        MediaList bookList = new MediaList(mockPrintStream);

        bookList.listBooks(books);

        verify(mockPrintStream, times(books.length)).println(any(String.class));
    }

    @Test
    public void shouldPrintBookDetailsOnSingleLine() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("book title", "book author", "2000", 1));

        PrintStream mockPrintStream = mock(PrintStream.class);
        MediaList bookList = new MediaList(mockPrintStream);

        bookList.listBooks(books);

        verify(mockPrintStream).println("|1    |book title          |book author         |2000 |");
    }

    @Test
    public void shouldPrintMultipleBookDetails() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("book title", "book author", "2000", 1));
        books.add(new Book("book title 2", "not real", "1980", 2));

        PrintStream mockPrintStream = mock(PrintStream.class);
        MediaList bookList = new MediaList(mockPrintStream);

        bookList.listBooks(books);

        verify(mockPrintStream, times(books.size())).println(any(String.class));
    }

    @Test
    public void shouldPrintSingleMovie() {
        ArrayList<Movie> movie = new ArrayList<Movie>();
        movie.add(new Movie("title", "director", "2000", 1, 5));

        PrintStream mockPrintStream = mock(PrintStream.class);
        MediaList movieList = new MediaList(mockPrintStream);

        movieList.listMovies(movie);

        verify(mockPrintStream).println("|1    |title          |director       |2000 |5    |");
    }

    @Test
    public void shouldPrintMultipleMovies() {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("title", "director", "2000", 1, 5));
        movies.add(new Movie("title2", "director2", "2001", 2, 5));

        PrintStream mockPrintStream = mock(PrintStream.class);
        MediaList movieList = new MediaList(mockPrintStream);

        movieList.listMovies(movies);

        verify(mockPrintStream, times(movies.size())).println(any(String.class));
    }
}
