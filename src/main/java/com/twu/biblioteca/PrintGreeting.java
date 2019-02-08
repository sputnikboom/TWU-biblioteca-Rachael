package com.twu.biblioteca;

import java.io.PrintStream;

public class PrintGreeting extends PrintMessage {

    private String greeting = "Welcome to Biblioteca! Your one-stop shop for great book titles in Bangalore!";

    public PrintGreeting() {};
    public PrintGreeting(PrintStream printStream) {
        super(printStream);
    }

    public void greet() {
        print(this.greeting);
    }
}
