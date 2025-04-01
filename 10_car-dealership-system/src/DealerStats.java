public class DealerStats {

    // ================================
    // 🔧✅ Task 9: Utility Class
    // ================================

    //  Add static method printWelcomeMessage()
    // Example: "Welcome to [Dealer Name] - Powered by Java OOP!"
    static void printWelcomeMessage(){
        String newDealerName = DealershipApp.newDealership();

        System.out.println(
                "\uD83D\uDE97 Welcome to " + newDealerName + " Car Dealer App \uD83D\uDE99");

    }

    // Add static method printSummary()
    // Example: Print total number of cars, maybe a hardcoded summary string
    public static void printSummary(){
        System.out.println();
        System.out.println("=== Dealership Summary ===");
        System.out.println("Dealer Name: " + Car.dealerName);
        System.out.println("Total Number of Cars: " + Car.totalCarsCreated++);
        System.out.println("Thank you for using our Car Dealer App!");
    }


    // BONUS✅ : Optional static method setDealerName(String) by calling Car's static method

    // Make constructor private to prevent instantiation
}
