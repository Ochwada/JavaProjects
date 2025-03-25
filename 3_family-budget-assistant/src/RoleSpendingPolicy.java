
/****************************************************
 * RoleSpendingPolicy.java
 * Author: Ochwada
 * Date: Tuesday, 25.Mar.2025, 12:51
 * Description: Task 2: Role Spending Policy (switch statement)
 * Objective: Set spending limits based on family roles.
 ***************************************************/

public class RoleSpendingPolicy {

    public static double getSpendingLimit(String role) {
        /*if (role == null) {
            return 75;
        }*/
        switch (role.trim().toLowerCase()) {
            case "parent":
                return 200;
            case "teen":
                return 100;
            case "child":
                return 50;
            default:
                return 75;
        }
    }

    public static void main(String[] args) {
        System.out.println("Parent: €" + getSpendingLimit("Parent"));
        System.out.println("Teen: €" + getSpendingLimit("TEEN "));
        System.out.println("Child: €" + getSpendingLimit("Child"));
        System.out.println("Guest: €" + getSpendingLimit("Guest"));
        // System.out.println("Guest: €" + getSpendingLimit(null));


    }
}
