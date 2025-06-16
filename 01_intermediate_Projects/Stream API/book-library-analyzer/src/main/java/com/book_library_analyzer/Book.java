package com.book_library_analyzer;


/**
 * *******************************************************
 * Package: com.book_library_analyzer
 * File: Book.java
 * Author: Ochwada
 * Date: Monday, 16.Jun.2025, 9:51 AM
 * Description: It represents a book in the Book Library System
 * Objective: Domain object class (Book)
 * *******************************************************
 */


public class Book {

    private final String title;
    private final String genre;
    private final double rating;


    /**
     * Constructs a Book object with the specified title, genre, and rating.
     *
     * @param title  the title of the book
     * @param genre  the genre of the book
     * @param rating the rating of the book (e.g., from 0.0 to 5.0)
     */
    public Book(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    // Getters


    /**
     * Returns the book's title.
     *
     * @return the title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the book's genre.
     *
     * @return the genre.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Returns the book's rating.
     *
     * @return the rating.
     */
    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', genre='" + genre + "', rating=" + rating + "}";
    }
}
