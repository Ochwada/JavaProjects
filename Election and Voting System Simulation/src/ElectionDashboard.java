/****************************************************
 * ResultReporter.java
 * Author: Ochwada
 * Date: Monday, 24.Mar.2025, 15:22
 * Description: Task 7: Election Dashboard
 * Objective: Bring it all together! Simulate a full vote from start to end.
 ***************************************************/

public class ElectionDashboard {

    public static boolean validateBallot(boolean filledCorrectly, boolean hasSignature){
        //helper method changing String to boolean
        return BallotValidator.validateBallot(filledCorrectly, hasSignature).equals("Filled Correctly");
    }


    public static void main(String[] args) {
        // 1. Check voter eligibility
        if (VoterEligibility.isEligible(20, true)) {  // if eligible is true

            // 2. Validate ballot
            if (validateBallot(true, true)) {

                System.out.println("Valid Ballot");

                // 3. Process vote
                System.out.println(VoteProcessor.processVote("Shammah"));

                // 4. Compare results
                System.out.println(ResultReporter.reportResult(250, 300));

                // 5. Report turnout status
                TurnoutAnalyzer.turnoutMessage(1000, 800);

            } else {
                System.out.println("Ballot validation failed. Process terminated.");
            }

        } else {
            System.out.println("Voter is not eligible. Process terminated.");
        }
    }

    /*public static void main(String[] args) {
        // Simulation

        // 1. Check voter eligibility
        VoterEligibility.isEligible(20, true);

        // 2. Validate ballot
        System.out.println(BallotValidator.validateBallot(true, true));

        // 3. Process vote
        System.out.println(VoteProcessor.processVote("Linda"));

        // 4. Compare results
        System.out.println(ResultReporter.reportResult(250, 300));

        // 5. Report turnout status
        TurnoutAnalyzer.turnoutMessage(1000, 800);
    }*/
}
