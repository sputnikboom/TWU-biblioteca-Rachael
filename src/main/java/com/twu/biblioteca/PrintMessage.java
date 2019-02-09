package com.twu.biblioteca;

import java.io.PrintStream;

public class PrintMessage {
    PrintStream printStream = System.out;

    public PrintMessage() {
    }

    public PrintMessage(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void print(String string) {
        printStream.println(string);
    }
}
