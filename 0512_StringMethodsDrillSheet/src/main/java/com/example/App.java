package com.example;
import java.util.*;
import com.example.exercises.*;


/**
 * *******************************************************
 * Package: com.example.exercises
 * File: App.java
 * Author: Ochwada
 * Date: Monday, 12.May.2025, 3:43 PM
 * Description:
 * Objective:
 * *******************************************************
 */

public class App {
    public static void main(String[] args) {
        System.out.println("=== StringDrill ===");

        Scanner scanner = new Scanner(System.in);
        StringDrill drill = new StringDrill();

        System.out.println("Write your String input: ");
        String input = scanner.nextLine();

        //input =  "Was it a car or a cat I saw"

        // drill.isPalindrome(input);
        //System.out.println(drill.replaceVowels(input));
        //System.out.println(drill.capitalizeWords(input));
        System.out.println(drill.countWordOccurrences(input, "a"));





    }
}

