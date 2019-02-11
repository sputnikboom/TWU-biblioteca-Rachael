package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class BookLoan {
    public char bookSelection;
    public ArrayList<Book> books;

    public BookLoan(ArrayList<Book> books) {
        this.books = books;
    }

    public void loanMenu() {
        PrintMessage.print("Enter the book id you would like to check out:");
        Scanner userInput = new Scanner(System.in);
        bookSelection = userInput.next().charAt(0);
        checkoutBook(bookSelection);
    }

    public void checkoutBook(char bookChoice) {
        for (Book book : books) {
            char bookId = (char) (book.getBookId() + '0');
            if (bookChoice == bookId) {
                if (book.getOnLoan() == false) {
                    book.setOnLoan();
                    PrintMessage.print(checkoutMessage(true, book));
                    Menu.printMenu();
                }
            }
        }
    }

    public String checkoutMessage(boolean success, Book book) {
        String message = "";
        if (success == true) {
            message = "Thank you! Enjoy the book";
        }
        return message;
    };

}
