import java.util.ArrayList;
import java.util.Date;

public class Library {
    public static void main(String[] args) {
        System.out.println("Hello World!");

    }


    // methods to create Authors with either constructor
    public static Author createAuthor(String firstName, String lastName) {
        return new Author(firstName, lastName);
    }
    public static Author createAuthor(String firstName, String lastName, Country birthCountry, Date birthDate) {
        return new Author(firstName, lastName, birthCountry, birthDate);
    }

    // methods to create Books with either constructor
    public static Book createBook(String title, ArrayList<Author> authors, int pages) {
        return new Book(title, authors, pages);
    }
    public static Book createBook(String title, ArrayList<Author> authors, int publishYear, String isbn, int pages, String publisher) {
        return new Book(title, authors, publishYear, isbn, pages, publisher);
    }
}
