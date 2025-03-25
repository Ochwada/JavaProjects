public class SmartHomeMain {

    public static void main(String[] args) {
        EntryPointMenu.displayMenu();
    }

    public static void runAccessFlow(String role, String room, boolean hasKeycard, boolean faceRecognized, boolean isEmergency) {
        System.out.println("\n--- Access Evaluation ---");

        String accessLevel = UserAccessLevel.getAccessLevel(role);
        System.out.println("Access Level: " + accessLevel);

        String doorStatus = AccessDecisionEngine.canEnter(hasKeycard, faceRecognized, isEmergency);
        System.out.println("Entry Status: " + doorStatus);

        String roomAccess = RoomAccessController.checkRoomAccess(role, room);
        System.out.println("Room Access: " + roomAccess);

        if (role.equalsIgnoreCase("Guest")) {
            // Simulate a 4-hour guest visit
            String guestStatus = GuestRestrictions.getGuestPermissions(4, false);
            System.out.println("Guest Notice: " + guestStatus);
        }

        System.out.println("\n✅ Evaluation Complete. Enjoy your stay!");
    }
}
