/****************************************************
 * VoteProcessor.java
 * Author: Ochwada
 * Date: Monday, 24.Mar.2025, 14:38
 * Description: Task 3: Vote Processor
 * Objective: Record a vote and determine whether it's a vote for a candidate or a spoiled vote.
 ***************************************************/


public class VoteProcessor {

    public static String processVote(String selectedCandidate){

        if (selectedCandidate == null || selectedCandidate.trim().isEmpty()){
            return "Spoiled Vote";
        }else{
            return "Vote Recorded";
        }
    }

    public static String processVote_Ternary(String selectedCandidate){
        return (selectedCandidate == null || selectedCandidate.trim().isEmpty()) ? "Spoiled Vote" : "Vote Recorded";
    }


    public static void main(String[] args) {

        System.out.println(processVote("Linda"));
        System.out.println(processVote(" "));
        System.out.println(processVote(null));
        System.out.println();

        System.out.println(processVote_Ternary("Linda"));
        System.out.println(processVote_Ternary(" "));
        System.out.println(processVote_Ternary(""));



    }
}
