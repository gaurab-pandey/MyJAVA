class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price); // ensure invalidity early
    }

    // Setter and Getter for title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Setter and Getter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // Setter and Getter for price with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price should be greater than 0");
        }
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Encapulation2 {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James Gosling", 39.99);
        Book book2 = new Book("Data Structures", "Mark Allen", 29.99);
        Book book3 = new Book("The Clean Code", "Robert C. Martin", 0); // Invalid price

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
