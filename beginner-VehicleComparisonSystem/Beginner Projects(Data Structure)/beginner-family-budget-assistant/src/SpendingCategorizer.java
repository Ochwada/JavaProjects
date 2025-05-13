/****************************************************
 * SpendingCategorizer.java
 * Author: Ochwada
 * Date: Tuesday, 25.Mar.2025, 12:40
 * Description: Task 1: Spending Categorizer (if-else logic)
 * Objective: Determine the spending level based on the amount spent.
 ***************************************************/


public class SpendingCategorizer {

    public static String getSpendingCategory(double amount) {
        if (amount < 50) {
            return "Low";
        } else if (amount <= 150) {
            return "Medium";
        } else {
            return "High";
        }
    }

    public static void main(String[] args) {

        System.out.println(getSpendingCategory(10804));

    }
}
