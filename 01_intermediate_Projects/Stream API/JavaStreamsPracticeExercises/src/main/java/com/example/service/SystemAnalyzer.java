package com.example.service;


import com.example.model.*;


import java.util.*;
import java.util.stream.Collectors;

/**
 * *******************************************************
 * Package: com.example
 * File: ExerciseAnalyzer.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 9:57 AM
 * Description:  Provides analytics and aggregation methods
 * Objective:
 * *******************************************************
 */


public class SystemAnalyzer {


    // ------------------------------------------------
    //  Exercise 7: Group Events by Day of Week
    // ------------------------------------------------
    /**
     * Groups events by the day of the week based on their start date and time.
     * <p>
     * This method processes a list of {@link Event} objects, extracts the {@link java.time.DayOfWeek}
     * from each event's start date, and groups event names under the corresponding day.
     * <p>
     * The result is a map where:
     * <ul>
     *     <li>The key is the day of the week (e.g. "MONDAY", "TUESDAY") as a {@code String}.</li>
     *     <li>The value is a list of event names occurring on that day.</li>
     * </ul>
     * <p>
     * This is useful for reporting, scheduling analysis, and time-based filtering.
     *
     * @param events the list of {@link Event} objects to be grouped
     * @return a {@link Map} where keys are days of the week and values are lists of event names
     */
    public static Map<String, List<String>> groupEventByDayOfWeek(List<Event> events) {
        return events.stream()
                .collect(Collectors.groupingBy(
                        event -> event.getStartDateTime().getDayOfWeek().toString(),
                        Collectors.mapping(Event::getName, Collectors.toList())
                ));
    }

    // ------------------------------------------------
    //  Exercise 6: Flatten Author → Books → Pages
    // ------------------------------------------------

    /**
     * Extracts and flattens all pages from a list of authors into a single list of page contents.
     * <p>
     * Each author contains multiple books, and each book contains multiple pages.
     * This method uses a three-level {@code flatMap()} to traverse:
     * * Authors → Books → Pages
     * and collect all individual pages across all authors into one flat list.
     *
     * @param authors the list of authors, each containing books and pages
     * @return a flattened list containing all pages from all books by all authors
     */
    public static List<String> getAllPage(List<Author> authors) {
        return authors.stream() // level 1: authors
                .flatMap(author -> author.getBooks().stream()) // level 2: books
                .flatMap(book -> book.getPages().stream())  // level 3: pages
                .toList(); // collect all pages into list
    }

    // ------------------------------------------------
    // Exercise 4: Average Rating by Genre
    // ------------------------------------------------

    /**
     * Calculates the average movie rating for each genre.
     * <p>
     * This method groups movies by their genre and computes the average rating
     * for each genre using Java Streams and built-in collectors.
     *
     * @param movies the list of movies to process
     * @return a map where the key is the movie genre, and the value is the average rating for that genre
     */
    public static Map<String, Double> averageRatingByGenre(List<Movie> movies) {
        return movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.averagingDouble(Movie::getRating)
                ));

    }

    // ------------------------------------------------
    // Exercise 3: Count Items by Status
    // ------------------------------------------------

    /**
     * Counts the number of tasks for each status.
     * <p>
     * This method groups tasks based on their {@link Status} and counts how many tasks exist in each status.
     * The result is a map where the key is the {@link Status}, and the value is the count of tasks for that status.
     *
     * @param tasks the list of tasks to count
     * @return a map containing the count of tasks for each status
     */
    public static Map<Status, Long> countItemsByStatus(List<Task> tasks) {
        return tasks.stream()
                .collect(Collectors.groupingBy(
                        Task::getStatus,
                        Collectors.counting()));
    }
    // ------------------------------------------------
    // Exercise 2: Group Products by Category
    // ------------------------------------------------

    /**
     * Groups the given list of products by category and counts the number of products in each category.
     * <p>
     * This method uses Java Streams to group products based on their category and then
     * counts how many products belong to each category.
     *
     * @param products the list of products to group
     * @return a map where the key is the product category, and the value is the count of products in that category
     */
    public static Map<String, Long> groupProductsByCategory(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.counting()));
    }

    /**
     * Groups the given list of products by category and collects all the information about the product of each category.
     * <p>
     * This method uses Java Streams to group products based on their category.
     * Each category maps to a list containing all products that belong to that category.
     * <p>
     * // "Furniture" = [Product("Table", "Furniture", 200.0)]
     *
     * @param products the list of products to group
     * @return a map where the key is the product category, and the value is a list of products in that category
     */
    public static Map<String, List<Product>> groupProductsByCategoryListProducts(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }

    /**
     * Groups the given list of products by category and collects the product names for each category.
     * <p>
     * This method groups products based on their category and, instead of collecting entire Product objects,
     * maps each product to its name and collects those names into a list.
     * <p>
     * // "Furniture" = ["Table"]
     *
     * @param products the list of products to group
     * @return a map where the key is the product category, and the value is a list of product names in that category
     */
    public static Map<String, List<String>> groupProductsByCategoryAndMap(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.mapping(Product::getName, Collectors.toList())
                ));
    }

    // ------------------------------------------------
    // Exercise 1: Flatten Sentences into Words
    // ------------------------------------------------

    /**
     * Flattens a list of sentences into a list of individual words.
     * <p>
     * Given a list of strings where each string is a sentence, this method splits each sentence into words using space
     * (" ") as the delimiter and returns a flat list containing all the words.
     *
     * @param sentences the list of sentences to flatten
     * @return a list of individual words
     */
    public static List<String> flattenSentences(List<String> sentences) {
        return sentences.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .toList();
    }
}
