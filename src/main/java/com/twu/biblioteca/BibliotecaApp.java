package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class BibliotecaApp extends PrintMessage {

    private static ArrayList<Book> books = new ArrayList<Book>();
    private static ArrayList<Movie> movies = new ArrayList<Movie>();
    private static ArrayList<User> users = new ArrayList<User>();
    private static PrintGreeting printGreeting = new PrintGreeting();
    private static PrintStream printStream = System.out;
    private static InputStream inputStream = System.in;
    private static UserInput userInput = new UserInput(inputStream);
    private static Menu menu = new Menu(printStream, userInput, books, movies, inputStream, users);


    public static void main(String[] args) {
        books.add(new Book("the book of books", "mr book", "1969", 1));
        books.add(new Book("another book", "ms book", "2010", 2));

        movies.add(new Movie("good movie", "director", "1999", 1, 5));
        movies.add(new Movie("bad movie", "director 2", "2000", 2, 1));

        users.add(new User("123-1234", "password", "Mr User", "email@email.com", "111-111-1111"));
        users.add(new User("456-4567", "password", "Ms User", "email@otheremail.com", "222-222-2222"));

        printGreeting.greet();

        menu.printMenu();
        char inputChar = userInput.charInput();
        menu.menuSelector(inputChar);

    }
}
