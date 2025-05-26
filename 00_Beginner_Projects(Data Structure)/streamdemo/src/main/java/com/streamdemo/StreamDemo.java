package com.streamdemo;

import java.io.*; // input/output

/**
 * *******************************************************
 * Package: com.streamdemo
 * File: StreamDemo.java
 * Author: Ochwada
 * Date: Monday, 26.May.2025, 9:46 AM
 * Description: Demonstrate basic byte and character stream operations in Java
 * Objective:
 * *******************************************************
 */


public class StreamDemo {
    public static void main(String[] args) {
        System.out.println("Stream Demo");


        String filePath = "message.txt";
        String copyPath = "message_copy.txt";

        String message = "Dear Java Developer, \nWelcome to the world of Streams! \n";

        try {
            System.out.println("Writing message to file...");
            writeTextToFile(filePath, message);


            // Reading from a file
            System.out.println("Reading message from file...");
            String result = readTextFromFile(filePath);
            System.out.println("Content read:\n" + result);

            // Copying the file
            System.out.println("Copying the file using byte stream..");
            copyFileUsingByte(filePath, copyPath);
            System.out.println("✅ File copied Successfully to: " + copyPath);


        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }


    }

    /**
     * Copy a file from one location to another using a byte stream.
     * Copy a file using buffered byte streams for efficient binary file transfer.
     * <p>
     * This method reads raw binary data from the source file (sourcePath)
     * and writes it to the destination file (destPath) byte by byte.
     * It works with all file types, including text, images, videos, etc.
     * <p>
     * Byte streams are used here because they operate on 8-bit bytes,
     * making them ideal for copying both binary and text files without
     * worrying about character encoding.
     *
     * @param sourcePath the path of the source file to be copied.
     * @param destPath   the path of the destination file where the copy will be saved.
     * @throws IOException if the source file can't be read or the destination can't be written to.
     */
    public static void copyFileUsingByte(String sourcePath, String destPath) throws IOException {


        // Why Byte Stream:
        // 1. We are working with binary/raw data — we don't want to interpret the data as characters (like with text files).
        // 2. Byte streams work for all file types: text, images, videos, PDFs, etc.
        // 3. They are generally faster and more memory-efficient, especially when used with buffering.
        // 4. The Byte Stream processes raw data as bytes, unlike character streams which decode to text.

        // BufferedInputStream:
        // Adds buffering to FileInputStream and reduces the number of disk access operations
        // by reading large chunks of bytes into memory at once.

        // BufferedOutputStream:
        // Buffers bytes before writing them to disk. Instead of writing each byte directly to the file,
        // it collects bytes into a memory buffer and writes them in larger, more efficient chunks.
        //

        try (
                InputStream in = new BufferedInputStream(new FileInputStream(sourcePath));
                OutputStream out = new BufferedOutputStream(new FileOutputStream(destPath))
        ) {
            // Core Logic:
            byte[] buffer = new byte[1024]; // Buffer to hold chunks of bytes (1KB buffer)
            int length;

            // Read from the input stream (Source Path) into the buffer,
            // then write from the buffer to the output stream (Destination Path)
            while ((length = in.read(buffer)) > 0) {
                // length = in.read(buffer)) > 350 (at the end of the Source file.)
                out.write(buffer, 0, length); // Only 350 bytes will be written
            }
        }

    }

    /**
     * Write text to a file using character stream.
     *
     * @param filePath: A String input that tells the method where the file is located.
     * @throws IOException: If there's an error reading the file, the method throws an exception rather than handling it inside.
     */

    public static String readTextFromFile(String filePath) throws IOException {
        // Creates a StringBuilder to efficiently collect text line by line.
        // StringBuilder is preferred over String += in loops for performance.
        StringBuilder content = new StringBuilder();

        // BufferedReader: A fast, line-based way to read a text file.
        // FileReader: Reads characters from the file at filePath.

        // Character stream with buffering for performance.
        // FileReader: It opens the file at 'filePath' and reads characters from it.
        // It throws an exception if the file does not exist or cannot be read.

        // BufferedReader: Adds buffering which greatly improves performance by reducing the number of disk read operations.
        // Instead of reading one character at a time, it reads a larger block into memory and processes it in chunks.

        // TIP: Buffered reads/writes are faster and more efficient than unbuffered ones, especially when dealing with large files.
        try (
                BufferedReader reader = new BufferedReader(new FileReader(filePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {

                // Append the line read from the file to the StringBuilder.
                // 'line' contains a single line of text with no newline character.

                // System.lineSeparator() is used to append the appropriate line break
                // for the current operating system (e.g., "\n" on Unix/Linux/macOS, "\r\n" on Windows).

                // This ensures that when the entire StringBuilder content is later converted to a String,
                // the original structure of the text file — including line breaks — is preserved.
                content.append(line).append(System.lineSeparator());
            }
        }
        return content.toString();
    }

    /**
     * Write a string to a file using character stream.
     *
     * @param filePath the path to the file to write to.
     * @param content  the String to be written.
     * @throws IOException e.g. if the file path is invalid.
     */
    public static void writeTextToFile(String filePath, String content) throws IOException {

        // Character stream with buffering for performance.
        // FileWriter: It opens the file at 'filePath' and writes characters to it.
        // FileWriter will create the file if it does not exist.
        // If the file exists, it will be overwritten.

        // BufferWriter: Adds buffering which greatly improves performance by reducing the number of disk write operations.
        // Instead of writing each character individually, it batches them and writes in chunks.

        // TIP: Buffered writes/readers are faster and more efficient than unbuffered ones, especially when dealing with large content.

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))
        ) {

            writer.write(content);

        }
    }
}
