package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String pubYear;
    private boolean onLoan = false;
    private int bookId;

    public Book(String title, String author, String pubYear, int bookId) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.bookId = bookId;
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
    public int getBookId() {
        return bookId;
    }
    public boolean getOnLoan() {
        return onLoan;
    }

    public void setOnLoan() {
        this.onLoan = !this.onLoan;
    }

    public String formatBook(Book book) {
        String bookDetails = "|";
        bookDetails += (padString(Integer.toString(book.bookId), 5) + "|");
        bookDetails += (padString(book.title, 20) + "|");
        bookDetails += (padString(book.author, 20) + "|");
        bookDetails += (padString(book.pubYear, 5) + "|");
        return bookDetails;
    }

    public String padString(String string, int stringLength) {
        return String.format("%-" + stringLength + "s", string);
    }
}
