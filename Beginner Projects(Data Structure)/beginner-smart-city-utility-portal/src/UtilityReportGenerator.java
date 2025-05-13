public class UtilityReportGenerator {

    public static String generateReport(String name, int units, boolean isOverBudget) {
        //  Call BillingCalculator, LogicChecker, and format report string

        StringBuilder report = new StringBuilder();

        // Welcome Message
        report.append("Utility Usage Report\n");
        report.append("Hello, ").append(name).append("!\n");

        // Classification Usage
        String usageLevel = LogicChecker.classifyUsage(units);
        report.append("Usage Level: ").append(usageLevel).append("\n");

        // Bill Calculator
        double totalBill = BillingCalculator.calculateBill(units);
        report.append(String.format("Total Bill: ₹%.2f\n", totalBill));

        // Budget Status
        report.append("Budget Status: ").append(isOverBudget ? "Over Budget" : "Within Budget").append("\n");

        return report.toString();
    }

    /*public static void main(String[] args) {
        System.out.println(generateReport("Linda", 270, true));
        System.out.println(generateReport("David", 90, false));
        System.out.println(generateReport("Asha", 410, true));
    }*/
}

