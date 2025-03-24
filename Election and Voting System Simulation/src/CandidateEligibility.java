/****************************************************
 * CandidateEligibility.java
 * Author: Ochwada
 * Date: Monday, 24.Mar.2025, 15:00
 * Description: Task 5: Candidate Eligibility Checker
 * Objective: Check if a person is eligible to run for office.
 ***************************************************/

public class CandidateEligibility {
    public static String isEligibleCandidate(int age, boolean citizen, boolean criminalRecord){
        return ( age >= 30 && citizen && !criminalRecord ) ? "Eligible" : "Not Eligible";
    }
    public static String isEligibleCandidate_IfStatement(int age, boolean citizen, boolean criminalRecord){
        if (age >= 30 && citizen && !criminalRecord){
            return "Eligible";
        }else
            return "Not Eligible";
    }

    public static void main(String[] args) {
        System.out.println( isEligibleCandidate(30, true, false));
        System.out.println( isEligibleCandidate(20, true, true));
        System.out.println( isEligibleCandidate(35, true, false));


        System.out.println();

        System.out.println( isEligibleCandidate_IfStatement(30, true, false));
        System.out.println( isEligibleCandidate_IfStatement(20, true, true));
        System.out.println( isEligibleCandidate_IfStatement(35, true, false));
        
    }
}
