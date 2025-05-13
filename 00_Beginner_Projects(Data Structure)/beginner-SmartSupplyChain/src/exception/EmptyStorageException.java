package exception;


/**
 * *******************************************************
 * Package: exception
 * File: EmptyStorageException.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 3:07 PM
 * Description: Thrown when accessing empty storage
 * Objective: Custom exception handling
 * *******************************************************
 */

public class EmptyStorageException extends RuntimeException {
    public EmptyStorageException(String message) {
        super(message);
    }
}
