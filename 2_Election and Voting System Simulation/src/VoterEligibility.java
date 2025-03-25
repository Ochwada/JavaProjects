/****************************************************
 * VoterEligibility.java
 * Author: Ochwada
 * Date: Monday, 24.Mar.2025, 14:20
 * Description: Task 1: Voter Eligibility Checker
 * Objective: Check if a user is allowed to vote.
 ***************************************************/

public class VoterEligibility {

    public static boolean isEligible(int age, boolean hasID){
        if (age >= 18 && hasID){
            System.out.println("Eligible");
            return true;
        }else {
            System.out.println("Not Eligible");
            return false;
        }
    }

    public static boolean isEligible_Ternary (int age, boolean hasID){
        boolean eligible  = (age >= 18 && hasID) ? true : false ;
        System.out.println(eligible ? "Eligible" : "Not Eligible" );
        return eligible;

    }

    // Main Method
    public static void main(String[] args) {

        isEligible(20, true);
        isEligible(32, true);
        isEligible(18, false);
        isEligible(17, true);
        System.out.println();

        isEligible_Ternary(20, true);
        isEligible_Ternary(32, true);
        isEligible_Ternary(18, false);
        isEligible_Ternary(17, true);
        
    }
}

