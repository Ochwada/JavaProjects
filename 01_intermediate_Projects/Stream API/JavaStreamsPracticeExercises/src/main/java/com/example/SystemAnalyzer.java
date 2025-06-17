package com.example;


import java.util.*;
import java.util.stream.Collector;
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

}
