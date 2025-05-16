package com.reportformatter.assignment;


/**
 * *******************************************************
 * Package: com.reportformatter.assignment
 * File: ReportFormatter.java
 * Author: Ochwada
 * Date: Thursday, 15.May.2025, 9:27 AM
 * Description: ReportFormatter combines String methods with StringBuilder & StringBuffer.
 * Objective:
 * *******************************************************
 */

public class ReportFormatter {

    /**
     * Cleans the report title using String methods only.
     *
     * - Remove leading/trailing whitespace
     * - Replace spaces with hyphens
     * - Convert to lowercase
     *
     * @param rawTitle the original, unformatted title
     * @return formatted title string
     */
    public static String cleanTitle(String rawTitle) {
        // Step 1: Trim leading and trailing whitespace
        String trimmed = rawTitle.trim();

        // Step 2: Replace internal spaces with hyphens
        String replaced = trimmed.replaceAll("\\s+", "-");

        // Step 3: Convert to lowercase
        return replaced.toLowerCase();
    }

    /**
     * Combines multiple paragraphs into a single formatted report body.
     * Uses StringBuilder for efficient joining.
     *
     * - Paragraphs separated by two new lines (\n\n)
     *
     * @param paragraphs array of paragraph strings
     * @return single formatted body string
     */
    public static String formatBody(String[] paragraphs) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < paragraphs.length; i++) {
            builder.append(paragraphs[i]);
            // Add double newline unless it's the last paragraph
            if (i != paragraphs.length - 1) {
                builder.append("\n\n");
            }
        }

        return builder.toString();
    }

    /**
     * Appends a footer to a report using StringBuffer for thread safety.
     *
     * @param reportBody the original report content
     * @param footer additional text to append (e.g., disclaimer)
     * @return full report with footer appended
     */
    public static String appendFooterThreadSafe(String reportBody, String footer) {
        StringBuffer buffer = new StringBuffer(reportBody);

        buffer.append("\n").append(footer);

        return buffer.toString();
    }

    // demo method for local testing
    public static void main(String[] args) {
        String title = ReportFormatter.cleanTitle("  Quarterly Inventory Review  ");
        System.out.println("Cleaned Title: " + title);

        String body = ReportFormatter.formatBody(new String[]{
                "Warehouse stock has improved.",
                "Surplus expected in next month."
        });
        System.out.println("\nFormatted Body:\n" + body);

        String fullReport = ReportFormatter.appendFooterThreadSafe(body, "--- Reviewed by Ops ---");
        System.out.println("\nFull Report:\n" + fullReport);
    }
}