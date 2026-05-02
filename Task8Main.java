public class Task8Main {
    public static void main(String[] args) {
        // Create an array of type Media with a size of 3
        Media[] libraryInventory = new Media[3];

        // Fill the slots as required
        libraryInventory[0] = new Task8Book("Clean Code", "Robert C. Martin");
        libraryInventory[1] = new Magazine("National Geographic", 202);
        libraryInventory[2] = new Task8Book("The Pragmatic Programmer", "Andrew Hunt");

        // Use a for loop to call displayDetails() for every item
        System.out.println("--- Library Inventory Details ---");
        for (Media item : libraryInventory) {
            item.displayDetails();
        }
    }
}