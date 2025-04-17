
import java.util.ArrayList;
import java.util.Scanner;

/****************************************************
 * Quick Notes App
 * Author: Ochwada
 * Date:
 * Description:
 * Objective: 🎯 Users can quickly jot down and delete notes using an ArrayList.
 ***************************************************/

public class Task07_QuickNotes {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> notes = new ArrayList<>();
    static int noteId = 100;


    static void addNote(String note) {
        note = note.trim();
        if (!note.isEmpty()) {
            notes.add(note);
            System.out.println("\uD83D\uDDD2\uFE0F Note Added: " + note);
        } else {
            System.out.println("⚠\uFE0F Note is empty. Nothing to add.");
        }
    }

    static void deleteNote(int index) {
        noteId = index - 100;
        if (noteId >= 0 && noteId < notes.size()) {
            notes.remove(noteId);
            System.out.println("Note deleted.");
        } else {
            System.out.println("⚠\uFE0F Invalid note ID.");
        }
    }

    static void viewNotes() {
        System.out.println("----  Your Notes ----");
        if (notes.isEmpty()) {
            System.out.println("No notes yet.");
            return;
        }
        for (int i = 0; i < notes.size(); i++) {
            System.out.println((i + noteId) + ". " + notes.get(i));
        }
    }


    public static void main(String[] args) {
        System.out.println("====== ✨ Quick Notes App ✨ ======");
        boolean running = true;

        // Dummy notes
        notes.add("Buy groceries");
        notes.add("Finish Java homework");
        notes.add("Call Grandma");
        notes.add("Read 'Clean Code'");
        notes.add("Water the plants");

        // Add functionality to add, remove, and view notes
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Note");
            System.out.println("2. Delete Note");
            System.out.println("3. View Notes");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your note: ");
                    String newNote = input.nextLine();
                    addNote(newNote);
                    break;

                case 2:
                    viewNotes();
                    System.out.print("Enter the note ID to delete: ");
                    int noteId = input.nextInt();
                    input.nextLine();
                    deleteNote(noteId);
                    break;

                case 3:
                    viewNotes();
                    break;

                case 4:
                    System.out.println("🫶 Thanks for using Quick Notes!");
                    running = false;
                    break;

                default:
                    System.out.println("⚠\uFE0F Invalid choice. Try again.");
            }
        }

        input.close();
    }
}