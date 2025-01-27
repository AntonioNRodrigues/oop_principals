package com.principals.oop.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Book extends LibraryItem {
    @ManyToOne
    private Author author;

    @Embedded
    private Publisher publisher;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;


    }
}



