package com.example.model;


import com.example.service.IdGenerator;

import java.util.*;

/**
 * *******************************************************
 * Package: com.example.model
 * File: Authors.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 1:56 PM
 * Description: Represents an author who has written a list of books.
 *  * The {@code Author} class contains the author's unique identifier, name, and a list of books they have written.
 *  * This model allows stream processing across authors and their associated books.
 * Objective:
 * *******************************************************
 */


public class Author {

    // Fields
    private final String id;
    private final String names;
    private final List<Book> books;

    /**
     * Constructs a new {@code Author} with the given ID, name, and list of books.
     *
     * @param names the full name of the author
     * @param books the list of books written by the author
     */
    public Author(String names, List<Book> books) {
        this.id = IdGenerator.generateAuthorId();
        this.names = names;
        this.books = books;
    }

    public String getId() {
        return id;
    }

    public String getNames() {
        return names;
    }

    /**
     * Returns the list of books written by the author.
     *
     * @return list of {@link Book} objects
     */
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", names='" + names + '\'' +
                ", books=" + books +
                '}';
    }
}
