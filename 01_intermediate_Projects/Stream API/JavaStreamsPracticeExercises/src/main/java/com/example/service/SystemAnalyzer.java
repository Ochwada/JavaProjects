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

}
