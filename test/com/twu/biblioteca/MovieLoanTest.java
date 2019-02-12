package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MovieLoanTest {

    @Test
    public void shouldCheckoutMovie() {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        Movie movie = new Movie ("title", "author", "year", 1, 5);
        movies.add(movie);

        MovieLoan movieLoan = new MovieLoan(movies);

        movieLoan.checkoutMovie('1');
        assertTrue(movie.getOnLoan());
    }

}