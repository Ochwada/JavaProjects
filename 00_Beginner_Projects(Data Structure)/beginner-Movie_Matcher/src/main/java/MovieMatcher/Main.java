package MovieMatcher;

import java.util.ArrayList;
import java.util.Scanner;


/****************************************************
 * Main.java 
 * Author: Ochwada
 * Date: Tuesday, 15.Apr.2025, 16:24 hrs
 * @description:
 * @Objective:
 ***************************************************/
import static MovieMatcher.Movie.*;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        movies.add(new Movie("Inception", 5));
        movies.add(new Movie("The Room", 1));
        movies.add(new Movie("Interstellar", 5));
        movies.add(new Movie("Sharknado", 2));
        movies.add(new Movie("The Godfather", 5));
        movies.add(new Movie("Twilight", 3));

//        for (Movie movie : movies) {
//            System.out.println(movie.getTitle());
//        }

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println(" \uD83C\uDF9E\uFE0F Welcome to MovieMatcher \uD83C\uDF9E\uFE0F ");
            System.out.println("1. Add Movie: ");
            System.out.println("2. Movie Search by Rating: ");
            System.out.println("3. Show All Movies: ");
            System.out.println("4. Exit: ");

            System.out.print("Choose an option: ");
            int userChoice = userInput.nextInt();
            System.out.println();

            switch (userChoice){
                case 1 :
                    System.out.println("Enter movie title: ");
                    // You're using next() which cuts off input at the first space:
                    String movieTitle = userInput.next(); // ❌ "The Prestige" → just "The"

                    /**
                    * 🛠 Fix: Use nextLine() and call nextLine() twice to flush the buffer:
                    * System.out.print("Enter movie title: ");
                    * userInput.nextLine(); // consume leftover newline
                    * String movieTitle = userInput.nextLine();
                    */

                    System.out.println("Enter movie rating: ");
                    int movieRating = userInput.nextInt();

                    Movie newMovie = new Movie(movieTitle, movieRating);
                    movies.add(newMovie);

                    System.out.println("✅ Added: " + newMovie.getTitle() + " (Rating: " + newMovie.getRating() + ")");

                    break;
                case 2 :
                    System.out.println("Enter desired movie rating (1 to 5): ");
                    displayMovie();
                    break;
                case 3 :
                    showAllMovies();
                    break;
                case 4 : running = false;
                break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
        userInput.close();

    }

}
