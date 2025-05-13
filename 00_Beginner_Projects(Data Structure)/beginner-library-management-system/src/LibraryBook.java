/****************************************************
 * LibraryBook.java 
 * Author: Ochwada
 * Date: Monday, 14.Apr.2025, 12:43 hrs
 * Description: 
 * Objective:
 ***************************************************/

public class LibraryBook {
    /// ------------ Fields: They are private ------------
    private String title;
    private String author;
    private String bookId;
    private String status;


    ///  ------------ Non-Static Fields -------------------
    // Track total books
    public static int totalBooks = 0;

    // Static method to get total number of books
    public static int getTotalBooks() {
        return totalBooks;
    }

    ///  ------------ Overloaded Constructors -------------------
    // No-arg Constructor
    public LibraryBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.status = "available";
        this.bookId = generateBookId();
    }

    // Constructor with title and author
    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = "available";
        this.bookId = generateBookId();
    }
    // Constructor with title, author, and status
    public LibraryBook(String title, String author, String status) {
        this.title = title;
        this.author = author;
        this.status = status;
        this.bookId = generateBookId();
    }

    ///------------ Static method to generate unique book ID ------------
    private static String generateBookId() {
        totalBooks++; // increment on every new book
        return "BOOK" + (1000 + totalBooks); // e.g., BOOK1001, BOOK1002
    }

    ///------------  Static Factory Method to createAvailability ------------

    public static LibraryBook createAvailable(String title, String author){
        return new LibraryBook(title, author);
    }

    ///------------  Utility Method: Display book details------------
    @Override
    public String toString() {
        return "===== Book Details =====\n" +
                "Title   : " + title + "\n" +
                "Author  : " + author + "\n" +
                "Book ID : " + bookId + "\n" +
                "Status  : " + status + "\n";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookId() {
        return bookId;
    }

    public String getStatus() {
        return status;
    }
}
