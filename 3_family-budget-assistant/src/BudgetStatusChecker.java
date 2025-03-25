/****************************************************
 * BudgetStatusChecker.java
 * Author: Ochwada
 * Date: Tuesday, 25.Mar.2025, 13:23
 * Description: Task 3: Budget Status Checker (ternary + logic)
 * Objective: Check if a person stayed within their budget.
 ***************************************************/

public class BudgetStatusChecker {
    public static String checkBudgetStatus(double amountSpent, double limit) {
        return (amountSpent <= limit) ? "Within Budget" : "Over Budget";
    }

    public static void main(String[] args) {
        System.out.println(checkBudgetStatus(100.0, 100.0));
        System.out.println(checkBudgetStatus(20.0, 50.0));
        System.out.println(checkBudgetStatus(50.0, 20.0));

    }
}
