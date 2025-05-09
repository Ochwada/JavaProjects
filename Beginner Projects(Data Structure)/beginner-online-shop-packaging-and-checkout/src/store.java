import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/****************************************************
 * ItemsInStore.java 
 * Author: Ochwada
 * Date: Friday, 28.Mar.2025, 14:30 hrs
 * Description: 
 * Objective:
 ***************************************************/

public class store {
    static String[] items = {"Mouse", "Keyboard", "Monitor", "Headphones", "Laptop"};
    static double[] prices = {15.99, 25.50, 149.99, 45.00, 850.00};
    static Scanner input = new Scanner(System.in);
    static List<String> cart = new ArrayList<>();


    //  -------- View Available Items Method --------------
    public static void displayProducts() {
        System.out.println("\n=== Available Products ===");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + ": €" + prices[i]);
        }
    }

    //  ---------------------------------------------------
    //  -------- Add Items to Cart  --------------
    public static void addItemsToCart() {
        double total = 0.0;
        int userChoice;
        int itemCount = 0;

        displayProducts();
        while (itemCount < 3) {

            System.out.println("\nSelect an item number (1–5) to add to cart, or 0 to quit:");
            userChoice = input.nextInt();

            if (userChoice == 0) {
                break; // user wants to quit early
            }

            if (userChoice >= 1 && userChoice <= items.length) {
                int index = userChoice - 1;
                System.out.println("You selected: " + items[index] + " (€" + prices[index] + ")");

                String confirm;
                while (true) {
                    System.out.print("Do you want to cancel? (yes/no): ");
                    confirm = input.next().trim().toLowerCase();

                    switch (confirm) {
                        case "yes":
                        case "y":
                        case "no":
                        case "n":
                            break; // valid input
                        default:
                            System.out.println("Please enter only 'yes', 'no', 'y' or 'n'.");
                            continue;
                    }
                    break; // exit loop once valid input is given
                }

                if (confirm.equals("no") || confirm.equals("n")) {

                    if (prices[index] < 500) {
                        double finalPrice = prices[index];

                        if (prices[index] > 100) {
                            finalPrice = prices[index] * 0.9;
                            System.out.println("💸 10% discount applied!");

                        }
//                        total += prices[index];
                        total += finalPrice;
                        cart.add(items[index]);
                        itemCount++;

                        System.out.println("Items selected so far: " + itemCount + "/3");
                        System.out.printf("Current total: € %.2f\n", total);
                        continue;
                    } else {
                        System.out.println("⚠\uFE0F Item too expensive. Skipping...");
                    }
                } else {
                    System.out.println("Cancelled item");
                    break;
                }

            } else {
                System.out.println("Invalid choice. Please select a number between 1 and 5, or 0 to quit.");
            }

        }

//        System.out.println("\nCheckout complete. You selected " + itemCount + " item(s).");
//        System.out.printf("Total amount: € %.2f\n", total);
        System.out.println("\n=== Total Price ===");
        showCartSummary(total);
    }

    public static void ConfirmMethod() {
        Scanner input = new Scanner(System.in);
        String confirm = input.nextLine().toLowerCase();

        switch (confirm) {
            case "yes":
            case "y":
                System.out.println("You chose to continue.");
                break;
            case "no":
            case "n":
                System.out.println("You chose not to continue.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }

    //  ---------------------------------------------------
    //  --------  Checkout  --------------
    public static void Checkout() {
        System.out.println("\n=== Checkout ===");
        double total = calculateTotal();
        int itemCount = cart.size();

        if (total == 0.0) {
            System.out.println("🛒 Your cart is empty!");
            return;
        }

        // Show cart contents
        //showCartSummary(total);

        showCartSummary(total, itemCount);

        // Ask user to confirm
        String confirm;
        while (true) {
            System.out.print("Confirm checkout? (yes/no): ");
            confirm = input.next().trim().toLowerCase();

            if (confirm.equals("yes") || confirm.equals("y")) {
                System.out.println("\nThank you for your purchase!");
                return;
            } else if (confirm.equals("no") || confirm.equals("n")) {
                System.out.println("Checkout cancelled. Returning to menu...");
                return;
            } else {
                System.out.println("Please enter only 'yes', 'no', 'y' or 'n'.");
            }
        }
    }
    //  ---------------------- ------------ ----------------------
    //  ---------------------- helper methods ----------------------

    public static double calculateTotal() {
        double total = 0.0;
        for (String item : cart) {
            for (int i = 0; i < items.length; i++) {
                if (items[i].equals(item)) {
                    total += prices[i];
                    break;
                }
            }
        }
        return total;
    }

    public static void showCartSummary(double total) {
        System.out.println("\nItems in your cart:");
        for (String item : cart) {
            System.out.println("- " + item);
        }
        System.out.printf("\nYour cart total is: €%.2f\n", total);
    }

    public static void showCartSummary(double total, int itemCount) {
        System.out.println("\n🛒 Items in your cart:");
        for (String item : cart) {
            System.out.println("- " + item);
        }

        String status = itemCount > 0 ? "✅ git Ready for checkout!" : "🛒 Cart is empty.";
        System.out.printf("\nYour cart total is: €%.2f\n", total);
        System.out.println("Number of items: " + itemCount);
        System.out.println(status);
    }


    //  ---------------------- ------------ ----------------------
    //  ----------------------  Method Overloading  ----------------------


}
