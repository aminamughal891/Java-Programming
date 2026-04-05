public class BookMain {
    public static void main(String[] args) {
     
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("Hamlet"); 

       
        System.out.println("Testing Borrowing");
        book1.borrowBook();
        book1.borrowBook(); 

  
        System.out.println(" Testing Return & Re-borrow ");
        book1.returnBook();
        book1.borrowBook(); 

        System.out.println("Final Library Status");
        displayStatus(book1);
        displayStatus(book2);
    }

    public static void displayStatus(Book book) {
        String status = book.isAvailable() ? "Available" : "Borrowed";
        System.out.println("Title: " + book.getTitle() +  " | Author: " + book.getAuthor() + " | Status: " + status);
    }
}