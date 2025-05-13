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

public class Task05_WishlistSorterPriorty {
    static Scanner input = new Scanner(System.in);
    static ArrayList<WishItem> wishlist = new ArrayList<>();
    static int wishId = 100;

    // Inner class for wishlist items
    static class WishItem {
        String name;
        int priority;

        WishItem(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
    }

    static void addToWishlist(String input) {
        input = input.trim();
        wishlist.add(new WishItem(input, 0));
        System.out.println("Wishlist added: " + input);
        wishId++;
    }

    static void removeFromWishlist(int wishIdToRemove) {
        int actualId = wishIdToRemove - 100;
        if (actualId >= 0 && actualId < wishlist.size()) {
            wishlist.remove(actualId);
            System.out.println("Wish removed");
        } else {
            System.out.println("❗ Wish ID does not exist");
        }
    }

    static void displayWishlist() {
        int displayId = 100;
        for (WishItem item : wishlist) {
            System.out.println(displayId + ". " + item.name + " (Priority: " + item.priority + ")");
            displayId++;
        }
    }

    static void sortWishlist() {
        Collections.sort(wishlist, (a, b) -> a.name.toLowerCase().compareTo(b.name.toLowerCase()));
        System.out.println(" ---- ⏬ Alphabetically Sorted Wishlist ---- ");
        displayWishlist();
    }

    static void priorityWishlist(String input, int priorityID) {
        wishlist.add(new WishItem(input.trim(), priorityID));
    }

    static void sortByPriority() {
        Collections.sort(wishlist, (a, b) -> a.priority - b.priority);
        System.out.println(" ---- 🔼 Priority Sorted Wishlist ---- ");
        displayWishlist();
    }

    public static void main(String[] args) {
        // Pre-filled wishlist
        priorityWishlist("Noise-Canceling Headphones", 4);
        priorityWishlist("Standing Desk", 3);
        priorityWishlist("Kindle Paperwhite", 2);
        priorityWishlist("Apple MacBook Air M3", 2);
        priorityWishlist("Trip to Japan", 1);

        System.out.println(" ====== Welcome to Wishly ====== ");
        int option;
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("⬇️ Choose an option:");
            System.out.println(" 1. Add to Wishlist");
            System.out.println(" 2. Remove from Wishlist");
            System.out.println(" 3. Show Wishlist");
            System.out.println(" 4. Sort Wishlist (Alphabetically)");
            System.out.println(" 5. Sort Wishlist (By Priority)");
            System.out.println(" 6. Exit");
            System.out.print(" Your choice: ");

            option = input.nextInt();
            input.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter Wishlist Name: ");
                    String name = input.nextLine();
                    System.out.print("Enter Priority (1 = High): ");
                    int prio = input.nextInt();
                    priorityWishlist(name, prio);
                    break;
                case 2:
                    System.out.print("Enter Wishlist ID: ");
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
                    sortByPriority();
                    break;
                case 6:
                    System.out.println("♾️ Thanks For Using Wishly ♾️ ");
                    running = false;
                    break;
                default:
                    System.out.println("❗ Invalid option. Try again.");
            }
        }

        input.close();
    }
}
