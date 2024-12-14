import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private String genre;

    public Book(String title, String author, int yearOfPublication, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", genre='" + genre + '\'' +
                '}';
    }
    public static Book findOldestBook(Book[] books) {
        if (books == null || books.length == 0) {
            return null;
        }
        Book oldest = books[0];
        for (Book book : books) {
            if (book.yearOfPublication < oldest.yearOfPublication) {
                oldest = book;
            }
        }
        return oldest;
    }
    public static Book[] filterBooksByGenre(Book[] books, String genre) {
        if (books == null || genre == null) {
            return new Book[0];
        }
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (genre.equalsIgnoreCase(book.genre)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks.toArray(new Book[0]);
    }
    public static void main(String[] args) {
        Book book1 = new Book("Book One", "Author A", 1990, "Fiction");
        Book book2 = new Book("Book Two", "Author B", 1985, "Science");
        Book book3 = new Book("Book Three", "Author C", 2000, "Fiction");
        Book book4 = new Book("Book Four", "Author D", 1975, "History");

        Book[] books = {book1, book2, book3, book4};
        System.out.println(book1.toString());
        Book oldestBook = Book.findOldestBook(books);
        System.out.println("Oldest Book: " + (oldestBook != null ? oldestBook.toString() : "None"));
        Book[] fictionBooks = Book.filterBooksByGenre(books, "Fiction");
        System.out.println("Fiction Books:");
        for (Book book : fictionBooks) {
            System.out.println(book);
        }
    }
}