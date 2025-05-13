

/****************************************************
 * CustomerSupportPortal.java 
 * Author: Ochwada
 * Date: Thursday, 27.Mar.2025, 14:23 hrs
 * Description: Java Console Project: Simulated Customer Support Portal (Text-Based)
 * Objective:Imagine you're working for a small startup that’s just launched a product 🧑‍💻.
 *          Since they can’t afford a fancy web-based customer support system yet, they ask you
 *          (a Java developer-in-training) to build a simple terminal-based Customer Support
 *          Portal to manage basic customer service actions
 ***************************************************/

import java.util.Scanner;

public class CustomerSupportPortal {

    static void printMenu() {
        Scanner input = new Scanner(System.in);
        // Variables
        int choice;

        do {
            System.out.print("\n======= Customer Support Menu =======\n");
            System.out.println(" 1. Submit New Request");
            System.out.println(" 2. View Request Status");
            System.out.println(" 3. Close Request");
            System.out.println(" 4. Exit");
            System.out.println("------------------------------------- \n");
            System.out.print("Enter Your Choice: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 3) {
                switch (choice) {
                    case 1:
                        TrackRequestStatus.newRequest();
                        break;
                    case 2:
                        TrackRequestStatus.submitRequest();
                        break;
                    case 3:
                        TrackRequestStatus.closeRequest();
                        break;
                }
            } else if (choice == 4) {
                System.out.println("\uD83D\uDC4B Thanks for visiting.  Have a great day!");
            } else
                System.out.println(" ❌ Invalid choice. Please try again.");

        } while (choice != 4);

        input.close();
    }

    public static void main(String[] args) {

        System.out.print(" Welcome to TechStart Customer Support Portal! ");
        System.out.println();

        printMenu();


    }
}
