package com.hashtag.exercises;


/**
 * *******************************************************
 * Package: com.hashtag.exercises
 * File: HashtagFormatter.java
 * Author: Ochwada
 * Date: Wednesday, 14.May.2025, 9:32 AM
 * Description:📢 Hashtag Formatter using StringBuilder
 * Objective:
 * *******************************************************
 */

public class HashtagFormatter {
    /**
     * Converts a sentence to a hashtag-style string.
     *
     * @param sentence the original sentence
     * @return formatted hashtag or null if input is invalid or too long
     */
    public static String formatHashtag(String sentence){
        if(sentence == null || sentence.trim().isEmpty()){
            return null;
        }
        sentence = sentence.trim();
        String[] words = sentence.split("\\s+"); // Split on one or more spaces

        StringBuilder hashtag = new StringBuilder("#");

        for (String word : words){
            if(!word.isEmpty()){
                hashtag.append(word.toLowerCase()).append("-");
            }
        }
        // Remove trailing hyphen if added
        if (hashtag.charAt(hashtag.length() - 1) == '-') {
            hashtag.deleteCharAt(hashtag.length() - 1);
        }

        // Return null if hashtag exceeds 50 characters
        return hashtag.length() <= 50 ? hashtag.toString() : null;
    }
}
