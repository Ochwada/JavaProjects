package com.movieTicketBookingSystem;


/**
 * *******************************************************
 * Package: com.movieTicketBookingSystem
 * File: MovieNotAvailableException.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 11:50 AM
 * Description: Movie Not Available Exception
 * Objective: Custom Exception - Throw an exception when a user tries to book a ticket for a movie that is not currently showing.
 * *******************************************************
 */

public class MovieNotAvailableException extends Exception {
    public MovieNotAvailableException(String message) {
        super(message);
    }
}
