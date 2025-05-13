public class GradeFeedbackSwitch {

    public static String getFeedback(char grade) {
        // Implement using switch statement
        switch (grade) {
            case 'A':
                return "Excellent!";
            case 'B':
                return "Great job!";
            case 'C':
                return "Good effort";
            case 'D':
                return "Needs improvement";
            case 'F':
                return "Failed. Let's study harder!";
            default:
                return "Invalid grade";
        }
    }
}
