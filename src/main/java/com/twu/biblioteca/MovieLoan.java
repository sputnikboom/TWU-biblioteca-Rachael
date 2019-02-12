package com.twu.biblioteca;

import java.io.InputStream;
import java.util.ArrayList;

public class MovieLoan {
    private ArrayList<Movie> movies;
    private UserInput userInput;

    public MovieLoan(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public MovieLoan(ArrayList<Movie> movies, InputStream inputStream) {
        this.movies = movies;
        this.userInput = new UserInput(inputStream);
    }

    public void loanMenu() {
        PrintMessage.print("Enter the movie id you would like to check out:");
        char movieSelection = userInput.charInput();
        checkoutMovie(movieSelection);
    }

    public void checkoutMovie(char movieChoice) {
        for (Movie movie : movies) {
            char movieId = (char) (movie.getMovieId() + '0');
            if (movieChoice == movieId) {
                if (!movie.getOnLoan()) {
                    movie.setOnLoan();
                    PrintMessage.print("Thank you, enjoy the movie!");
                }
            }
        }
    }

    public void launchMenu() {
        Menu.printMenu();
        char menuChoice = userInput.charInput();
        Menu.menuSelector(menuChoice);
    }
}
