public class SmartMeter {

    public static void logUsage(String name, int units) {
        // Log user name and usage
        System.out.println(name + " used " + units + " units.");
    }

    public static void logUsage(String name, int day, int units) {
        // Overloaded version with day
        System.out.println(name + " used " + units + " units on day " + day + ".");
    }
    
}
