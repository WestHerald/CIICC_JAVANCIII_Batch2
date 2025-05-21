public class Task11 {
    public static void main(String[] args) {
        Book[] books = new Book[] {
            new Book("Java Programming", "Jonh Smith", 2021, 39.99),
            new Book("Python Basics", "Jane Doe", 2020, 29.99),
            new Book("C++ Essentials", "Michael Johnson", 2019, 49.99)
        };

        for (Book b: books) {
            System.out.println(b.toString());
        }
    }
}

class Book {
    private static int bookCount = 0;
    private String title;
    private String author;
    private int yearPublished;

    private double price;
    
    public Book (String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString() {
        return "Book "+ (++bookCount) + ":\n" +"Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear Published: " + getYearPublished() + "\nPrice: $" + getPrice() + "\n";
    }
}