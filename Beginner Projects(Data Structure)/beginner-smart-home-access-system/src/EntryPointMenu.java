import java.util.Scanner;

public class EntryPointMenu {

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Smart Home System 🏠");

        System.out.print("Enter your role (Parent, Child, Guest): ");
        String role = scanner.nextLine();

        System.out.print("Enter room you want to access: ");
        String room = scanner.nextLine();

        System.out.print("Do you have a keycard? (true/false): ");
        boolean hasKeycard = scanner.nextBoolean();

        System.out.print("Face recognized by scanner? (true/false): ");
        boolean faceRecognized = scanner.nextBoolean();

        // Optional: simulate emergency
        System.out.print("Emergency mode active? (true/false): ");
        boolean isEmergency = scanner.nextBoolean();

        // Logic calls here (fill in SmartHomeMain)
        SmartHomeMain.runAccessFlow(role, room, hasKeycard, faceRecognized, isEmergency);

        scanner.close();
    }
}
