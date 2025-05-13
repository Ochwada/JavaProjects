import java.util.Scanner;

/****************************************************
 * Menu.java 
 * Author: Ochwada
 * Date: Friday, 28.Mar.2025, 14:18 hrs
 * Description: 
 * Objective:
 ***************************************************/

public class printMainMenu {

    static int option;

    static void menu() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n==== TechStore Online Shop ===");
            System.out.println("1. View Available Items");
            System.out.println("2. Add Items to Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.println("------------------------------------- \n");
            System.out.println("Enter your choice: ");
            option = input.nextInt();

            if (option >= 1 && option <= 3) {
                switch (option) {
                    case 1:
                        store.displayProducts();
                        break;
                    case 2:
                        store.addItemsToCart();
                        break;
                    case 3:
                        store.Checkout();
                }
            } else if (option == 4) {
                System.out.println("\uD83D\uDC4B Thanks for shopping with us.  Have a great day!");
            } else {
                System.out.println("❌ Invalid choice. Please try again.");
            }

        } while (option != 4);

        input.close();

    }
}
