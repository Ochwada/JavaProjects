
import java.util.ArrayList;
import java.util.Scanner;

/****************************************************
 * Contact Search
 * Author: Ochwada
 * Date:
 * Description:
 * Objective:📌  Users can store contacts and search by name using a partial match.
 ***************************************************/

public class Task04_ContactSearch {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> contacts = new ArrayList<>();

    static void addContact(String contact) {
        contact = contact.trim();
        contacts.add(contact);
        System.out.println("Contact Added: " + contact);
    }

    static void displayContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    static void searchContact(String subString) {
        boolean found = false;

        for (int i = 0; i < contacts.size(); i++) {
            String contact = contacts.get(i);
            boolean isMatch = contact.toLowerCase().contains(subString.toLowerCase());
            // contacts.get(i).toLowerCase().contains(subString.toLowerCase())

            if (isMatch) {
                System.out.println("Contact Found: " + contacts.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("\uD83D\uDC94 Contact Not Found");
        }
    }

    static void removeContact(String contact) {
        contact = contact.trim().toLowerCase();
        if (contacts.remove(contact)) {
            System.out.println("Contact Removed: " + contact);
        }else{
            System.out.println(contact + "\uD83D\uDC94 Contact Not on Contact List");
        }

    }


    /* ==== DUMMY NAMES ====
                Alex Johnson
                Maya Singh
                Lukas Meier
                Amina Bello
                Carlos Ortega
     *   *   *   *   *  */
    //contact  = contact.trim().toLowerCase();
    public static void main(String[] args) {
        // Add contacts and search for a contact using a partial match.
        System.out.println("\n====== \uD83D\uDCD6 Welcome to Contactly======");

        int choice;
        boolean running = true;

        while (running) {
            System.out.println("\n⬇\uFE0F Choose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            // -------------


            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Contact to Add: ");
                    addContact(input.nextLine());
                    break;
                case 2:
                    System.out.println("Contact to Remove: ");
                    removeContact(input.nextLine());
                    break;
                case 3:
                    System.out.println("Search Contact (you can use part of the name): ");
                    searchContact(input.nextLine());
                    break;
                case 4:
                    System.out.println(" ===== All Contacts =====");
                    displayContacts();
                    break;
                case 5:
                    System.out.println("Exit");
                    running = false;
                    break;
                default:
                    System.out.println("‼\uFE0F Invalid option: Try again");
                    break;
            }
        }
        input.close();
    }
}
