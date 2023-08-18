package projects.librarymanagementsystem;

public class User {
    private String name;
    private int borrowedBooks = 0;

    public User(String name) {
        this.name = name;
        borrowedBooks = 0;
    }

    public String getName() {
        return name;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook() {
        borrowedBooks = borrowedBooks + 1;
        System.out.println(borrowedBooks);
        System.out.println("Book borrowed successfully.");
    }

    public void returnBook() {
    	System.out.println(borrowedBooks);
        if (borrowedBooks > 0) {
            borrowedBooks--;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("No books to return.");
        }
    }
}
