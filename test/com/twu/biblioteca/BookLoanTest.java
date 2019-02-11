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
        bookLoan.checkoutBook('1');

        assertTrue(book.getOnLoan());
    }

}