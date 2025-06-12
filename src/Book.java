/*
Book.java
 */
import java.util.ArrayList;

public class Book {
    private ArrayList<Author> authors;
    private String title;
    private String publisher;
    private String isbn;
    // publishYear should be object Integer because it might be null
    private Integer publishYear;
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
    // Setters
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Boolean hasPublishYear() {
        return !(this.publishYear == null);
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
        // publish year may have not been initialized yet, because one constructor allows it
        if  (!book.hasPublishYear()) {
            throw new IllegalArgumentException("Given book publishYear has not been initialized");
        } else if (!this.hasPublishYear()) {
            throw new IllegalArgumentException("This book publishYear has not been initialized");
        } else {
            if (this.publishYear > book.getPublishYear()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    // methods

    public String morePagesThanToString(Book book) {
        int result = morePagesThan(book);
        if (result == 1) {
            return "Book named: \"" + this.title + "\" has more pages than book named: \"" + book.getTitle()  + "\"";
        } else {
            return "Book named: \"" + book.getTitle() + "\" has more pages than book named: \"" + this.title  + "\"";
        }
    }

    public String latestPublishYearToString(Book book) {
        int result = latestPublishYear(book);
        if (result == 1) {
            return "Book named: \"" + this.title + "\" has been published more recently than book named: \"" + book.getTitle()  + "\"";
        } else {
            return "Book named: \"" + book.getTitle() + "\" has been published more recently than book named: \"" + this.title + "\"";
        }
    }

    // toString implementation
    @Override
    public String toString() {
        String authorStr = "";
        for (Author a : this.authors) {
            authorStr = authorStr + a.toString() + " | ";
        }
        return "title = " + this.title + ", publisher = " + this.publisher + ", isbn = " + this.isbn + ", pages = " + this.pages + ", authors = [" + authorStr + "]";
    }
}

