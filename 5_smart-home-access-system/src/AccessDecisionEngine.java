public class AccessDecisionEngine {

    public static String canEnter(boolean hasKeycard, boolean faceRecognized) {
        //  Use logical operator + ternary
        // Return "Access Granted" or "Access Denied"
        return (hasKeycard && faceRecognized) ? "Access Granted " : "Access Denied";
    }

    // Bonus method with emergency override
    public static String canEnter(boolean hasKeycard, boolean faceRecognized, boolean isEmergency) {

        return (isEmergency) ? "Emergency Override: Entry Granted" :
                (hasKeycard && faceRecognized) ? "Access Granted " : "Access Denied";


    }

   /* public static void main(String[] args) {
        System.out.println(canEnter(true, true, true));
    }*/
}
