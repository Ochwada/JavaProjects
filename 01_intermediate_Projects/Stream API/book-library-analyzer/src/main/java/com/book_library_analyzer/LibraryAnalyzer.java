package com.book_library_analyzer;


import java.util.*;
import java.util.stream.Collectors;

/**
 * *******************************************************
 * Package: com.book_library_analyzer
 * File: LibraryAnalyzer.java
 * Author: Ochwada
 * Date: Monday, 16.Jun.2025, 10:17 AM
 * Description: Contains methods that demonstrate intermediate and terminal steam operations.
 * * Analyzes book data using Stream API features: flatmap, collectors and a custom collector.
 * Objective: Class with only methods (service class)
 * *******************************************************
 */


public class LibraryAnalyzer {

    /**
     * Retrieves a flat list of all books from a list of authors.
     * <p>
     * This method processes the provided list of authors, extracts the list of books
     * from each author, flattens them into a single stream, and collects all books
     * into a single list.
     *
     * @param authors the list of Author objects, each containing their own list of books
     * @return a 'list' containing all books from all authors
     */
    public List<Book> getAllBooks(List<Author> authors) {

        return authors.stream()
                .flatMap(
                        author -> author.getBooks().stream())
                //.collect(Collectors.toList());
                .toList();
    }

    /**
     * Groups the given list of books by their genre and counts the number of books in each genre.
     * <p>
     * This method processes the provided list of books, groups them by genre, and calculates
     * how many books belong to each genre using a stream and collectors.
     *
     * @param books the list of Book objects to be grouped and counted
     * @return a map where the key is the genre, and the value is the count of books in that genre
     */
    // Book::getGenre - "For a given Book object, call its getGenre() method."
    public Map<String, Long> countBooksByGenre(List<Book> books) {
        return books.stream()
                .collect(
                        Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.counting()
                        )
                );
    }


    /**
     * Calculates the average rating of books for each genre.
     * <p>
     * This method processes the provided list of books, groups them by genre,
     * and computes the average rating for each genre using streams and collectors.
     *
     * @param books the list of Book objects to be processed
     * @return a map where the key is the genre, and the value is the average rating of books in that genre
     */
    public Map<String, Double> averageRatingByGenre(List<Book> books) {
        return books.stream()
                .collect(
                        Collectors.groupingBy(
                                Book::getGenre, // groups books by genre.
                                Collectors.averagingDouble(Book::getRating) // calculates average rating for each group.
                        )
                );
    }

    /**
     * Uses a custom collector to summarize genre statistics.
     *
     * <p>This method processes a list of {@link Book} objects and collects statistics
     * (such as total count and average rating) for each genre using the {@link GenreSummaryCollector}.
     *
     * @param books the list of {@link Book} objects to summarize
     * @return a map where the key is the genre name and the value is the {@link GenreSummary} containing count and total rating
     */

    public Map<String, GenreSummary> summarizeGenres(List<Book> books) {
        return books.stream()
                .collect(new GenreSummaryCollector());
    }

}
