package com.book_library_analyzer;


/**
 * *******************************************************
 * Package: com.book_library_analyzer
 * File: GenreSummaryCollector.java
 * Author: Ochwada
 * Date: Monday, 16.Jun.2025, 10:53 AM
 * Description:
 * Objective:
 * *******************************************************
 */

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

/**
 * A custom collector that groups books by genre and calculates the total count
 * and average rating for each genre.
 * <p>
 * This collector accumulates {@link Book} objects into a {@code Map<String, GenreSummary>} where:
 * -The key is the genre (String).
 * -The value is a GenreSummary object, which stores the count and total rating for that genre.
 * Intended for use with Java Streams to perform aggregation logic while grouping books by genre.
 */
public class GenreSummaryCollector
        implements Collector <
                Book, // Element type being collected (T)
                Map<String, GenreSummary>, // Mutable accumulation type (intermediate result container)
                Map<String, GenreSummary>  // Final result type
                > {

    /**
     * Provides a new empty result container for the accumulation process.
     *
     * @return a supplier that creates an empty {@code HashMap<String, GenreSummary>} to accumulate results.
     */
    @Override
    public Supplier<Map<String, GenreSummary>> supplier() { // string -> Genre
        return HashMap::new;
    }

    /**
     * Adds a {@link Book} element to the result container.
     *
     * <p>This method updates or creates the {@link GenreSummary} corresponding to the genre of the given book.
     * If the genre does not exist in the map yet, a new {@code GenreSummary} is created.
     * The book's rating is then added to the corresponding {@code GenreSummary} using the {@code addRating()} method.
     *
     * @return a {@link BiConsumer} that updates the accumulating map based on the provided {@link Book}.
     */
    @Override
    public BiConsumer<Map<String, GenreSummary>, Book> accumulator() {
        return (map, book) -> {
            map.computeIfAbsent(
                            book.getGenre(),
                            genre -> new GenreSummary())
                    .addRating(book.getRating());

        };
    }

    /**
     * Merges two partial result containers during parallel stream processing.
     *
     * <p>This method merges two {@code Map<String, GenreSummary>} instances by iterating
     * over all entries of the second map and updating the corresponding entries in the first map.
     * If a genre exists in both maps, their {@link GenreSummary} objects are combined
     * by summing up both their total ratings and their counts.
     *
     * @return a {@link BinaryOperator} that merges two partial result maps into one.
     */
    @Override
    public BinaryOperator<Map<String, GenreSummary>> combiner() {
        return (map1, map2) -> {
            map2.forEach((genre, summary) ->
                    map1.merge(genre, summary, (s1, s2) -> {
                                s1.setTotalRating(s2.getTotalRating()); // s1.getTotalRating +=s2.getTotalRating
                                return s1;
                            }
                    )
            );
            return map1;
        };
    }

    /**
     * Performs the final transformation of the accumulated result.
     *
     * <p>Since the accumulator type {@code Map<String, GenreSummary>} is the same as the result type,
     * this collector uses the identity finisher, which means no further transformation is needed.
     * The accumulated map is returned as-is.
     *
     * @return a {@link Function} that returns the accumulated map without any modification.
     */
    @Override
    public Function<Map<String, GenreSummary>, Map<String, GenreSummary>> finisher() {
        return Function.identity(); // Just return the map as it is
    }

    /**
     * Defines the characteristics of this collector.
     *
     * <p>This collector declares {@code Characteristics.IDENTITY_FINISH}, indicating that the finisher function
     * is simply the identity function (i.e., no additional transformation is required after accumulation).
     *
     * <p>No other characteristics (e.g., CONCURRENT, UNORDERED) are declared because:
     * <ul>
     *   <li>The collector is not thread-safe for concurrent modifications.</li>
     *   <li>The ordering of elements may be important depending on the use case.</li>
     * </ul>
     *
     * @return a set containing {@link Characteristics#IDENTITY_FINISH}.
     */
    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}
