package com.twu.biblioteca;

import java.io.InputStream;
import java.util.ArrayList;


public class BookLoan {
    private ArrayList<Book> books;
    private UserInput userInput;
    private User exampleUser = new User("123-1234", "password");
    public BookLoan(ArrayList<Book> books) {
        this.books = books;
    }

    public BookLoan(ArrayList<Book> books, InputStream inputStream) {
        this.books = books;
        this.userInput = new UserInput(inputStream);
    }

    public void loanMenu(User user) {
        PrintMessage.print("Enter the book id you would like to check out:");
        char bookSelection = userInput.charInput();
        checkoutBook(bookSelection, user);
    }

    public void returnMenu() {
        PrintMessage.print("Enter the book id you would like to return:");
        char bookSelection = userInput.charInput();
        returnBook(bookSelection);
    }

    public void checkoutBook(char bookChoice, User user) {
        boolean containsBook = false;
        for (Book book : books) {
            char bookId = (char) (book.getBookId() + '0');
            if (bookChoice == bookId) {
                containsBook = true;
                changeBookStatus(book, "checkout", user);
            } else {
                PrintMessage.print(checkoutMessage(false));
            }
        }
        if (!containsBook) {
            PrintMessage.print(returnMessage(false));
        }
        launchMenu();

    }

    public void returnBook(char bookChoice) {
        boolean containsBook = false;
        for (Book book : books) {
            char bookId = (char) (book.getBookId() + '0');
            if (bookChoice == bookId) {
                containsBook = true;
                changeBookStatus(book, "return", exampleUser);
            } else {
                PrintMessage.print(returnMessage(false));
            }
        }
        if (!containsBook) {
            PrintMessage.print(returnMessage(false));
        }
        launchMenu();
    }

    public String checkoutMessage(boolean success) {
        String message = (success == true) ? "Thank you! Enjoy the book" : "Sorry, that book is not available";
        return message;
    }

    public String returnMessage(boolean success) {
        String message = (success == true) ? "Thank you for returning the book" : "This is not a valid book to return";
        return message;
    }

    public void launchMenu() {
        Menu.printMenu();
        char menuChoice = userInput.charInput();
        Menu.menuSelector(menuChoice);
    }

    public void changeBookStatus(Book book, String loan, User user) {
        if (loan.equals("checkout")) {
            if (!book.getOnLoan()) {
                book.setOnLoan();
                book.setUserId(user.getLibraryNumber());
                PrintMessage.print(returnMessage(true));
            }
        } else if (loan.equals("return")) {
            if (book.getOnLoan()) {
                book.setOnLoan();
                book.setUserId(null);
                PrintMessage.print(checkoutMessage(true));
            }
        }
    }
}
