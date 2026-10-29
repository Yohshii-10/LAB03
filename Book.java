package LAB03;
class Book {
    private String bookId;
    private String title;
    private String author;
    private double price;
 
    public Book(String bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
 
    public double getPrice() {
        return price;
    }
    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.printf("Price   : $%.2f%n", price);
        System.out.println();
    }
}