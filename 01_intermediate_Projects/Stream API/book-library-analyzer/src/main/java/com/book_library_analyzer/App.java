package com.book_library_analyzer;

/**
 * Demo Class
 *
 */
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Book Library Analyzer" );


        // Sample data setup
        List<Book> books = List.of(
                new Book("The Hobbit", "Fantasy", 4.8),
                new Book("The Fellowship of the Ring", "Fantasy", 4.9),
                new Book("The Two Towers", "Fantasy", 4.7),
                new Book("Clean Code", "Programming", 4.6),
                new Book("Effective Java", "Programming", 4.9),
                new Book("Refactoring", "Programming", 4.5),
                new Book("A Brief History of Time", "Science", 4.4),
                new Book("The Selfish Gene", "Science", 4.3)
        );

        // Use the GenreSummaryCollector
        Map<String, GenreSummary> genreSummaryMap = books.stream()
                .collect(new GenreSummaryCollector());

        // Print summary for each genre
        genreSummaryMap.forEach((genre, summary) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Count: " + summary.getCount());
            System.out.printf("Average Rating: %.2f%n", summary.getAverage());
            System.out.println("-------------------------");
        });

        // Sample data setup
        List<Author> authors = List.of(
                new Author("Alice", List.of(
                        new Book("Java Basics", "Programming", 4.5),
                        new Book("Advanced Java", "Programming", 4.8))),
                new Author("Bob", List.of(
                        new Book("World War II", "History", 4.2),
                        new Book("Ancient Civilizations", "History", 3.9))),
                new Author("Cathy", List.of(
                        new Book("Mystery Island", "Fiction", 4.0)))
        );

        LibraryAnalyzer analyzer = new LibraryAnalyzer();

        // 1. Flatten books
        List<Book> allBooks = analyzer.getAllBooks(authors);
        System.out.println("📚 All Books:");
        allBooks.forEach(book -> System.out.println("- " + book.getTitle()));

        // 2. Count books by genre
        Map<String, Long> genreCount = analyzer.countBooksByGenre(allBooks);
        System.out.println("\n📊 Book Count by Genre:");
        genreCount.forEach((genre, count) -> System.out.println(genre + ": " + count));

        // 3. Average rating by genre
        Map<String, Double> avgRatings = analyzer.averageRatingByGenre(allBooks);
        System.out.println("\n⭐ Average Rating by Genre:");
        avgRatings.forEach((genre, avg) -> System.out.printf("%s: %.2f%n", genre, avg));

        // 4. Custom collector: summary
        Map<String, GenreSummary> summaries = analyzer.summarizeGenres(allBooks);
        System.out.println("\n📘 Genre Summary (using custom collector):");
        summaries.forEach((genre, summary) -> System.out.println(genre + ": " + summary));


    }
}
