package com.book_library_analyzer;


import java.util.List;

/**
 * *******************************************************
 * Package: com.book_library_analyzer
 * File: Author.java
 * Author: Ochwada
 * Date: Monday, 16.Jun.2025, 9:45 AM
 * Description:  It represents an author in the Book Library System
 * Objective: Domain object class (Author)
 * *******************************************************
 */

public class Author {

    private final String name;
    private final List<Book> books;

    /**
     * Constructs an Author object with the given list of books and author name.
     *
     * @param books the list of Book objects written by the author.
     * @param name  the name of the author.
     */
    public Author(List<Book> books, String name) {
        this.books = books;
        this.name = name;
    }

    // Setter
    /**
     * Returns the author's name.
     *
     * @return the author's name.
     */
    public String getName() {
        return name;
    }


    /**
     * Returns the list of books written by the author.
     *
     * @return the list of books.
     */
    public List<Book> getBooks() {
        return books;
    }

}
