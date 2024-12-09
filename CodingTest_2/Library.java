package CodingTest_2;
import java.util.List;
import static CodingTest_2.Book.title;
import static CodingTest_2.PrintedBook.lend;

public class Library {
    List<Book> books;
    String name;

    public Library(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void access() {
    }

    public void addBook(Book book){
        book.add(book);
        System.out.println("책 등록: ["+title+"]");
    }

    public void displayBooks(){
        PrintedBook printedBook = new PrintedBook();
        printedBook.displayDetails();
        EBook eBook = new EBook();
        eBook.displayDetails();
    }

    public void lendBook(String title){
        for (Book book:books){
            if (title.equals(Book.title)){
                if (book instanceof PrintedBook){
                    ((PrintedBook)book.lend());
                }
                else if (book instanceof EBook){
                    access();
                }
            }
        }
    }
    public void returnBook(String title){
        for (Book book:books){
            if (title.equals(Book.title)){
                if (books instanceof PrintedBook){
                    returnBook(title);
                }
            }
        }
    }
}