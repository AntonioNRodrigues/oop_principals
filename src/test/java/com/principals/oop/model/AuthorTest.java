package com.principals.oop.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AuthorTest {

    @Test
    public void testAuthor() {
        Author author = new Author();
        author.setId(1L);
        author.setName("Author Name");
        author.setBiography("Author Biography");

        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Book 1");
        books.add(book1);

        author.setBooks(books);

        assertEquals(1L, author.getId());
        assertEquals("Author Name", author.getName());
        assertEquals("Author Biography", author.getBiography());
        assertEquals(1, author.getBooks().size());
        assertEquals("Book 1", author.getBooks().get(0).getTitle());
    }
}