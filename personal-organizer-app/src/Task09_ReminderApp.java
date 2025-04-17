
import java.util.ArrayList;
import java.util.Scanner;

/****************************************************
 * Reminder System App
 * Author: Ochwada
 * Date:
 * Description:
 * Objective: 🎯 Add reminders for future events, then view and remove them when done.
 ***************************************************/

public class Task09_ReminderApp {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> reminders = new ArrayList<>();

    static int reminderId = 1000;

    static void addReminder(String reminder) {
        reminder = reminder.trim();

        if (!reminder.isEmpty()) {
            reminders.add(reminder);
            System.out.println("Reminder added: " + reminder);
        } else {
            System.out.println("⚠\uFE0F Reminder is empty");
        }
        reminderId++;
    }

    static void removeReminder(int removeId) {
        int actualID = removeId -1000;
        if (actualID >= 0 && actualID < reminders.size()) {
            reminders.remove(actualID);
            System.out.println("Reminder removed");
        }else
            System.out.println("‼\uFE0F Invalid index. No bookmark found at " + removeId);
    }
    static void viewReminders() {
        System.out.println(" ---- Reminders  ---- ");

        for (int i = 0; i < reminders.size(); i++) {
            String reminder;

            if (!reminders.get(i).isEmpty()) {
                reminder = reminders.get(i);

            }
        }


        for (String reminder : reminders) {
            if (!reminder.isEmpty()){
                System.out.println(  ". " +reminder);
            }else {
                System.out.println("No Reminder Found");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("====== ⏰ Reminder App ======");
        boolean running = true;

        // Dummy Reminders
        addReminder("Doctor's appointment at 3 PM");
        addReminder("Pick up laundry");
        addReminder("Call back Mom");
        addReminder("Pay rent");
        addReminder("Submit assignment");

        // Add, view, and delete reminders from the list.
        while (running) {
            System.out.println("\n⬇\uFE0FChoose an option:");
            System.out.println("1. Add Reminder");
            System.out.println("2. View Reminders");
            System.out.println("3. Remove Reminder");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Reminder: ");
                    addReminder(input.nextLine());
                    break;
                case 2:
                    viewReminders();
                    break;
                case 3:
                    viewReminders();
                    System.out.print("Enter ID to remove: ");
                    removeReminder(input.nextInt());
                    break;
                case 4:
                    System.out.println("🫶 Thanks for using Reminder App!");
                    running = false;
                    break;

                default:
                    System.out.println("⚠\uFE0F Invalid choice. Try again.");
            }

        }
        input.close();

    }
}
