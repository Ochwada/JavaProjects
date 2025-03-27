/****************************************************
 * OverloadedMethodPrintStatus.java 
 * Author: Ochwada
 * Date: Thursday, 27.Mar.2025, 16:09 hrs
 * Description: 
 * Objective:
 ***************************************************/

public class OverloadedMethodPrintStatus {
    // -------------------------------------------------------------
    // -------------- Overloaded Method printStatus() --------------

    static void printStatus() {
        System.out.println("No Requests Yet");
    }

    public static void printStatus(int id, String description) {

        String status = TrackRequestStatus.hasRequestOpen() ? "Open" : "Closed";

        System.out.println("Request ID: " + id + " | Ticket Status: " + status);
        System.out.println("Request Details: " + description);
    }

}
