package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldPadString() {
        Book book =  new Book("title", "author", "pubYear", 1);
        String titleString = book.padString(book.getTitle(), 20);
        assertEquals(20, titleString.length());
        assertEquals("title               ", titleString);
    }

    @Test
    public void shouldFormatBookDetails() {
        Book sampleBook = new Book("book title", "book author", "2000", 1);
        String bookDetails = sampleBook.formatBook(sampleBook);
        assertEquals(55, bookDetails.length());
    }

    @Test
    public void changesLoanStatusOfBook() {
        Book book = new Book ("title", "author", "2000", 1);
        book.setOnLoan();
        assertTrue(book.getOnLoan());
    }
}