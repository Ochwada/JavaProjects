package com.example.data;


import com.example.model.*;

import java.time.LocalDateTime;
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
     * Generates a sample list of events for testing and demonstration purposes.
     * <p>
     * Each event includes realistic data such as:
     * <ul>
     *     <li>Title and description</li>
     *     <li>Start and end date/time</li>
     *     <li>Category (Workshop, Conference, Meetup, Seminar)</li>
     *     <li>Physical location represented by {@link Address}</li>
     * </ul>
     * <p>
     * This dummy data can be used for practicing Java Streams operations such as filtering,
     * grouping by category, sorting by date, and aggregating locations.
     *
     * @return a list of sample {@link Event} instances with diverse data.
     */
    public static List<Event> getSampleEvents() {
        // Addresses
        Address berlin = new Address("Hauptstr.", "11", "10115", "Berlin", "Germany");
        Address munich = new Address("Marienplatz", "1", "80331", "Munich", "Germany");
        Address hamburg = new Address("Reeperbahn", "22", "20359", "Hamburg", "Germany");
        Address cologne = new Address("Domplatz", "3", "50667", "Cologne", "Germany");


        return List.of(
                new Event(
                        "Java Streams Workshop",
                        "Deep dive into Java Streams API.",
                        LocalDateTime.of(2025, 7, 10, 10, 0),
                        LocalDateTime.of(2025, 7, 10, 17, 0),
                        "Workshop",
                        berlin

                ),
                new Event(
                        "Spring Boot Conference",
                        "Microservices and Spring Boot best practices.",
                        LocalDateTime.of(2025, 8, 12, 9, 30),
                        LocalDateTime.of(2025, 8, 12, 18, 0),
                        "Conference",
                        munich
                ),
                new Event(
                        "Data Science Meetup",
                        "AI, Machine Learning, and Big Data trends.",
                        LocalDateTime.of(2025, 9, 5, 14, 0),
                        LocalDateTime.of(2025, 9, 5, 20, 0),
                        "Meetup",
                        hamburg
                ),
                new Event(
                        "Cloud Computing Seminar",
                        "Modern cloud architectures.",
                        LocalDateTime.of(2025, 10, 3, 10, 0),
                        LocalDateTime.of(2025, 10, 3, 15, 30),
                        "Seminar",
                        cologne
                )
        );
    }

    /**
     * Generates a sample list of authors, each with associated books and pages.
     * <p>
     * This dummy data includes 3 well-known authors: George Orwell, J.K. Rowling, and Stephen King.
     * Each author has two books assigned, and each book contains a list of sample pages.
     * <p>
     * This method is primarily used for testing and demonstrating multi-level stream operations
     * (e.g., using flatMap to extract books and pages from authors).
     *
     * @return a list of sample {@link Author} instances, each populated with books and pages.
     */
    public static List<Author> getSampleAuthors() {

        // Authors (without books yet)
        Author orwell = new Author("George Orwell", List.of());
        Author rowling = new Author("J.K. Rowling", List.of());
        Author king = new Author("Stephen King", List.of());


        // Books linked to authors
        // --- orwell
        Book book1 = new Book("1984", orwell, "Dystopian", 4.8,
                List.of(
                        "1984 - Page 1 - Table of Content",
                        "1984 - Page 2",
                        "1984 - Page 3"
                ));

        Book book2 = new Book("Animal Farm", orwell, "Political Satire", 4.6,
                List.of(
                        "Animal Farm - Page 1",
                        "Animal Farm - Page 2",
                        "Animal Farm - Page 3"
                ));

        // --- rowling
        Book book3 = new Book("Harry Potter and the Sorcerer's Stone", rowling, "Fantasy", 4.9,
                List.of(
                        "HP1 - Page 1",
                        "HP1 - Page 2",
                        "HP1 - Page 3"
                ));

        Book book4 = new Book("Harry Potter and the Chamber of Secrets", rowling, "Fantasy", 4.8,
                List.of(
                        "HP2 - Page 1",
                        "HP2 - Page 2",
                        "HP2 - Page 3"
                ));

        // --- king
        Book book5 = new Book("The Shining", king, "Horror", 4.7,
                List.of(
                        "Shining - Page 1",
                        "Shining - Page 2",
                        "Shining - Page 3"
                ));

        Book book6 = new Book("IT", king, "Horror", 4.5,
                List.of(
                        "IT - Page 1",
                        "IT - Page 2",
                        "IT - Page 3"
                ));


        // Attach books directly WHILE constructing authors
        orwell = new Author(orwell.getNames(), List.of(book1, book2));
        rowling = new Author(rowling.getNames(), List.of(book3, book4));
        king = new Author(king.getNames(), List.of(book5, book6));

        return List.of(orwell, rowling, king);
    }


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
