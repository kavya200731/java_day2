public class Book {
    private String title;
    private double price;

    public Book() {
        title = "Unknown";
        price = 0.0;
    }

    public Book(String title) {
        this.title = title;
        price = 0.0;
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Programming");
        Book book3 = new Book("Java Programming", 49.99);

        book1.display();
        book2.display();
        book3.display();
    }
}