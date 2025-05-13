import java.util.ArrayList;
import java.util.Scanner;

/****************************************************
 * Bookmark
 * Author: Ochwada
 * Date:
 * Description:
 * Objective:  Users can save URLs, display the full list, and open any by index.
 ***************************************************/

public class Task03_BookmarksManager {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> bookmarks = new ArrayList<>();

    static int bookmarkIndex = 1000;

    //✅ Add & save URLs,
    static void addBookmark(String bookmark) {

        bookmark = bookmark.toLowerCase().trim();
        bookmarks.add(bookmark);
        System.out.println(bookmarkIndex + ". Bookmark added: " + bookmark);
        bookmarkIndex++;
    }

    // Remove URL using Index
    static void removeBookmark(int removeIndex) {
        int actualIndex = removeIndex - 1000;

        if(actualIndex >= 0 && actualIndex < bookmarks.size()){
            String removed = bookmarks.remove(actualIndex);
            System.out.println("Bookmark removed");
        }else {
            System.out.println("‼\uFE0F Invalid index. No bookmark found at " + removeIndex);
        }

    }

    //----- Display the full list -----
    static void displayBookmarks() {
        int index = 1000;
        for (String bookmark : bookmarks) {
            System.out.println(index + ".  " + bookmark);
            index++;
        }

    }

    //----- Search Bookmark by Index / Open URL using Index-----
    static void searchBookmarkByIndex(int searchIndex) {
        int actualIndex = searchIndex - 1000;

        if (actualIndex >= 0 && actualIndex < bookmarks.size()) {
            String result = bookmarks.get(actualIndex);
            System.out.println("🔍 Bookmark found at " + searchIndex + ": " + result);
        } else {
            System.out.println("‼\uFE0F No bookmark Found");
        }
    }
    /* ==== DUMMY URL ====
        1000.  https://openai.com
        1001.  https://github.com
        1002.  https://stackoverflow.com
        1003.  https://unsplash.com
        1004.  https://wikipedia.org
     */


    public static void main(String[] args) {
        // Add options to add a URL, view all bookmarks, and open by index.
        System.out.println("\n======= My Bookmarks List ======");
        int choice;
        boolean running = true;

        addBookmark("https://openai.com");
        addBookmark("https://github.com");
        addBookmark("https://stackoverflow.com");
        addBookmark("https://unsplash.com");
        addBookmark("https://wikipedia.org");


        while (running) {
            System.out.println("\n⬇\uFE0F Choose an option: ");
            System.out.println("1. Add Bookmark");
            System.out.println("2. Remove Bookmark");
            System.out.println("3. Display Bookmarks");
            System.out.println("4. Search Bookmarks by index");
            System.out.println("5. Exit");
            System.out.println("Your choice: ");

            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Bookmark to Add: ");
                    addBookmark(input.nextLine());
                    break;
                case 2:
                    System.out.println("Bookmark to be removed: ");
                    removeBookmark(input.nextInt());
                    break;
                case 3:
                    System.out.println("==== Bookmarked URL ==== ");
                    displayBookmarks();
                    break;
                case 4:
                    System.out.println("Input index to Search: ");
                    searchBookmarkByIndex(input.nextInt());
                    break;
                case 5:
                    System.out.println("♾\uFE0F Thanks For Using Bookmartix ♾\uFE0F ");
                    running = false;
                    break;
                default:
                    System.out.println("‼\uFE0F Invalid choice");

            }
        }

        input.close();

    }
}
