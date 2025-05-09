public class LogicChecker {

    public static String classifyUsage(int units) {
        // Use nested if-else and logical operators to classify usage
        boolean isOverBudget = true;

        if (units > 400 && isOverBudget) {
            return "Critical";
        } else {
            if (units > 300) {
                return "Excessive";
            } else if (units >= 201 && units <= 300) {
                return "High";
            } else if (units >= 101 && units <= 200) {
                return "Moderate";
            } else
                return "Low";
        }
    }

    public static void main(String[] args) {
        System.out.println(classifyUsage(500));

    }
}
