package com.example.exercises;


import java.util.*;

/**
 * *******************************************************
 * Package: com.example.exercises
 * File: StringDrill.java
 * Author: Ochwada
 * Date: Monday, 12.May.2025, 2:30 PM
 * Description: Java String Methods Drill Sheet
 * Problem Background: You are given a list of simple String processing tasks often seen in data validation, filtering, and reporting.
 * * These are the kinds of operations you would do when building backend APIs, forms, or search features.
 * Objective: Implement each method using core String methods. Use inline comments to explain your logic.
 * *******************************************************
 */

public class StringDrill {


    /**
     * Returns true if the input string is a palindrome (reads the same forwards and backwards).
     * <p>
     * Theory: Use String reversal and comparison.
     * Use Case: Username or token symmetry validation.
     *
     * @param input the string to check
     * @return true if palindrome, false otherwise
     */

    public boolean isPalindrome(String input) {
        // Step 1: Normalize case
        String normalized  = input.toLowerCase();

        // Step 2: Remove all spaces
        String removeSpaces = normalized.trim().replace(" ", "");

        // Debug prints
        System.out.println("Normalized and Spaces Removed:   " + removeSpaces);

        // Step 3: Reverse the string and compare to original
        String reverseInput = "";
        for (int i = removeSpaces.length()-1; i >=0; i--){
            reverseInput += removeSpaces.charAt(i);
        }

        System.out.println("Reversed:   " + reverseInput);

        // Check if they match
        System.out.println("Is palindrome? " + removeSpaces.equals(reverseInput));
        return removeSpaces.equals(reverseInput);
    }

    /**
     * Replaces all vowels in a string with '*'.
     * <p>
     * Theory: Regular expressions can help pattern match vowels.
     * Use Case: Censoring user content.
     *
     * @param input the original string
     * @return string with vowels replaced
     */
    public String replaceVowels(String input) {
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

        for(String vowel: vowels){

            input = input.replace(vowel, "*");
        }

        return input;
    }

    /**
     * Capitalizes the first letter of each word in the sentence.
     * <p>
     * Theory: Split string by spaces, capitalize each word, and re-join.
     * Use Case: Formatting names or titles.
     *
     * @param sentence input sentence
     * @return transformed sentence
     */
    public String capitalizeWords(String sentence) {
        // Use split and loop through words
       String[] words =  sentence.split(" ");

        StringBuilder result = new StringBuilder();

       for (String word : words){
           if(!word.isEmpty()){
               result.append(Character.toUpperCase(word.charAt(0)));
               if (word.length() > 1) {
                   result.append(word.substring(1).toLowerCase());
               }
               result.append(" ");
           }
       }

        return result.toString().trim();
    }

    /**
     * Counts how many times a specific word appears in the sentence (case-insensitive).
     * <p>
     * Theory: Normalize and use split to count matches.
     * Use Case: Analytics and keyword frequency.
     *
     * @param sentence full sentence
     * @param word     word to search
     * @return count of occurrences
     */
    public int countWordOccurrences(String sentence, String word) {
        String[] words = sentence.toLowerCase().split(" ");
        String target = word.toLowerCase();
        int count = 0;

        for (String chr : words) {
            if (chr.equals(target)) {
                count++;
            }
        }

        return count;
    }
}
