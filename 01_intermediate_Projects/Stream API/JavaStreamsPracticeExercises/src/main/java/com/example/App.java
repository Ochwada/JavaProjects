package com.example;

import com.example.data.*;
import com.example.model.*;
import com.example.service.*;


import java.util.*;

/**
 * Entry point for the application.
 * Demo Class
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n\uD83D\uDC83 === Java Streams Practice Day! === \uD83D\uDC83");

        // ------------------------------------------------
        //   Exercise 8: Build Shopping Summary Collector
        // ------------------------------------------------
        List<Item> items = DummyData.getSampleItems();
        ShoppingSummaryCollector.ShoppingSummary shoppingSummary = items.stream()
                .collect(new ShoppingSummaryCollector());
        System.out.println(shoppingSummary);
        System.out.println();
        // ------------------------------------------------
        //   Exercise 7: Group Events by Day of Week
        // ------------------------------------------------
        List<Event> events = DummyData.getSampleEvents();
        Map<String, List<String>> groupEvents = SystemAnalyzer.groupEventByDayOfWeek(events);

        groupEvents.forEach((day, eventsList) ->{
            System.out.printf("Day: %s  | Events: %s%n", day, eventsList);
        });
        System.out.println();
        // ------------------------------------------------
        //  Exercise 6: Flatten Author → Books → Pages
        // ------------------------------------------------
        List<Author> authors = DummyData.getSampleAuthors();
        List<String> allPages = SystemAnalyzer.getAllPage(authors);
        allPages.forEach(System.out::println);
        System.out.println();
        // ------------------------------------------------
        // Exercise 5: Custom Collector - Sentence Stats
        // ------------------------------------------------
        List<String> sentences = DummyData.getSampleSentences();
        SentenceStats.Sentence result = sentences.stream()
                .collect(new SentenceStats());
        System.out.println(result);

        // ------------------------------------------------
        // Exercise 4: Average Rating by Genre
        // ------------------------------------------------
        System.out.println();
        List<Movie> movies = DummyData.getSampleMovies();
        Map<String, Double> averageRating = SystemAnalyzer.averageRatingByGenre(movies);
        averageRating.forEach((genre, rating) -> {
            System.out.printf(
                    "Genre: %s | Average Rating: %.2f%n", genre, rating
            );
        });


        // ------------------------------------------------
        // Exercise 3: Count Items by Status
        // ------------------------------------------------
        List<Task> tasks = DummyData.getSampleTask();
        Map<Status, Long> groupedTasks = SystemAnalyzer.countItemsByStatus(tasks);
        System.out.println("\nGrouped Tasks: " + groupedTasks);


        // ------------------------------------------------
        // Exercise 2: Group Products by Category
        // ------------------------------------------------
        List<Product> products = DummyData.getSampleProducts();
        Map<String, Long> grouped = SystemAnalyzer.groupProductsByCategory(products);
        Map<String, List<Product>> grouped2 = SystemAnalyzer.groupProductsByCategoryListProducts(products);
        Map<String, List<String>> groupedMapping = SystemAnalyzer.groupProductsByCategoryAndMap(products);
        System.out.println("\nGroup products: " + grouped);
        System.out.println("Group2 products: " + grouped2);
        System.out.println("\nGroup & Mapped products: " + groupedMapping);


        // ------------------------------------------------
        // Exercise 1: Flatten Sentences into Words
        // ------------------------------------------------
        List<String> sentence = List.of("Java is fun", "Streams are powerful");
        List<String> words = SystemAnalyzer.flattenSentences(sentence);
        System.out.println("\nFlattened Sentence: " + words);

        // ------------------------------------------------


    }
}
