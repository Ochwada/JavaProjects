
import java.util.ArrayList;
import java.util.Scanner;

/****************************************************
 * Tag Manager App
 * Author: Ochwada
 * Date:
 * Description:
 * Objective: 🎯  Allow users to tag things with keywords and print all current tags.
 ***************************************************/

public class Task08_TagManager {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> tags = new ArrayList<>();


    static void addTag(String tag) {
        tag = tag.trim();

        if (!tag.isEmpty()) {
            tags.add(tag);
            System.out.println("Tag Added: " + tag);
        }
        System.out.println("❕ Cannot add an empty tag.");
    }

    static void removeTag(int index) {
        if (index >= 1 && index <= tags.size()) {
            tags.remove(index - 1);
            System.out.println("Removed tag");
        } else {
            System.out.println("❕ Invalid tag number.");
        }
    }

    static void displayTags() {
        System.out.println("---- Current Tags ----");
        if (tags.isEmpty()) {
            System.out.println("No tags yet.");
            return;
        }

        for (int i = 0; i < tags.size(); i++) {
            System.out.println((i + 1) + ". " + tags.get(i));
        }
    }


    public static void main(String[] args) {
        //Implement tag management (add, remove, list all tags).

        System.out.println("====== 🏷️ Tag Manager ======");

        // Add dummy tags
        tags.add("#urgent");
        tags.add("#todo");
        tags.add("#java");
        tags.add("#meeting");
        tags.add("#important");


        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Tag");
            System.out.println("2. Show All Tags");
            System.out.println("3. Remove Tag");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int choice = input.nextInt();
            input.nextLine(); // clear the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a tag (e.g., #urgent, #java): ");
                    String tag = input.nextLine();
                    addTag(tag);
                    break;

                case 2:
                    displayTags();
                    break;

                case 3:
                    displayTags();
                    System.out.print("Enter tag number to remove: ");
                    int tagNum = input.nextInt();
                    input.nextLine();
                    removeTag(tagNum);
                    break;

                case 4:
                    System.out.println("👋 Thanks for tagging with us!");
                    running = false;
                    break;

                default:
                    System.out.println("❗ Invalid option. Try again.");
            }
        }

        input.close();
    }
}