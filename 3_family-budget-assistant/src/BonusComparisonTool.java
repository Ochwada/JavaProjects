/****************************************************
 * BonusComparisonTool.java 
 * Author: Ochwada
 * Date: Tuesday, 25.Mar.2025, 15:06 hrs
 * Description: 
 * Objective:
 ***************************************************/

public class BonusComparisonTool {
    public static String compareSpending(String name1, double amt1, String name2, double amt2) {
        return (amt1 == amt2) ?
                name1 + " and " + name2 + " Both Spent Equally" :
                (amt1 > amt2) ?
                        name1 + " spent more than " + name2 :
                        name2 + " spent more than " + name1;

    }

    public static void main(String[] args) {
        System.out.println(compareSpending("Linda", 150.0, "Ashly", 150.0));   // Both spent equally
        System.out.println(compareSpending("Shammah", 200.0, "Samiah", 150.0));   // Alice spent more than Bob
        System.out.println(compareSpending("Philipp", 120.0, "Monica", 180.0));   // Bob spent more than Alice
    }
}
