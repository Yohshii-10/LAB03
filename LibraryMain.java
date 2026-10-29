package LAB03;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
 
      
        System.out.print("Enter number of books (N): ");
        int n = input.nextInt();
        input.nextLine(); 
 
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Book " + (i + 1) + " ---");
            System.out.print("Book ID : ");
            String id = input.nextLine();
            System.out.print("Title   : ");
            String title = input.nextLine();
            System.out.print("Author  : ");
            String author = input.nextLine();
            System.out.print("Price   : ");
            double price = input.nextDouble();
            input.nextLine(); 
 
            books.add(new Book(id, title, author, price));
        }
 
        // PROCESS
        double total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        double average = total / books.size();
 
        // OUTPUT
        System.out.println("\n===== BOOK DETAILS =====");
        for (Book book : books) {
            book.display();
        }
        System.out.printf("Average price of all books: $%.2f%n", average);
 
        input.close();
    }
}