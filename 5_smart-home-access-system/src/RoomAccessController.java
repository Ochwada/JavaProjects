public class RoomAccessController {

    public static String checkRoomAccess(String role, String room) {
        // Use nested switch to determine room access based on role
        // Parent → All rooms
        // Child → Bedroom, Living Room
        // Guest → Guest Room, Living Room

        role = role.trim().toLowerCase();
        room = room.trim().toLowerCase();

        switch (role) {
            case "parent":
                switch (room) {
                    default:
                        return "Access Granted";
                }
            case "child":
                switch (room) {
                    case "bedroom", "living room":
                        return "Access Granted";
                    default:
                        return "Access Denied";
                }
            case "guest":
                switch (room) {
                    case "guest room", "living room":
                        return "Access Granted";
                    default:
                        return "Access Denied";
                }
        }
        return "Access not evaluated";
    }
}
