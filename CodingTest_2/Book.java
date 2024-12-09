package CodingTest_2;

abstract public class Book {
    static String title;
    String author;

    public Book() {}
    public Book(String title, String author) {
        Book.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        Book.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    abstract void displayDetails();
}
