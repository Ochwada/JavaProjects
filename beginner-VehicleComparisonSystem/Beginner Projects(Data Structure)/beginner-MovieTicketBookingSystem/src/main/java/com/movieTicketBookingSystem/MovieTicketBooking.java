package com.movieTicketBookingSystem;


import java.io.File;
import java.io.FileNotFoundException;

/**
 * *******************************************************
 * Package: com.movieTicketBookingSystem
 * File: MovieTicketBooking.java
 * Author: Ochwada
 * Date: Thursday, 24.Apr.2025, 11:48 AM
 * Description: A simple Java console-based application that simulates the process of booking movie tickets.
 * Objective: Designed to help you practice exception handling in Java
 * *******************************************************
 */

public class MovieTicketBooking {

 public void bookTicket(String movieName) throws MovieNotAvailableException {

  if (movieName == null || movieName.isEmpty()) {
   throw new IllegalArgumentException("Movie name MUST be provided");
  }

  if(
          !movieName.equalsIgnoreCase("Inception") &&
                  !movieName.equalsIgnoreCase("The Dark Knight") &&
                  !movieName.equalsIgnoreCase("Avatar")
  ){
   throw  new MovieNotAvailableException("'" +movieName + "' is not airing in our Cinema right now");
  }
  System.out.println("Grab your popcorn \uD83C\uDF7F and 3D glasses \uD83D\uDC53 – the show is about to begin!");
 }

 public void loadMovieSchedule(String filePath) throws FileNotFoundException{
  File file = new File(filePath);
  if( !file.exists()){
   throw new FileNotFoundException();
  }
  // Simulate reading file path ...
  System.out.println("Reading file location... ");

 }
}

//Inception
//The Dark Knight
//Interstellar
//Avatar
//Spider-Man: No Way Home
