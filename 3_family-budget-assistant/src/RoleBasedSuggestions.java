/****************************************************
 * RoleBasedSuggestions.java
 * Author: Ochwada
 * Date: Tuesday, 25.Mar.2025, 13:28
 * Description: Task 4: Role-Based Suggestions (nested if-else + logic operators)
 * Objective: Give suggestions based on age, role, and budget status.
 ***************************************************/

public class RoleBasedSuggestions {

    public static String suggestAction(String role, int age, boolean isOverBudget) {

        role = role.trim().toLowerCase();

// Breaking down -- try with tenary
        if (isOverBudget) {
            if (role.equals("parents") || age >= 20) {
                return "Parent: Adjust future planning";
            } else if (role.equals("child") && age <= 12) {
                return "Child: Ask your parents first";
            } else if (role.equals("teen") || (age <= 19 && age >= 13)) {
                return "Teen: Review your spending habits";
            } else {
                return "All good";
            }
        }
        return "All good";
    }

    public static String suggestActionTernary(String role, int age, boolean isOverBudget) {
        role = role.trim().toLowerCase();

        return (isOverBudget) ?
                (role.equals("parents") || (age >= 20)) ? "Parent: Adjust future planning" :
                        (role.equals("teen") && (age <= 19 && age >= 13)) ? "Teen: Review your spending habits" :
                                (role.equals("child") && (age <= 12)) ? "Child: Ask your parents first" :
                                        "All good" :
                "All good";

    }

    public static void main(String[] args) {
        System.out.println(suggestAction("Parent", 35, true));     // Parent: Adjust future planning
        System.out.println(suggestAction("Teen", 16, true));       // Teen: Review your spending habits
        System.out.println(suggestAction("Child", 10, true));      // Child: Ask your parents first
        System.out.println(suggestAction("Unknown", 22, false));   // All good
        System.out.println(suggestAction("  teen ", 14, true));    // Teen: Review your spending habits

        System.out.println();

        System.out.println(suggestActionTernary("Parent", 35, true));     // Parent: Adjust future planning
        System.out.println(suggestActionTernary("Teen", 16, true));       // Teen: Review your spending habits
        System.out.println(suggestActionTernary("Child", 10, true));      // Child: Ask your parents first
        System.out.println(suggestActionTernary("Unknown", 22, false));   // All good
        System.out.println(suggestActionTernary("  teen ", 14, true));    // Teen: Review your spending habits
    }


}
