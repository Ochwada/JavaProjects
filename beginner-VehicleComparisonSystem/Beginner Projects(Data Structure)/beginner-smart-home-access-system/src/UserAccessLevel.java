public class UserAccessLevel {

    public static String getAccessLevel(String role) {
        //  Use if-else or nested if-else to return access level


        role = role.trim().toLowerCase();
        
        if (role == null) {
            return "Access level not determined";
        }

        if (role.equals("parent")) {
            return "Full Access";
        } else if (role.equals("child")) {
            return "Limited Access";
        } else if (role.equals("guest")) {
            return "Guest Access";
        } else {
            return "No Access";
        }


    }
}
