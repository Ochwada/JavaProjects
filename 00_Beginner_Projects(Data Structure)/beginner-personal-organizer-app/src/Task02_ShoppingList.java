
import java.util.ArrayList;
import java.util.Scanner;
/****************************************************
 * Shopping_LIST
 * Author: Ochwada
 * Date:
 * Description:
 * Objective: Users can add items to their shopping list, check for duplicates, and remove purchased items.
 ***************************************************/

public class Task02_ShoppingList {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> shoppingList = new ArrayList<>();

    public static void addItem(String item) {
        item = item.trim();
        shoppingList.add(item);
        System.out.println("Item added: " + item);
    }
    public static void removeItem(String item) {
        item = item.trim();
        if (shoppingList.remove(item)) {
            System.out.println("Item removed: " + item);
        } else {
            System.out.println("‼\uFE0F Item not Found in List.");
        }
    }
    public static void checkDuplicates() {
        System.out.println("🔍 Checking for duplicates...");

        // Loops over each item in the shopping list.
        for (int i = 0; i < shoppingList.size(); i++) {
            int count = 0;

            String item = shoppingList.get(i);
            item = item.trim().toLowerCase();

            // Compares the current item (i) to all other items (j).
            for (int j = 0; j < shoppingList.size(); j++) {

                String item2 = shoppingList.get(j);
                item2 = item2.trim().toLowerCase();

                if (item.equals(item2)) {
                    count++;
                }
            }

            // Print only once if it's a duplicate
            boolean isFirst = true;

            /*
            Looks at all items before the current index i,
            If the same item has already appeared earlier, isFirst becomes false.
            This prevents duplicate printing.
            */

            for (int k = 0; k < i; k++) {

                if (shoppingList.get(k).trim().toLowerCase().equals(item)) {
                    isFirst = false;
                    break;
                }

            }
            if (count > 1 && isFirst) {
                System.out.println("🔁 Duplicate Item: " + shoppingList.get(i));
            }
        }

    }

    public static void displayShoppingList() {
        if (shoppingList.isEmpty()) {
            System.out.println("Empty Shopping List");
        }else {
            for (int i = 0; i < shoppingList.size(); i++) {
                System.out.println( (i+1) + "." + shoppingList.get(i));
            }
        }
    }


    public static void main(String[] args) {

        // Allow adding items, checking for duplicates, and removing items.
        System.out.println("\n===== TODO List Manager ====");
        int choice;
        boolean running = true;

        while (running) {
            System.out.println("\n⬇\uFE0F Choose an option: ");
            System.out.println("1. Add Item: ");
            System.out.println("2. Remove Item: ");
            System.out.println("3. Check Duplicate Items: ");
            System.out.println("4. Show Shopping List: ");
            System.out.println("5. Exit: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    addItem(input.nextLine());
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    removeItem(input.nextLine());
                    break;
                case 3:
                    checkDuplicates();
                    break;
                case 4:
                    displayShoppingList();
                    break;
                case 5:
                    running = false;
                    System.out.println("👋 Exiting the app. Bye!");
                    break;
                default:
                    System.out.println("❗ Invalid option. Try again.");
            }
        }
        input.close();
    }
}
