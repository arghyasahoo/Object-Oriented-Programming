package com.oopslab.assignment;

public class Book {
    public final String title;
    public final String author;
    public final int edition;
    public double price;

    public Book(String title, String author, int edition, double price) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.price = price;
    }
}
