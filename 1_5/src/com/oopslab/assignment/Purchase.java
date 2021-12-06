package com.oopslab.assignment;

public class Purchase {
    Store store = new Store(5);

    public Purchase(Book book) {
        if (store.bookStore.contains(book)) {
            boolean present = store.remove(book);
        }
    }
}
