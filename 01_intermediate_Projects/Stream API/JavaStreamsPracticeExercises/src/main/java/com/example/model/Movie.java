package com.example.model;


/**
 * *******************************************************
 * Package: com.example.model
 * File: Movie.java
 * Author: Ochwada
 * Date: Tuesday, 17.Jun.2025, 12:00 PM
 * Description: Model class (POJO) - Represents a movie with a name, genre, and rating.
 * * The {@code Movie} class models basic information about a movie, including its title, genre, and average rating score.
 * Objective:
 * *******************************************************
 */


public class Movie {
    private final String name;
    private final String genre;
    private final double rating;

    /**
     * Constructs a new {@code Movie} object with the specified name, genre, and rating.
     *
     * @param name   the name or title of the movie
     * @param genre  the genre of the movie (e.g., "Action", "Comedy", "Drama")
     * @param rating the rating score of the movie (e.g., IMDb score)
     */
    public Movie(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    /**
     * Returns the name of the movie.
     *
     * @return the movie name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the genre of the movie.
     *
     * @return the movie genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Returns the rating of the movie.
     *
     * @return the movie rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * Returns a string representation of the movie.
     *
     * @return a string describing the movie's name, genre, and rating
     */
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
