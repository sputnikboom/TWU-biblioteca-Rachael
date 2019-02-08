package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String pubYear;
    private int stringLength = 20;

    public Book(String title, String author, String pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPubYear() {
        return pubYear;
    }

    public String formatBook(Book book) {
        String bookDetails = "|";
        bookDetails += (padString(book.getTitle()) + "|");
        bookDetails += (padString(book.getAuthor()) + "|");
        bookDetails += (padString(book.getPubYear()) + "|");
        return bookDetails;
    }

    public String padString(String string) {
        return String.format("%-" + stringLength + "s", string);
    }
}
