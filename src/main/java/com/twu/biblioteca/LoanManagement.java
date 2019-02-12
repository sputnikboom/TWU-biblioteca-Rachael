package com.twu.biblioteca;

import java.io.InputStream;
import java.util.ArrayList;

public class LoanManagement {
    private UserInput userInput;
    private ArrayList<Book> books;

    public LoanManagement(InputStream inputStream, ArrayList<Book> books){
        this.userInput = new UserInput(inputStream);
        this.books = books;
    }

    public void managementMenu() {
        PrintMessage.print("Enter the book Id you would like to check:");
        char bookSelection = userInput.charInput();
        String message = checkBookStatus(bookSelection);
        PrintMessage.print(message);
        Menu.launchMenu();
    }

    public String checkBookStatus(char bookSelection) {
        for (Book book : books) {
            char bookId = (char) (book.getBookId() + '0');
            if(bookId == bookSelection) {
                if (book.getOnLoan()) {
                    return ("Book is currently on loan to user: " + book.getUser());
                }
            }
        }
        return ("Either the book is not checked out, or an invalid Id was entered");
    }
}
