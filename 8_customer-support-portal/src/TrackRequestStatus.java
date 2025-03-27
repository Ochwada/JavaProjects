
/****************************************************
 * TrackRequestStatus.java 
 * Author: Ochwada
 * Date: Thursday, 27.Mar.2025, 15:03 hrs
 * Description: 
 * Objective:
 ***************************************************/

import java.util.Scanner;

public class TrackRequestStatus {

    // ------------------Variables (Global)------------------------------
    static boolean hasOpenRequest = true;
    static int requestId = 1001;
    static String requestContent = "";
    static Scanner input = new Scanner(System.in);

    public static boolean hasRequestOpen() {
        return hasOpenRequest;
    }
    // ------------------------------------------------------------------------
    //  ------- Case 1: Track Request Status in  - Submit New Request

    static void newRequest() {
        if (hasOpenRequest) {
            System.out.println("You already have an open request (ID: " + requestId + "). Please close it first.");
        } else {
            System.out.println(" ----  New Request ---- ");
            requestContent = input.nextLine();

            hasOpenRequest = true;
            System.out.println("Request submitted successfully!");
            System.out.println("Request ID: " + requestId);
            System.out.println("Request Details: " + requestContent);
        }
    }

    // ------------------------------------------------------------------------
    //  -------Case2: Track Request Status in - View Request Status  -------
    static void submitRequest() {

        if (hasOpenRequest) {
            OverloadedMethodPrintStatus.printStatus(requestId, requestContent);
        } else
            OverloadedMethodPrintStatus.printStatus();
    }

    // ------------------------------------------------------------------------
    //  -------Case 3: Track Request Status in - Close Request -------
    static void closeRequest() {

        if (hasOpenRequest) {
            hasOpenRequest = false;
            System.out.println("Request ID #" + requestId + " has been marked as resolved. Thank you!");
            requestId++;
            requestContent = "";
        } else
            System.out.println("❌ No open request to close.");

    }
    // ------------------------------------------------------------------------


}
