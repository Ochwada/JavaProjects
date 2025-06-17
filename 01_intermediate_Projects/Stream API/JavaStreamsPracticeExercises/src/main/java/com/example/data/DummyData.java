package com.example.data;


import com.example.model.*;

import java.util.*;

/**
 * *******************************************************
 * Package: com.example
 * File: DummyProducts.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 10:33 AM
 * Description: Utility class that provides sample product data for testing and demonstration purposes.
 * Objective:
 * *******************************************************
 */


public class DummyData {

    /**
     * Returns a sample list of sentences.
     * <p>
     * The sample data includes various example sentences to demonstrate stream processing
     * and custom collector functionality.
     *
     * @return a list of sample sentences
     */
    public static List<String> getSampleSentences() {
        return List.of(
                "Java is powerful",
                "Streams can be customized",
                "Collectors are flexible",
                "Custom collectors are advanced",
                "Functional programming is expressive",
                "Lambda expressions simplify code",
                "Parallel streams enable performance",
                "Collectors make aggregation easy",
                "Custom collectors require careful design",
                "Java Streams are great for data processing"
        );
    }

    /**
     * Returns a sample list of products.
     * <p>
     * The sample data includes products from various categories such as Electronics,
     * Furniture, Appliances, and Clothing, with different price values.
     *
     * @return a list of sample {@link Product} instances
     */
    public static List<Product> getSampleProducts() {
        return List.of(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Smartphone", "Electronics", 800.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Table", "Furniture", 300.0),
                new Product("Chair", "Furniture", 120.0),
                new Product("Sofa", "Furniture", 700.0),
                new Product("Refrigerator", "Appliances", 900.0),
                new Product("Microwave", "Appliances", 200.0),
                new Product("T-shirt", "Clothing", 25.0),
                new Product("Jeans", "Clothing", 50.0)
        );
    }

    /**
     * Returns a sample list of tasks.
     * <p>
     * The sample data includes tasks with different statuses.
     *
     * @return a list of sample {@link Task} instances
     */
    public static List<Task> getSampleTask() {
        return List.of(
                new Task("Write documentation", Status.PENDING),
                new Task("Implement feature A", Status.IN_PROGRESS),
                new Task("Fix bug #42", Status.IN_PROGRESS),
                new Task("Write unit tests", Status.PENDING),
                new Task("Deploy to production", Status.COMPLETED),
                new Task("Refactor code", Status.IN_PROGRESS),
                new Task("Review pull request", Status.COMPLETED),
                new Task("Prepare demo", Status.PENDING)
        );
    }

    /**
     * Returns a sample list of movies.
     *
     * @return a list of sample {@link Movie} instances
     */
    public static List<Movie> getSampleMovies() {
        return List.of(
                new Movie("Inception", "Science Fiction", 8.8),
                new Movie("The Matrix", "Science Fiction", 8.7),
                new Movie("Interstellar", "Science Fiction", 8.6),
                new Movie("The Godfather", "Crime", 9.2),
                new Movie("Pulp Fiction", "Crime", 8.9),
                new Movie("The Shawshank Redemption", "Drama", 9.3),
                new Movie("Forrest Gump", "Drama", 8.8),
                new Movie("Titanic", "Romance", 7.9),
                new Movie("The Notebook", "Romance", 7.8),
                new Movie("Avengers: Endgame", "Action", 8.4)
        );
    }

}
