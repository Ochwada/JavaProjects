public class GuestRestrictions {

    public static String getGuestPermissions(int hoursStayed, boolean isSupervised) {
        // Use nested if-else
        // if hours > 3 and supervised → "Allowed to stay"
        // if hours > 3 and not supervised → "Must leave soon"
        // else → "Enjoy your visit!"

        if (hoursStayed > 3) {
            if (isSupervised) {
                return "Allowed to stay";
            } else {
                return "Must leave soon";
            }
        } else {
            return "Enjoy your visit!";
        }
    }
}
