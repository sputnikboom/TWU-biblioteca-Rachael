package com.twu.biblioteca;

import org.junit.Test;
import java.io.PrintStream;
import static org.mockito.Mockito.*;

public class PrintMessageTest {

    @Test
    public void shouldPrintMessage() {
        PrintStream mockPrintStream = mock(PrintStream.class);
        PrintMessage printMessage = new PrintMessage(mockPrintStream);

        printMessage.print("Hello World");

        verify(mockPrintStream).println("Hello World");
    }
}
