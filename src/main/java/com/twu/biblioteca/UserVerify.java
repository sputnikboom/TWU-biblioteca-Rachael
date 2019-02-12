package com.twu.biblioteca;

import java.io.InputStream;
import java.util.ArrayList;

public class UserVerify {
    private ArrayList<User> users;
    private String libraryNumber = null;
    private String password = null;
    private User user = null;
    private InputStream inputStream;

    public UserVerify(ArrayList<User> users) {
        this.users = users;
    }

    public User logIn(UserInput userInput) {
        PrintMessage.print("Please enter your library number:");
        libraryNumber = userInput.stringInput();
        user = validUser(libraryNumber);

        if (validUser(libraryNumber) != null) {
            PrintMessage.print("Please enter your password");
            password = userInput.stringInput();
            if (validPassword(password, user)) {
                PrintMessage.print("Welcome!");
            } else {
                PrintMessage.print("Invalid Password");
            }
        }
        return user;
    }


    public User validUser(String string) {
        User validUser = null;
        for (User user : users) {
            if (user.getLibraryNumber().equals(string)) {
                validUser = user;
            }
        }
        return validUser;
    }

    public boolean validPassword(String string, User user) {
        boolean validPassword = false;
        if (user.getPassword().equals(string)) {
            validPassword = true;
        }
        return validPassword;
    }

}
