
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/****************************************************
 * Wishlist Sorter
 * Author: Ochwada
 * Date:
 * Description:
 * Objective: 🎯Users maintain a wishlist of products and can sort it alphabetically or by priority.
 ***************************************************/


public class Task05_WishlistSorter {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> wishlist = new ArrayList<>();
    static int wishId = 100;

    static void addToWishlist(String input) {
        input = input.trim();
        wishlist.add(input);
        System.out.println("Wishlist added: " + input);
        wishId++;
    }

    static void removeFromWishlist(int wishIdToRemove ) {
        int actualId = wishIdToRemove - 100;


        if (actualId >= 0 && actualId < wishlist.size()) {
            wishlist.remove(actualId);
            System.out.println("Wish removed");
        } else {
            System.out.println("❗ Wish ID does not exist");
        }

    }
    static void displayWishlist() {
        int wishIdToDisplay = 100;

        for (int i = 0; i < wishlist.size(); i++) {
            System.out.println( wishIdToDisplay +  ". " + wishlist.get(i));
            wishIdToDisplay ++;

        }
    }
    static void sortWishlist() {
        Collections.sort(wishlist);
        System.out.println(" ---- ⏬ Sorted Wishlist---- ");

        int index = 100;
        for (String item : wishlist) {
            System.out.println(index + ". " + item);
            index++;
        }
    }
    static void prioriryWishlist(String input,  int priorityID) {



    }

/*
*  Noise-Canceling Headphones
    Standing Desk
    Kindle Paperwhite
    Apple MacBook Air M3
    Trip to Japan
* */
    public static void main(String[] args) {

        // Add products and sort the wishlist alphabetically.

        System.out.println(" ====== \uD83D\uDCD6 Welcome to Wishly ====== ");
        int option;
        boolean running = true;

        ArrayList<Integer> priority = new ArrayList<>();

            wishlist.add("Apple MacBook Air M3");
            wishlist.add("Noise-Canceling Headphones");
            wishlist.add("Standing Desk");
            wishlist.add("Kindle Paperwhite");
            wishlist.add("Trip to Japan");

            priority.add(3);
            priority.add(2);
            priority.add(1);
            priority.add(2);



        while (running) {
            System.out.println();
            System.out.println("⬇\uFE0F Choose an option:");
            System.out.println(" 1. Add to Wishlist");
            System.out.println(" 2. Remove from Wishlist");
            System.out.println(" 3. Show Wishlist");
            System.out.println(" 4. Sort Wishlist");
            System.out.println(" 5. Exit");
            System.out.println(" Your choice: ");

            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter Wishlist Name: ");
                    String name = input.nextLine();
                    addToWishlist(name);
                    break;
                case 2:
                    System.out.println("Enter Wishlist ID: ");
                    removeFromWishlist(input.nextInt());
                    break;
                case 3:
                    System.out.println(" ---- Wishlist ---- ");
                    displayWishlist();
                    break;
                case 4:
                    sortWishlist();
                    break;
                case 5:
                    System.out.println("♾\uFE0F Thanks For Using Wishly ♾\uFE0F ");
                    running = false;
                    break;
                default:
                    System.out.println("❗Invalid option. Try again.");
            }
        }
        input.close();
    }
}
