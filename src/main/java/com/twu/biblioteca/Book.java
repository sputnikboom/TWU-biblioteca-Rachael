package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String pubYear;

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
}
