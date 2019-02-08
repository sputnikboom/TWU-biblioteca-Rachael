package com.twu.biblioteca;
import org.junit.Test;
import java.io.PrintStream;
import static org.mockito.Mockito.*;

public class PrintGreetingTest {
    @Test
    public void shouldPrintGreeting() {
        PrintStream mockPrintStream = mock(PrintStream.class);
        PrintGreeting printGreeting = new PrintGreeting(mockPrintStream);

        printGreeting.greet();

        verify(mockPrintStream).println("Welcome to Biblioteca! Your one-stop shop for great book titles in Bangalore!");
    }
}
