/****************************************************
 * TurnoutAnalyzer.java
 * Author: Ochwada
 * Date: Monday, 24.Mar.2025, 14:45
 * Description: Task 4: Turnout Analyzer
 * Objective: Analyze voter turnout based on registered vs. actual voters ( use ternary )
 ***************************************************/

public class TurnoutAnalyzer {

    public static String turnoutMessage(int registered, int voted){
        double results  = ((double) voted /registered)  * 100 ;

        System.out.println("Percentage Results: " + results);
        return ( results > 70) ? "High Turnout" :
                (results >= 40 ) ? "Moderate Turnout":
                        "Low Turnout";

    }

    public static String turnoutMessage_IfStatement(int registered, int voted){
        double results  = ((double) voted /registered)  * 100 ;

        System.out.println("Percentage Results: " + results);

        if (results > 70) {
            return "High Turnout";
        }else if (results >= 40) {
            return "Moderate Turnout";
        }else
            return "Low Turnout";
    }

    public static void main(String[] args) {
        System.out.println( turnoutMessage(200, 167));
        System.out.println( turnoutMessage(200, 100));
        System.out.println( turnoutMessage(200, 67));
        System.out.println();

        System.out.println( turnoutMessage_IfStatement(200, 167));
        System.out.println( turnoutMessage_IfStatement(200, 100));
        System.out.println( turnoutMessage_IfStatement(200, 67));

        
    }
}
