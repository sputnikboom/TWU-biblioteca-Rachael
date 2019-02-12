package com.twu.biblioteca;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


public class MenuTest {

    @Test
    public void shouldPrintMenu() {
        PrintStream mockPrintStream = mock(PrintStream.class);
        Menu menu = new Menu(mockPrintStream);
        menu.printMenu();
        verify(mockPrintStream, times(8)).println(any(String.class));
    }

//    @Test
//    public void shouldChangeSelection() {
//        char userInput = '0';
//        ArrayList<Book> books = new ArrayList<Book>();
//        books.add(new Book("book title", "book author", "2000", 1));
//        Menu menu = mock(Menu.class);
//        when(menu.menuInput()).thenReturn('2');
//
//        menu.menuSelector(userInput);
//        assertThat(books, (Matcher<? super ArrayList<Book>>) new Book("book title", "book author", "pubYear", 1));
//    }
//
//    @Test
//    public void shouldPrintExitMessage() {
//        char userInput = '0';
//        ArrayList<Book> books = new ArrayList<Book>();
//        books.add(new Book("book title", "book author", "2000", 1));
//        Menu menu = mock(Menu.class);
//        when(menu.menuInput()).thenReturn('0');
//
//        menu.menuSelector(userInput);
//    }
}