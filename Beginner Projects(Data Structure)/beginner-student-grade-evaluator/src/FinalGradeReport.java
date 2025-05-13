import java.util.Scanner;

public class FinalGradeReport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter score (0-100): ");
        int score = scanner.nextInt();

        System.out.print("Perfect attendance? (true/false): ");
        boolean hasPerfectAttendance = scanner.nextBoolean();

        // Step 2: Use other classes/methods
        char grade = ScoreToGradeConverter.getGrade(score);
        double gpa = ScoreToGradeConverter.getGPA(score);
        String passFail = PassFailChecker.checkPassFail(score);
        String feedback = GradeFeedbackSwitch.getFeedback(grade);
        boolean honors = HonorsEligibilityChecker.isEligibleForHonors(score, hasPerfectAttendance);

        // Step 3: Print Report
        System.out.println("\n--- Final Report ---");
        System.out.println("Student: " + name);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);
        System.out.println("Result: " + passFail);
        System.out.println("Feedback: " + feedback);
        System.out.println("Honors: " + (honors ? "Eligible ✅" : "Not Eligible ❌"));

        scanner.close();
    }
}
