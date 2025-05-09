package exception;


/**
 * *******************************************************
 * Package: exception
 * File: InvalidInputException.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 3:07 PM
 * Description: Thrown when user/product input is invalid
 * Objective: Custom exception handling
 * *******************************************************
 */

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}
