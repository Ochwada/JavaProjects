package com.streamit;

import java.io.*;
import java.util.Scanner;

/**
 * *******************************************************
 * Package: com.streamit
 * File: StreamIt.java
 * Author: Ochwada
 * Date: Monday, 26.May.2025, 12:16 PM
 * Description: Mini Exercise: "Stream It Like You Mean It"
 * Objective:
 * *******************************************************
 */


public class StreamIt {
    public static void main(String[] args) {
        System.out.println("Mini Exercise: \"Stream It Like You Mean It\" ");

        String filePath = "reminder.txt";
        String message = "Hey Future Java Rockstars,\nRemember to close your streams and buffer your dreams!";

        String backupPath = "reminder_backup.txt";

        int bufferSize = 0;

        try {
            // Write content in a file
            System.out.println("Writing message to file...");
            writeContentToFile(filePath, message);

            // Read content from file
            System.out.println("\nReading message from file...");
            String result = readContentFromFile(filePath);
            System.out.println("✅ Content read:\n" + result);

            // Make a Copy of the filePath
            System.out.println("\nMaking a Copy of the File (using byte stream)...");
            copyFileUsingByte(filePath, backupPath, bufferSize);
            System.out.println("✅Backup of \"" + filePath + "\" Successfully done to: " + backupPath);


        } catch (IOException e) {
            System.err.println("\uD83D\uDD34 An Error occurred: " + e.getMessage());
        }
    }

    /**
     * Method to create a backup file of the filepath
     *
     * @param filePath   the source file.
     * @param backupPath the destination file.
     * @param size  the buffer size in bytes.
     */
    public static void copyFileUsingByte(String filePath, String backupPath, int size) throws IOException {

        Scanner scanner =  new Scanner(System.in);
        try(
                InputStream in = new BufferedInputStream( new FileInputStream(filePath));
                OutputStream out = new BufferedOutputStream(new FileOutputStream(backupPath));
                ) {
            // Core Logic
            System.out.println("Buffer Size? ");
            size = scanner.nextInt();
            byte[] buffer = new byte[size]; // controls size

            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

        }
    }

    /**
     * Method to READ content from a file
     *
     * @param filePath the file where the content is read from.
     */
    public static String readContentFromFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (
                BufferedReader reader = new BufferedReader(new FileReader(filePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }
        return content.toString();
    }

    /**
     * Method to WRITE content in a file
     *
     * @param filePath the path to the file the message is to be written in.
     * @param message  the message to be written in the {@code filePath}
     */
    public static void writeContentToFile(String filePath, String message) throws IOException {
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))
        ) {
            writer.write(message);

        }
    }
}
