package exception;


/**
 * *******************************************************
 * Package: exception
 * File: ExpiredProductException.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 3:06 PM
 * Description: Thrown when expired items are used
 * Objective: Custom exception handling
 * *******************************************************
 */

public class ExpiredProductException extends RuntimeException {
    public ExpiredProductException(String message) {
        super(message);
    }
}
