package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldPadString() {
        Book book =  new Book("title", "author", "pubYear");
        String titleString = book.padString(book.getTitle());
        assertEquals(20, titleString.length());
        assertEquals("title               ", titleString);
    }

    @Test
    public void shouldFormatBookDetails() {
        Book sampleBook = new Book("book title", "book author", "2000");

        String bookDetails = sampleBook.formatBook(sampleBook);

        assertEquals(64, bookDetails.length());
    }
}