import java.util.ArrayList;
import java.util.Scanner;

/****************************************************
 * Daily Planner
 * Author: Ochwada
 * Date:
 * Description:
 * Objective: 🎯 Users plan their day using time slots (10:00 AM, 11:00 AM...),
 *            assigning tasks to each slot.
 ***************************************************/

public class Task06_DailyPlanner {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> timeSlots = new ArrayList<>();
    static String[] timeLabels = {"10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM"};
    static int startId = 100;

    static void initializeTimeSlots() {
        // Initialize planner with empty tasks
        for (String label : timeLabels) {
            timeSlots.add(""); // Blank for now
        }
    }

    static void addTask(int slotId, String task) {
        int index = slotId - startId;
        if (index >= 0 && index < timeSlots.size()) {
            timeSlots.set(index, task.trim());
            System.out.println("Task added to " + timeLabels[index]);
        } else {
            System.out.println("Invalid slot ID.");
        }
    }

    static void viewPlanner() {
        System.out.println(" ---- Daily Planner ---- ");
        for (int i = 0; i < timeSlots.size(); i++) {
            String task;
            if (timeSlots.get(i).isEmpty()) {
                task = "No Task";
            } else {
                task = timeSlots.get(i);
            }
            System.out.println((startId + i) + ". " + timeLabels[i] + " - " + task);
        }
    }

    static void clearTask(int slotId) {
        int index = slotId - startId;
        if (index >= 0 && index < timeSlots.size()) {
            timeSlots.set(index, "");
            System.out.println("Task cleared from " + timeLabels[index]);
        } else {
            System.out.println("❗ Invalid slot ID.");
        }
    }

    public static void main(String[] args) {
        System.out.println(" ====== Welcome to DayWise Planner ====== ");
        initializeTimeSlots();

        boolean running = true;
        int choice;

        while (running) {
            System.out.println("\n⬇️ Choose an option:");
            System.out.println(" 1. Add Task");
            System.out.println(" 2. Clear Task");
            System.out.println(" 3. View Planner");
            System.out.println(" 4. Exit");
            System.out.print(" Your choice: ");

            choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewPlanner();
                    System.out.print("Enter Slot ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Task: ");
                    String task = input.nextLine();
                    addTask(id, task);
                    break;

                case 2:
                    viewPlanner();
                    System.out.print("Enter Slot ID to clear: ");
                    int clearId = input.nextInt();
                    input.nextLine();
                    clearTask(clearId);
                    break;

                case 3:
                    viewPlanner();
                    break;

                case 4:
                    System.out.println("👋 Thanks for using DayWise Planner!");
                    running = false;
                    break;

                default:
                    System.out.println("❗Invalid choice. Try again.");
            }
        }

        input.close();
    }
}
