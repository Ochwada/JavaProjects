package com.example.model;


import com.example.service.IdGenerator;

import java.util.List;

/**
 * *******************************************************
 * Package: com.example.model
 * File: Book.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 1:56 PM
 * Description: Represents a book with various properties such as title, author, genre, publication year, rating, and page contents.
 * * The {@code Book} class models detailed information about a book including full page data.
 * *  This allows for advanced stream processing such as analyzing page content, total words, or chapter summaries.
 * Objective:
 * *******************************************************
 */


public class Book {

    // Fields
    private final String id;
    private final String title;
    private final Author author;
    private final String genre;
    private final double rating;
    private final List<String> pages;


    /**
     * Constructs a new {@code Book} object with the given details.
     * The book ID is automatically generated.
     *
     * @param title  the title of the book
     * @param author the author of the book
     * @param genre  the genre/category of the book
     * @param rating the average rating of the book
     * @param pages  the content of the book, represented as a list of pages
     */
    public Book(String title, Author author, String genre,
                double rating, List<String> pages) {

        this.id = IdGenerator.generateBookId();
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
        this.pages = pages;
    }

    // Getters here (for streams & processing)

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }



    public double getRating() {
        return rating;
    }


    /**
     * Returns the list of page contents.
     *
     * @return list of strings where each string represents one page
     */
    public List<String> getPages() {
        return pages;
    }

    /**
     * Returns a string representation of the book.
     *
     * @return a string describing the book details
     */
    @Override
    public String toString() {
        return "Book {" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", pages=" + pages +
                '}';
    }
}
