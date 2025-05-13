package com.movieTicketBookingSystem;


/**
 * *******************************************************
 * Package: com.movieTicketBookingSystem
 * File: Main.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 12:15 PM
 * Description: Handle all exceptions gracefully
 * Objective:
 * *******************************************************
 */

public class Main {
 public static void main(String[] args) {
  MovieTicketBooking movie = new MovieTicketBooking();

  try {
   //--- Movie not in list
   try {
    movie.bookTicket("Spider-Man: No Way Home");
   } catch (MovieNotAvailableException e) {
    System.out.println("[Custom Exception Caught]: " + e.getMessage());

   } catch (IllegalArgumentException e) {
    System.out.println("[Runtime Exception Caught: ]" + e.getMessage());
   }
   System.out.println();

   //--- Movie  in list
   try {
    movie.bookTicket("Inception");
   } catch (MovieNotAvailableException e) {
    System.out.println("[Custom Exception Caught]: " + e.getMessage());

   } catch (IllegalArgumentException e) {
    System.out.println("[Runtime Exception Caught: ]" + e.getMessage());
   }
   System.out.println();
  //--- File Path reading
   try {
    movie.bookTicket("Inception.txt");
   } catch (MovieNotAvailableException e) {
    System.out.println("[Check Exception Caught]: File not Found");
   }
  }

   finally {
    System.out.println("==== Thanks for visiting our Cinema \uD83C\uDF75 ===");
   }
 }
}
