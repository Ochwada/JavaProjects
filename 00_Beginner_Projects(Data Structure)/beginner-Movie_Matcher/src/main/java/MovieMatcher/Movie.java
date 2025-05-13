package MovieMatcher;

import java.util.ArrayList;
import java.util.Scanner;

/****************************************************
 * Movie.java 
 * Author: Ochwada
 * Date: Tuesday, 15.Apr.2025, 16:19 hrs
 * @description:
 * {@code @Objective:}
 ***************************************************/

public class Movie {


    /// ----------------- Fields -----------------
    // Non-Static /  instance field
    private String title;
    private int rating; //  range of 1 -5;
    static  ArrayList<Movie> movies = new ArrayList<Movie>();

    //Static
    private static int movieCount = 1;
    public static Scanner userInput = new Scanner(System.in);

    /// ----------------- Constructor -----------------
    // No- arg
    private  Movie() {}

    // Parametrized
    Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    ///  ---------------- Static Factory Method -----------
    public static Movie addMovieObj(String title, int rating) {
    return new Movie(title, rating);
     }

    // Add a new movie
    public static void addMovie(String title, int rating) {
        movies.add(addMovieObj(title, rating));
    }

    ///  ---------------- Show Movies -----------
    public static void showAllMovies() {
        if (movies.isEmpty()) {
            System.out.println("No Movies yet!");
        } else {
            System.out.println("📽️ Current Movie List:");
            for (Movie m : Movie.movies) {
                System.out.println("- " + m.getTitle() + " (Rating: " + m.getRating() + ")");
            }
        }
    }

    ///  -------------- Binary Search --------------

    static ArrayList<Movie> getMoviesByRating(Movie[] movies, int inputRating) {
        ArrayList<Movie> movieList = new ArrayList<>(); // Empty Array

        int low = 0;
        int high = movies.length -1;
        int foundIndex = -1; // -1: means no match

        while (low <= high) {

            int mid = (low + high) / 2;
            System.out.println("Checking if movie is within rating: " + movies[mid].rating );

        if (movies[mid].rating == inputRating) {
            foundIndex = mid;
            break;
        } else if (movies[mid].rating < inputRating) {
            low = mid + 1; // Go right
        }else {
            high = mid - 1; // Go left
        }
        }
        // If no match found, return empty list

        if (foundIndex == -1) {
            return movieList;
        }
        // Explore left and right from the found index
        int left = foundIndex;
        int right = foundIndex+1;

        // Move left to find other matches
        while(left >=0 && movies[left].rating == inputRating) {
            movieList.add(movies[left]); // reducing use of extra loop
            left--;
        }
        //  Move right to find other matches
        while (right < movies.length && movies[right].rating == inputRating){
            movieList.add(movies[right]); // reducing use of extra loop
            right++;
        }

        for (Movie m : movies) {
            if (m.getRating() == inputRating) {
                movieList.add(m); //  ❌ Duplicates the ones already added
                // 🛠 Fix: Remove this second for loop entirely — it defeats the purpose of binary search.
            }
        }
        return movieList;
    }

    // ---- RatingFilter

    public static void displayMovie() {
        int movieRatingInput = userInput.nextInt();
        // 🛠 Add a prompt like:
        /**
         * System.out.print("Enter rating to search (1 to 5): ");
         * int movieRatingInput = userInput.nextInt();

        */

        System.out.println("\uD83C\uDFAC Movies with Rating:" + movieRatingInput );

        Movie[] movieArray = movies.toArray(new Movie[0]);
        ArrayList<Movie> filteredMovies = getMoviesByRating(movieArray, movieRatingInput);

        // Display the result
        if (filteredMovies.isEmpty()) {
            System.out.println("No movies found with that rating.");
        } else {
            for (Movie m : filteredMovies) {
                System.out.println("🎬 " + m.getTitle() + " (Rating: " + m.getRating() + ")");
            }
        }
    }





    ///  ----------------- Getters  -----------------
    public String getTitle() {
        return title;
    }
    public int getRating() {
        return rating;
    }

}
