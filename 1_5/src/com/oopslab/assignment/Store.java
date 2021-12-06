package com.oopslab.assignment;

import java.util.ArrayList;

public class Store {
    ArrayList<Book> bookStore = new ArrayList<Book>();
    public final int capacity;

    public Store(int capacity) {
        this.capacity = capacity;
    }

    public void store(Book book) {
        if (bookStore.size() < capacity)
            bookStore.add(book);
    }

    public boolean remove(Book book) {
        if (bookStore.contains(book)) {
            bookStore.remove(book);
            return true;
        }
        return false;
    }
}
