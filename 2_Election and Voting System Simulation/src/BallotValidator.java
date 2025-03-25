/****************************************************
 * BallotValidator.java
 * Author: Ochwada
 * Date: Monday, 24.Mar.2025, 14:34
 * Description: Task 2: Ballot Validation
 * Objective: Determine if a submitted ballot is valid.
 ***************************************************/

public class BallotValidator {

    public static String validateBallot(boolean filledCorrectly, boolean hasSignature){
        if (filledCorrectly && hasSignature){
            return "Filled Correctly";
        }else {
            return "Invalid Ballot";
        }
    }

    public static String validateBallot_Ternary(boolean filledCorrectly, boolean hasSignature){
       return (filledCorrectly && hasSignature) ? "Filled Correctly" : "Invalid Ballot";
    }

    public static void main(String[] args) {
        System.out.println(validateBallot(true, false));
        System.out.println(validateBallot(true, true));
        System.out.println(validateBallot(false, false));
        System.out.println(validateBallot(false, true));
        System.out.println();

        System.out.println(validateBallot_Ternary(true, false));
        System.out.println(validateBallot_Ternary(true, true));
        System.out.println(validateBallot_Ternary(false, false));
        System.out.println(validateBallot_Ternary(false, true));
        
    }
}
