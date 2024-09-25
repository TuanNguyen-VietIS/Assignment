package bai2.store;

import bai2.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private static List<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
    }

    public static List<Book> getBooks() {
        return books;
    }

    public void showBooks() {
        System.out.println("Books in store:");
        for (Book book : getBooks()) {
            System.out.println(book.getTitle() + " - " + book.getPrice() + " - " + book.getStock());
        }
    }
}