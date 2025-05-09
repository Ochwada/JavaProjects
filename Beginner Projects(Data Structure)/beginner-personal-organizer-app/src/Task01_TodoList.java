
import java.util.ArrayList;
import java.util.Scanner;
/****************************************************
 * TODO_LIST
 * Author: Ochwada
 * Date:
 * Description:
 * Objective: Build a to-do list that can add, remove, and print tasks.
 ***************************************************/

public class Task01_TodoList {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> todoList = new ArrayList<>();

    public static void addTask(String task) {
        task = task.toLowerCase().trim();
        todoList.add(task);
        System.out.println("Task added: " + task);
    }

    public static void removeTasks(String task) {
        task = task.toLowerCase().trim();

        if(todoList.remove(task)){
            System.out.println("Task removed: " + task);
        }else
            System.out.println("❗ Task not found: " + task);
    }
    public static void displayTasks() {
        if(todoList.isEmpty()){
            System.out.println("No tasks found");
        }else {
            System.out.println("-------- Available Tasks -------- ");
            for (String task : todoList){
                System.out.println(task);
            }
        }
    }


    public static void main(String[] args) {

        // Implement a menu to add, remove, and display tasks from the todoList.
        System.out.println("\n===== TODO List Manager ====");
        int choice;
        boolean running = true;

        while (running) {
            System.out.println("\n⬇\uFE0F Choose an option: ");
            System.out.println("1. Add Task: ");
            System.out.println("2. Remove Task: ");
            System.out.println("3. Print Task: ");
            System.out.println("4. Exit: ");

            choice = input.nextInt();
            input.nextLine(); // Consume newline after int input

            switch (choice) {
                case 1:
                    System.out.println("Enter Task: ");
                    addTask(input.nextLine());
                    break;
                case 2:
                    System.out.println("Enter Task to remove: ");
                     removeTasks(input.nextLine());
                     break;
                case 3:
                     displayTasks();
                     break;
                case 4:
                    running = false;
                    System.out.println("Exit App. Thanks \uD83E\uDE77");
                      break;
                default:
                    System.out.println("❌ invalid option. Try again.");
            }

        }
        input.close();
    }

}
