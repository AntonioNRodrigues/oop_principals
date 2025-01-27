package com.principals.oop.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testBook() {
        Book book = new Book();
        book.setId(1L);
        book.setTitle("Book Title");

        Author author = new Author();
        author.setId(1L);
        author.setName("Author Name");
        book.setAuthor(author);

        assertEquals(1L, book.getId());
        assertEquals("Book Title", book.getTitle());
        assertEquals(1L, book.getAuthor().getId());
        assertEquals("Author Name", book.getAuthor().getName());
    }
}