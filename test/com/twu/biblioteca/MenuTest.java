package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

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

        verify(mockPrintStream).println("------------------------------------------------");
    }

//    @Test
//    public void shouldChangeSelection() {
//        char userInput = '1';
//        InputStream mockInputStream = mock(InputStream.class);
//        Menu menu = new Menu(mockInputStream);
//        assertEquals(userInput, menu.menuSelection);
//    }

//    @Test
//    public void shouldPrintMenuSelection() {
//        char userInput = '1';
//        PrintStream mockPrintStream = mock(PrintStream.class);
//        InputStream inputStream = System.in;
//        ArrayList<Book> books = new ArrayList<Book>();
//        books.add(new Book("title", "author", "pubYear"));
//
//        Menu menu = new Menu(mockPrintStream, inputStream, books);
//        menu.menuSelector(userInput);
//        verify(mockPrintStream).println("|title               |author              |pubYear                  |");
//    }

    @Test
    public void shouldAlertWhenInvalidOptionSelected() {
        char userInput = 'A';

    }

    @Test
    public void shouldExitProgramme() {

    }
}