package com.twu.biblioteca;

import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LoanManagementTest {

    @Test
    public void shouldReturnCorrectMessageWhenOnLoan() {
        InputStream inputStream = System.in;
        ArrayList<Book> books = new ArrayList<Book>();
        User user = new User("123-1234", "password");
        Book book = new Book ("title", "author", "pubYear", 1);
        books.add(book);

        BookLoan bookLoan = new BookLoan(books);
        bookLoan.changeBookStatus(book, "checkout", user);

        LoanManagement loanManagement = new LoanManagement(inputStream, books);
        assertEquals(loanManagement.checkBookStatus('1'), "Book is currently on loan to user: 123-1234");
    }

    @Test
    public void shouldReturnCorrectMessageNotOnLoan() {
        InputStream inputStream = System.in;
        ArrayList<Book> books = new ArrayList<Book>();
        User user = new User("123-1234", "password");
        Book book = new Book ("title", "author", "pubYear", 1);
        books.add(book);

        BookLoan bookLoan = new BookLoan(books);
        bookLoan.changeBookStatus(book, "checkout", user);
        bookLoan.changeBookStatus(book, "return", user);

        LoanManagement loanManagement = new LoanManagement(inputStream, books);
        assertEquals(loanManagement.checkBookStatus('1'), "Either the book is not checked out, or an invalid Id was entered");
    }

}