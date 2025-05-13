/****************************************************
 * Main.java
 * Author: Ochwada
 * Date: Monday, 14.Apr.2025, 13:05 hrs
 * Description: 
 * Objective:
 ***************************************************/

public class Main {

   public static void main(String[] args) {


      LibraryBook book1 = LibraryBook.createAvailable("Kitumbwaa", "Ken Walibora");
      LibraryBook book2 = LibraryBook.createAvailable("Across the River", "Jane Doe");

      LibraryBook book3 = LibraryBook.createAvailable("The Lakers", "John Doe");

//      System.out.println(book1.getTitle());
//      System.out.println(book2.getTitle());

      LibraryBook[] books = {book1, book2, book3};

      System.out.println("\nThere are: " + LibraryBook.totalBooks +  " books");
      for (LibraryBook book : books) {
         System.out.println(book);
      }
      System.out.println("Information of " + LibraryBook.totalBooks +  " books, displayed");
   }



}
