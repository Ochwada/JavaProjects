
/****************************************************
 * DailyReportGenerator.java
 * Author: Ochwada
 * Date: Tuesday, 25.Mar.2025, 13:52
 * Description: Task 5: Daily Budget Report Generator (uses all)
 * Objective: Generate a daily report for each family member.
 ***************************************************/

public class DailyReportGenerator {

    private String name;
    private String role;
    private int age;
    private double amount;

    // Constructor
    public DailyReportGenerator(String name, String role, int age, double amount) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.amount = amount;
    }

    // ------------------- Creating Setters and Getters -------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    // ------------------- -------------------  -------------------

    SpendingCategorizer categoryObj = new SpendingCategorizer();
    RoleSpendingPolicy roleObj = new RoleSpendingPolicy();
    BudgetStatusChecker checkObj = new BudgetStatusChecker();
    RoleBasedSuggestions suggestionsObj = new RoleBasedSuggestions();

    public void FinalDailyReport() {
        double limit = roleObj.getSpendingLimit(role); //
        boolean isOverBudget = limit <= amount; // limit should less or = amount.


        System.out.println("Name: " + name + " | Role: " + role);
        System.out.println("Spending: €" + amount + " -> " + categoryObj.getSpendingCategory(amount));
        System.out.println("Status: " + checkObj.checkBudgetStatus(amount, limit));
        System.out.println("Suggestion: " + suggestionsObj.suggestAction(role, age, isOverBudget));
        System.out.println();
    }

    public static void main(String[] args) {

        DailyReportGenerator familyMember1 = new DailyReportGenerator("Linda", "Parent", 26, 700);
        DailyReportGenerator familyMember2 = new DailyReportGenerator("Ashly", "Child ", 6, 200);
        DailyReportGenerator familyMember3 = new DailyReportGenerator("Sally", "TEEN ", 15, 99);

        familyMember1.FinalDailyReport();
        familyMember2.FinalDailyReport();
        familyMember3.FinalDailyReport();


    }
}
