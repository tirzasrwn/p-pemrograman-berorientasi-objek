package com.tirzasrwn.app.m04;

public class Book {
    private String title;
    private String author;

    // Constructors

    // Default Constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
    }

    // Copy Object Constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
    }

    // Copy Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Main method
    public static void main(String[] args) {
        // Default constructor
        Book book1 = new Book();
        System.out.println("Default Book: Title - " + book1.getTitle() + ", Author - " + book1.getAuthor());

        // Copy object constructor
        Book book2 = new Book(book1);
        System.out.println("Copied Book: Title - " + book2.getTitle() + ", Author - " + book2.getAuthor());

        // Copy constructor
        Book book3 = new Book("Java Programming", "John Doe");
        System.out.println("New Book: Title - " + book3.getTitle() + ", Author - " + book3.getAuthor());
    }
}
