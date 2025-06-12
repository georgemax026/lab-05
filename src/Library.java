/*
Library.java
 */
import java.util.ArrayList;
import java.util.Date;

public class Library {
    public static void main(String[] args) {
        // create book 1
        Author authorOne =  createAuthor("Guenther", "Steiner", Country.ITALY, new Date(1965, 4, 7));
        ArrayList<Author> bookOneAuthors = new ArrayList<>();
        bookOneAuthors.add(authorOne);
        Book bookOne = createBook("Surviving to Drive", bookOneAuthors, 2023, "9781787636286", 304, "Transworld Publishers Ltd");
        // create book 2
        Author authorTwo =  createAuthor("Adrian", "Newey", Country.ENGLAND, new Date(1958, 12, 26));
        ArrayList<Author> bookTwoAuthors = new ArrayList<>();
        bookTwoAuthors.add(authorTwo);
//        Book bookTwo = createBook("How to Build a Car", bookTwoAuthors, 2017, "9780008196806", 400, "HarperCollins Publishers");
        Book bookTwo = createBook("How to Build a Car", bookTwoAuthors, 400);


        System.out.println(bookOne.toString());
        System.out.println(bookTwo.toString());
        System.out.println(bookOne.morePagesThanToString(bookTwo));
//        System.out.println(bookTwo.latestPublishYearToString(bookOne));
        System.out.println(bookOne.latestPublishYearToString(bookTwo));
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
