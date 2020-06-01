package org.app;

public class Library {
    private final int CAPACITY = 10;
    private String[] books;
    private int currentEmptySpace;

    Library() {
        books = new String[CAPACITY];
        currentEmptySpace = 0;
    }

    public int getCapacity() {
        return CAPACITY;
    }

    public int getSize() {
        return currentEmptySpace;
    }

    public boolean pushBook(String newBook) {
        if(currentEmptySpace < CAPACITY) {
            books[currentEmptySpace++] = newBook;
            return true;
        } else {
            return false;
        }
    }

    public String popBook() {
        String bookName;
        if(currentEmptySpace > 0) {
            return books[--currentEmptySpace];
        } else {
            return null;
        }
    }
}
