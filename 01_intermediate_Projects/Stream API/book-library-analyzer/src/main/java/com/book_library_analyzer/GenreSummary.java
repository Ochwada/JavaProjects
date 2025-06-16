package com.book_library_analyzer;


/**
 * *******************************************************
 * Package: com.book_library_analyzer
 * File: GenreSummary.java
 * Author: Ochwada
 * Date: Monday, 16.Jun.2025, 11:12 AM
 * Description: A helper class to accumulate ratings and calculate averages.
 * Objective:
 * *******************************************************
 */


/**
 * This class maintains a running total of ratings and the count of ratings added.
 * It provides methods to add new ratings, retrieve the count, calculate the average,
 * and generate a string representation of its current state.
 */
public class GenreSummary {

    /** The number of ratings accumulated. */
    private int count;

    /** The total sum of all ratings accumulated. */
    private double totalRating;

    /**
     * Adds a new rating to the accumulator.
     *
     * @param rating the rating value to add
     */
    public void addRating(double rating) {
        totalRating += rating;
        count++;
    }


    /**
     * Returns the number of ratings that have been accumulated.
     *
     * @return the count of ratings
     */
    public int getCount() {
        return count;
    }

    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Calculates and returns the average rating.
     * If no ratings have been added, it returns 0 to avoid division by zero.
     *
     * @return the average rating, or 0 if no ratings exist
     */
    public double getAverage() {
        return count == 0 ? 0 : totalRating / count;
    }

    public double getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(double value) {
        this.totalRating += value;
    }

    /**
     * Returns a string representation of the current state of the accumulator,
     * showing both the count of ratings and the total rating sum.
     *
     * @return a string representation of the accumulator
     */
    @Override
    public String toString() {
        return "count=" + count + ", totalRating=" + totalRating;
    }
}
