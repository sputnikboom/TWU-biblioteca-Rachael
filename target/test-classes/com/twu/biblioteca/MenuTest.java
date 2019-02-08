package com.twu.biblioteca;

import org.junit.Test;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class MenuTest {

    @Test
    public void shouldPrintMenu() {
        PrintStream mockPrintStream = mock(PrintStream.class);
        Menu menu = new Menu();

        menu.printMenu(mockPrintStream);

        verify(mockPrintStream).println("------------------------------------------------");
    }

    @Test
    public void shouldChangeSelector() {

    }
}