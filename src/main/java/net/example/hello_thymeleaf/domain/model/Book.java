package net.example.hello_thymeleaf.domain.model;

import java.util.List;

public class Book {

    /** ISBN */
    private String isbn;

    /** Title */
    private String title;

    /** Publisher */
    private String publisher;

    /** Authors */
    private List<String> authors;

    /**
     * Default constructor
     */
    public Book() {
    }

    /**
     * Constructor with args
     * @param isbn ISBN
     * @param title Title
     * @param publisher Publisher
     */
    public Book(String isbn, String title, String publisher, List<String> authors) {
        this.isbn = isbn;
        this.title = title;
        this.publisher = publisher;
        this.authors = authors;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return this.publisher;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    public List<String> getAuthors() {
        return this.authors;
    }
}
