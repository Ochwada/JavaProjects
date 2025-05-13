/****************************************************
 * ScoreToGradeConverter.java
 * Author: Ochwada
 * Date: Tuesday, 25.Mar.2025, 15:20 hrs
 * Description: Task 1: Score to Grade Converter (if-else / nested if-else)
 * Objective: Convert a numeric score (0–100) into a letter grade.
 ***************************************************/


public class ScoreToGradeConverter {

    public static char getGrade(int score) {

        // Implement using nested if-else

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                return 'A';
            } else if (score >= 80) {
                return 'B';
            } else if (score >= 70) {
                return 'C';
            } else if (score >= 60) {
                return 'D';
            } else {
                return 'F';
            }
        }
        return ' '; // placeholder
    }

    // Optional Bonus
    public static double getGPA(int score) {
        // Implement using nested ternary
        return (score >= 0 && score <= 100) ?
                (score >= 90) ? 4.00 :
                        (score >= 80) ? 3.00 :
                                (score >= 70) ? 2.00 :
                                        (score >= 60) ? 1.00 :
                                                0 : 00;


    }
}
