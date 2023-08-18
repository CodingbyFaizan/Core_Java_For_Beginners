package projects.librarymanagementsystem;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Add sample books to the library
        library.addBook(new Book("Java Programming", "John Smith"));
        library.addBook(new Book("Python Basics", "Jane Doe"));
        library.addBook(new Book("Algorithms and Data Structures", "Alice Johnson"));

        System.out.println("Welcome to the Library Management System!");

        while (true) {
            System.out.println("Enter your choice:\n1. Display Books\n2. Search Books\n3. Borrow Book\n4. Return Book\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

         User user = null; // Initialize the User object outside the switch statement

         // Prompt for user's name and create the User object before entering the switch statement
         System.out.println("Enter your name:");
         String userName = scanner.nextLine();
         user = new User(userName);
           
            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.println("Enter a keyword to search for books:");
                    String keyword = scanner.nextLine();
                    List<Book> searchResults = library.searchBooks(keyword);
                    if (searchResults.isEmpty()) {
                        System.out.println("No matching books found.");
                    } else {
                        System.out.println("Matching books:");
                        for (Book book : searchResults) {
                            System.out.println(book.getTitle() + " by " + book.getAuthor());
                        }
                    }
                    break;
                case 3:
                    user.borrowBook();
                    break;
                case 4:
                    user.returnBook();
                    break;
                case 5:
                    System.out.println("Thank you for using the Library Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        }
    }
    
}