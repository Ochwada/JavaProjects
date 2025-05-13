public class ResidentDashboard {

    public static void showWelcome(String name) {
        // Print a welcome message
        System.out.println("Welcome, " + name + "!");
    }

    public static int getDaysSinceLastReading(int lastDay) {
        // Calculate number of days (Assume current day = 30)
        int currentDay = 30;
        int daysPassed = currentDay - lastDay;
        return daysPassed;
    }
}
