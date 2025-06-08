import java.util.ArrayList;

public class Book {
    private ArrayList<Author> authors;
    private String title;
    private String publisher;
    private String isbn;
    private int publishYear;
    private int pages;


    // Constructors
    public Book(String title, ArrayList<Author> authors, int pages) {
        this.title = title;
        this.authors = authors;
        this.pages = pages;
    }
    public Book(String title, ArrayList<Author> authors, int publishYear, String isbn, int pages, String publisher) {
        this.title = title;
        this.authors = authors;
        this.publishYear = publishYear;
        this.isbn = isbn;
        this.pages = pages;
        this.publisher = publisher;
    }
    // Getters

    public String getTitle() {
        return this.title;
    }
    public String getPublisher() {
        return this.publisher;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public int getPublishYear() {
        return this.publishYear;
    }
    public int getPages() {
        return this.pages;
    }

    // Methods
    public int morePagesThan (Book book) {
        if (this.pages > book.getPages()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int latestPublishYear (Book book) {
        if (this.publishYear > book.getPublishYear()) {
            return 1;
        } else {
            return 0;
        }
    }

    public String morePagesThanToString(Book book) {
        int result = morePagesThan(book);
        if (result == 1) {
            return "Book named: \"" + this.title + "\"has more pages than book named: \"" + book.getTitle()  + "\"";
        } else {
            return "Book named: \"" + book.getTitle() + "\"has more pages than book named: \"" + this.title  + "\"";
        }
    }

    public String latestPublishYearToString(Book book) {
        int result = latestPublishYear(book);
        if (result == 1) {
            return "Book named: \"" + this.title + "\"has been published more recently than book named: \"" + book.getTitle()  + "\"";
        } else {
            return "Book named: \"" + book.getTitle() + "\"has been published more recently than book named: \"" + this.title + "\"";
        }
    }

    // toString implementation
    @Override
    public String toString() {
        return "title = " + this.title + ", publisher = " + this.publisher + ", isbn = " + this.isbn + ", pages = " + this.pages + ", authors = " + this.authors;
    }
}

