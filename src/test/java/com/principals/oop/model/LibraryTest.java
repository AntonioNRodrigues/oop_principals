package com.principals.oop.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void testLibrary() {
        Library library = new Library();
        library.setId(1L);

        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Book 1");
        books.add(book1);

        library.setBooks(books);

        assertEquals(1L, library.getId());
        assertEquals(1, library.getBooks().size());
        assertEquals("Book 1", library.getBooks().get(0).getTitle());
    }
}