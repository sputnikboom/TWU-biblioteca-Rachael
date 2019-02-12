package com.twu.biblioteca;

public class Movie {

        private String title;
        private String director;
        private String year;
        private boolean onLoan = false;
        private int movieId;
        private int rating;

        public Movie(String title, String director, String year, int movieId, int rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.movieId = movieId;
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }
        public String getDirector() {
            return director;
        }
        public String getYear() {
            return year;
        }
        public int getMovieId() {
            return movieId;
        }
        public boolean getOnLoan() {
            return onLoan;
        }

        public void setOnLoan() {
            this.onLoan = !this.onLoan;
        }

        public String format(Movie movie) {
            String movieString = "|";
            movieString += (padString(Integer.toString(movie.movieId), 5) + "|");
            movieString += (padString(movie.title, 15) + "|");
            movieString += (padString(movie.director, 15) + "|");
            movieString += (padString(movie.year, 5) + "|");
            movieString += (padString(Integer.toString(movie.rating), 5) + "|");
            return movieString;
        }

        public String padString(String string, int stringLength) {
            return String.format("%-" + stringLength + "s", string);
        }
    }

