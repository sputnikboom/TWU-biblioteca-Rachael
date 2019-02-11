package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BookLoanTest {

    @Test
    public void shouldCheckoutBook() {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book = new Book ("title", "author", "pubYear", 1);
        books.add(book);

        BookLoan bookLoan = new BookLoan(books);

        bookLoan.changeBookStatus(book, "checkout");
        assertTrue(book.getOnLoan());
    }

    @Test
    public void shouldNotChangeLoanStatusIfBookNotAvailable() {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book = new Book ("title", "author", "pubYear", 1);
        books.add(book);
        BookLoan bookLoan = new BookLoan(books);
        bookLoan.changeBookStatus(book, "checkout");
        bookLoan.changeBookStatus(book,"checkout");
        assertTrue(book.getOnLoan());
    }

    @Test
    public void shouldReturnCorrectCheckoutMessageMessage() {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book = new Book ("title", "author", "pubYear", 1);
        books.add(book);
        BookLoan bookLoan = new BookLoan(books);

        assertEquals("Thank you! Enjoy the book", bookLoan.checkoutMessage(true));
        assertEquals("Sorry, that book is not available", bookLoan.checkoutMessage(false));
    }

    @Test
    public void shouldReturnBook() {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book = new Book ("title", "author", "pubYear", 1);
        books.add(book);

        BookLoan bookLoan = new BookLoan(books);

        bookLoan.changeBookStatus(book, "checkout");
        bookLoan.changeBookStatus(book, "return");

        assertFalse(book.getOnLoan());
    }

    @Test
    public void shouldNotChangeLoanStatusIfBookAlreadyReturned() {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book = new Book ("title", "author", "pubYear", 1);
        books.add(book);
        BookLoan bookLoan = new BookLoan(books);
        bookLoan.changeBookStatus(book, "checkout");
        bookLoan.changeBookStatus(book, "return");
        bookLoan.changeBookStatus(book, "return");

        assertFalse(book.getOnLoan());
    }

    @Test
    public void shouldReturnCorrectReturnMessage() {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book = new Book ("title", "author", "pubYear", 1);
        books.add(book);
        BookLoan bookLoan = new BookLoan(books);

        assertEquals("Thank you for returning the book", bookLoan.returnMessage(true));
        assertEquals("This is not a valid book to return", bookLoan.returnMessage(false));
    }

}