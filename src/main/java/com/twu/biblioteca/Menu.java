package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends PrintMessage {

    public static UserInput userInput;
    public static ArrayList<Book> books;
    public static ArrayList<Movie> movies;
    public static InputStream inputStream;
    public static ArrayList<User> users;
    public static User user;

    public Menu(PrintStream printStream) {
        this.printStream = printStream;
    }

    public Menu(PrintStream printStream, UserInput userInput, ArrayList<Book> books, ArrayList<Movie> movies, InputStream inputStream, ArrayList<User> users) {
        super(printStream);
        this.userInput = userInput;
        this.books = books;
        this.movies = movies;
        this.inputStream = inputStream;
        this.users = users;
    }

    public static void menuSelector(char selection) {
        BookLoan bookLoan = new BookLoan(books, inputStream);
        MovieLoan movieLoan = new MovieLoan(movies, inputStream);
        UserVerify userVerify = new UserVerify(users);
        UserInput bookInput = new UserInput(inputStream);
        UserProfile userProfile = new UserProfile(user);

        switch (selection) {
            case ('0'):
                print("Goodbye!");
                System.exit(0);
                break;
            case ('1'):
                MediaList bookList = new MediaList();
                bookList.listBooks(books);
                menuSelector(userInput.charInput());
                break;
            case ('2'):
                if (user != null) {
                    bookLoan.loanMenu(user);
                } else {
                    user = userVerify.logIn(bookInput);
                    menuSelector(selection);
                }
                break;
            case ('3'):
                if (user != null) {
                    bookLoan.returnMenu();
                } else {
                    user = userVerify.logIn(bookInput);
                    menuSelector(selection);
                }
                break;
            case ('4'):
                MediaList movieList = new MediaList();
                movieList.listMovies(movies);
                menuSelector(userInput.charInput());
                break;
            case ('5'):
                movieLoan.loanMenu();
                break;
            case('6'):
                if (user != null) {
                    userProfile.printDetails();
                } else {
                    user = userVerify.logIn(bookInput);
                    menuSelector(selection);
                }
                break;
            case ('7'):
                LoanManagement loanManagement = new LoanManagement(inputStream, books);
                loanManagement.managementMenu();
                break;
            default:
                print("Please select a valid option");
                menuSelector(userInput.charInput());
        }
    }

    public static void printMenu() {
        print("-------------------------------------------------");
        print("Please Select An Option:");
        print("0. Exit Programme");
        print("1. View All Books");
        print("2. Checkout Book");
        print("3. Return Book");
        print("4. View all Movies");
        print("5. Checkout Movie");
        print("6. Check my details");
        print("--- LIBRARY USE ONLY ---");
        print("7. Check Book Loans");
        print("------------------------------------------------");
    }

    public static void launchMenu() {
        Menu.printMenu();
        char menuChoice = userInput.charInput();
        Menu.menuSelector(menuChoice);
    }
}
