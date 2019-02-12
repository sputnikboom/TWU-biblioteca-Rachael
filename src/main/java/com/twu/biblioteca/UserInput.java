package com.twu.biblioteca;

import java.io.InputStream;
import java.util.Scanner;


public class UserInput {
    private final Scanner scanner;

    public UserInput(InputStream inputStream) {
        scanner =  new Scanner(inputStream);
    }

    public char charInput() {
        return scanner.next().charAt(0);
    }

    public String stringInput() {
        return scanner.nextLine();
    }
}
