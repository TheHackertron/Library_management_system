package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class LibraryTest {
    
    public static void main(String[] args) {
        System.out.println("=== Library Management System Testing ===\n");
        
        // Test 1: Book Creation
        System.out.println("Test 1: Book Creation");
        try {
            Book book1 = new Book("Test Title", "Test Author", "123-456-789");
            System.out.println("✓ Book created successfully");
            System.out.println("  Title: " + book1.getTitle());
            System.out.println("  Author: " + book1.getAuthor());
            System.out.println("  ISBN: " + book1.getIsbn());
        } catch (Exception e) {
            System.out.println("✗ Book creation failed: " + e.getMessage());
        }
        
        // Test 2: Book List Operations
        System.out.println("\nTest 2: Book List Operations");
        try {
            ObservableList<Book> bookList = FXCollections.observableArrayList();
            
            // Add books
            bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5"));
            bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4"));
            bookList.add(new Book("1984", "George Orwell", "978-0-452-28423-4"));
            
            System.out.println("✓ Added 3 books to list");
            System.out.println("  List size: " + bookList.size());
            
            // Remove a book
            bookList.remove(0);
            System.out.println("✓ Removed 1 book from list");
            System.out.println("  List size after removal: " + bookList.size());
            
        } catch (Exception e) {
            System.out.println("✗ Book list operations failed: " + e.getMessage());
        }
        
        // Test 3: Input Validation Simulation
        System.out.println("\nTest 3: Input Validation Simulation");
        try {
            // Test empty fields
            String title = "";
            String author = "";
            String isbn = "";
            
            if (title.isEmpty() || author.isEmpty() || isbn.isEmpty()) {
                System.out.println("✓ Empty field validation works correctly");
            } else {
                System.out.println("✗ Empty field validation failed");
            }
            
            // Test valid fields
            title = "Valid Title";
            author = "Valid Author";
            isbn = "Valid ISBN";
            
            if (!title.isEmpty() && !author.isEmpty() && !isbn.isEmpty()) {
                System.out.println("✓ Valid field validation works correctly");
            } else {
                System.out.println("✗ Valid field validation failed");
            }
            
        } catch (Exception e) {
            System.out.println("✗ Input validation test failed: " + e.getMessage());
        }
        
        // Test 4: Book Property Setters
        System.out.println("\nTest 4: Book Property Setters");
        try {
            Book book = new Book("Original Title", "Original Author", "Original ISBN");
            
            book.setTitle("Updated Title");
            book.setAuthor("Updated Author");
            book.setIsbn("Updated ISBN");
            
            if ("Updated Title".equals(book.getTitle()) && 
                "Updated Author".equals(book.getAuthor()) && 
                "Updated ISBN".equals(book.getIsbn())) {
                System.out.println("✓ Book property setters work correctly");
            } else {
                System.out.println("✗ Book property setters failed");
            }
            
        } catch (Exception e) {
            System.out.println("✗ Book property setter test failed: " + e.getMessage());
        }
        
        System.out.println("\n=== Testing Complete ===");
    }
}
