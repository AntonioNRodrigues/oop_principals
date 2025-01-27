package com.principals.oop.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryItemTest {

    @Test
    public void setIdAndGetId() {
        LibraryItem item = new LibraryItem() {};
        item.setId(1L);
        assertEquals(1L, item.getId());
    }

    @Test
    public void setTitleAndGetTitle() {
        LibraryItem item = new LibraryItem() {};
        item.setTitle("Test Title");
        assertEquals("Test Title", item.getTitle());
    }

    @Test
    public void setIdToNull() {
        LibraryItem item = new LibraryItem() {};
        item.setId(null);
        assertNull(item.getId());
    }

    @Test
    public void setTitleToNull() {
        LibraryItem item = new LibraryItem() {};
        item.setTitle(null);
        assertNull(item.getTitle());
    }

    @Test
    public void setTitleToEmptyString() {
        LibraryItem item = new LibraryItem() {};
        item.setTitle("");
        assertEquals("", item.getTitle());
    }
}