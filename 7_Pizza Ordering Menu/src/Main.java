

/****************************************************
 * PizzaOrderingMenu.java
 * Author: Ochwada
 * Date: Thursday, 27.Mar.2025, 12:40 hrs
 * Description:  Pizza Menu
 * Objective: Pizza Ordering Menu using a do-while loop
 ***************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        double totalPrice = 0.0;
        int pizzaCount = 0;

        do{
            System.out.print("\n ===== Pizza Ordering Menu ===== ");
            System.out.print("\n 1. Margherita - " + "$5.00");
            System.out.print("\n 2. Pepperoni  - " + "$6.50");
            System.out.print("\n 3. Veggie     - " + "$6.00" );
            System.out.print("\n 4. Meat Feast - " + "$7.50");
            System.out.print("\n 5. Exit");
            System.out.print("\n Enter your choice: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 4){
                System.out.println("\n === Your Oder ===");

                double price = 0.0;
                String name = "";

                switch (choice) {
                    case 1: price = 5.00; name = "Margherita"; break;
                    case 2: price = 6.50; name = "Pepperoni"; break;
                    case 3: price = 6.00; name = "Veggie"; break;
                    case 4: price = 7.50; name = "Meat Feast"; break;
                }
                System.out.println("\n You selected: " + name + " ($" + price + ")");

                System.out.print("Confirm this Order? (y/n): ");
                char confirm = input.next().charAt(0);

                if (confirm == 'y' || confirm == 'Y') {
                    totalPrice += price;
                    pizzaCount++;

                    System.out.println( name + " added to oder.");
                    System.out.printf("Running Total: $%.2f | Items: %d\n", totalPrice, pizzaCount);
                } else {
                    System.out.println("Order cancelled.");
                }
            } else if (choice == 5) {
                System.out.println("\n Exiting... Final bill.");
            } else {
                System.out.println(" Invalid choice. Please try again.");
            }
        } while ( choice != 5 );

        System.out.println("\n -----------------  --------------------");

        System.out.printf("\nTotal Bill: $%.2f\n Total Items Ordered: %d\n", totalPrice, pizzaCount);
        System.out.println("Thank you for your order!");
        input.close();


    }
}