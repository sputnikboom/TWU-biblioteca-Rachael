package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void shouldFormatMovieDetails() {
        Movie movie = new Movie("book title", "book author", "2000", 1, 5);
        String movieString = movie.format(movie);
        assertEquals(51, movieString.length());
    }

}