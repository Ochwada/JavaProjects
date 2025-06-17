package com.example.service;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

/**
 * *******************************************************
 * Package: com.example.service
 * File: SentenceStats.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 12:21 PM
 * Description: Helper class that stores sentence statistics during stream processing.
 * Objective:
 * *******************************************************
 */

// ------------------------------------------------
// Exercise 5: Custom Collector - Sentence Stats
// ------------------------------------------------


public class SentenceStats
        implements Collector<
        String,
        SentenceStats.Sentence,
        SentenceStats.Sentence> {

    /**
     * Internal mutable container for accumulating sentence statistics.
     */
    public static class Sentence {
        private int sentenceCount = 0;
        private int wordCount = 0;

        /**
         * Processes a sentence and updates the counters.
         * <p>
         * The sentence is split into words (by spaces), and both the sentence count and word count are incremented.
         *
         * @param sentence the sentence to process
         */
        public void sentenceAccumulator(String sentence) {
            sentenceCount++;
            wordCount += sentence.split(" ").length;
        }

        /**
         * Combines another Sentence accumulator into this one (for parallel streams).
         *
         * @param other the other Sentence to combine
         */
        public void combine(Sentence other) {
            this.sentenceCount += other.sentenceCount;
            this.wordCount += other.wordCount;
        }

        /**
         * Calculates the average number of words per sentence.
         *
         * @return the average words per sentence, or 0 if no sentences have been processed
         */
        public double getAverageWordsPerSentence() {
            return sentenceCount == 0 ? 0 : (double) wordCount / sentenceCount;
        }

        // Getters
        public int getSentenceCount() {
            return sentenceCount;
        }

        public int getWordCount() {
            return wordCount;
        }

        /**
         * Returns a string representation of the current statistics.
         *
         * @return a string showing sentence count, word count, and average words per sentence
         */
        @Override
        public String toString() {
            return "Sentence: " +
                    "sentenceCount = " + sentenceCount +
                    ", wordCount = " + wordCount +
                    ", Avg Words Per Sentence = " + getAverageWordsPerSentence();
        }
    }

    /**
     * Provides the initial container for accumulation.
     */
    @Override
    public Supplier<Sentence> supplier() {
        return Sentence::new;
    }

    /**
     * Accumulates sentences into the current container.
     */
    @Override
    public BiConsumer<Sentence, String> accumulator() {
        return Sentence::sentenceAccumulator;
    }

    /**
     * Combines two partial results during parallel execution.
     */
    @Override
    public BinaryOperator<Sentence> combiner() {
        return (s1, s2) -> {
            s1.combine(s2);
            return s1;
        };
    }

    /**
     * Returns the final result after collecting.
     * In this case, we don't transform the container; so identity.
     */
    @Override
    public Function<Sentence, Sentence> finisher() {
        return Function.identity();
    }


    /**
     * Characteristics of this collector.
     */
    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}
