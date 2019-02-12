package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class MenuTest {

    @Test
    public void shouldPrintMenu() {
        PrintStream mockPrintStream = mock(PrintStream.class);
        Menu menu = new Menu(mockPrintStream);
        menu.printMenu();
        verify(mockPrintStream, times(10)).println(any(String.class));
    }

}