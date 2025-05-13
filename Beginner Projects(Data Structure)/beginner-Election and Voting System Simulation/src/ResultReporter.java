/****************************************************
 * ResultReporter.java
 * Author: Ochwada
 * Date: Monday, 24.Mar.2025, 15:22
 * Description: Task 6: Result Reporter
 * Objective: Compare votes between two candidates and declare a winner or a tie.
 ***************************************************/

public class ResultReporter {

    public static String reportResult(int votesA, int votesB){
        return (votesA > votesB) ? "Candidate A Wins " :
                (votesB > votesA ) ? "Candidate B Wins ":
                        "Tie";
    }

    public static String reportResult_IfStatement(int votesA, int votesB){
        if(votesA > votesB){
            return "Candidate A Wins ";
        } else if (votesB > votesA) {
            return "Candidate B Wins ";
        }else
            return "Tie";
    }
    public static void main(String[] args) {

       System.out.println(reportResult(100, 3000));
       System.out.println(reportResult(10000, 3000));
       System.out.println(reportResult(3000, 3000));

       System.out.println();
       System.out.println(reportResult_IfStatement(100, 3000));
       System.out.println(reportResult_IfStatement(10000, 3000));
       System.out.println(reportResult_IfStatement(3000, 3000));


    }
}
