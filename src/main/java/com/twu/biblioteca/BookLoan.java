package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class BookLoan {
    private char bookSelection;
    private ArrayList<Book> books;

    public BookLoan(ArrayList<Book> books) {
        this.books = books;
    }

    public void loanMenu() {
        PrintMessage.print("Enter the book id you would like to check out:");
        Scanner userInput = new Scanner(System.in);
        bookSelection = userInput.next().charAt(0);
        checkoutBook(bookSelection);
    }

    public void returnMenu() {
        PrintMessage.print("Enter the book id you would like to return:");
        Scanner userInput = new Scanner(System.in);
        bookSelection = userInput.next().charAt(0);
        returnBook(bookSelection);
    }

    public void checkoutBook(char bookChoice) {
        for (Book book : books) {
            char bookId = (char) (book.getBookId() + '0');
            if (bookChoice == bookId) {
                if (!book.getOnLoan()) {
                    book.setOnLoan();
                    PrintMessage.print(checkoutMessage(true));
                } else {
                    PrintMessage.print(checkoutMessage(false));
                }
            }
        }
    }

    public void returnBook(char bookChoice) {
        for (Book book : books) {
            char bookId = (char) (book.getBookId() + '0');
            if (bookChoice == bookId) {
                if (book.getOnLoan()) {
                    book.setOnLoan();
                    PrintMessage.print(returnMessage(true));
                } else {
                    PrintMessage.print(returnMessage(false));
                }
            } else {
                PrintMessage.print(returnMessage(false));
            }
        }
    }

    public String checkoutMessage(boolean success) {
        String message = (success == true) ? "Thank you! Enjoy the book" : "Sorry, that book is not available";
        return message;
    }

    public String returnMessage(boolean success) {
        String message = (success == true) ? "Thank you for returning the book" : "This is not a valid book to return";
        return message;
    }
}
