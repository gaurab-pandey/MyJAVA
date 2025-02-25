/*Create a class Library with properties: bookName, author, ISBN.
Take input for multiple books using loops.
Display details of all books */



import java.util.Scanner;

class Library {
    String bookName;
    String author;
    String ISBN;

    
    Library(String bookName, String author, String ISBN) {
        this.bookName = bookName;
        this.author = author;
        this.ISBN = ISBN;
    }

    
    void displayBookInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("----------------------------");
    }
}

public class Booksystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Library[] books = new Library[n];

        // input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Book Name: ");
            String bookName = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("ISBN: ");
            String ISBN = sc.nextLine();

            // Creating Library objects for each book
            books[i] = new Library(bookName, author, ISBN);
        }

       
        System.out.println("\nDetails of All Books:");
        for (int i = 0; i < n; i++) {
            books[i].displayBookInfo();
        }

        sc.close();
    }
}
