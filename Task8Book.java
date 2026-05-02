public class Task8Book extends Media {
    private String author;

    public Task8Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + title + " | Author: " + author);
    }
}
    

