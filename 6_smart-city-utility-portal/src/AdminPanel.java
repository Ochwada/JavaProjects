public class AdminPanel {

    public static String adminMenu(String role, int action) {
        // Use switch(role) and nested switch(action)
        role = role.trim().toLowerCase();

        switch (role) {
            case "super admin":
                switch (action) {
                    case 1:
                        return "Can view users";
                    case 2:
                        return "Reset data";
                }

            case "moderator":
                switch (action) {
                    case 1:
                        return "Can only view users";
                    default:
                        return "Invalid action for moderator";
                }

            default:
                return "Denied";
        }
    }

}