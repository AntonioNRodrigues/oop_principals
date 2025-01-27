package com.principals.oop;

import com.principals.oop.model.Author;
import com.principals.oop.model.Book;
import com.principals.oop.model.Library;
import com.principals.oop.model.Publisher;
import com.principals.oop.repositories.AuthorRepository;
import com.principals.oop.repositories.BookRepository;
import com.principals.oop.repositories.LibraryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopApplication implements CommandLineRunner {


    private final LibraryRepository libraryRepository;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public OopApplication(LibraryRepository libraryRepository, AuthorRepository authorRepository, BookRepository bookRepository) {
        this.libraryRepository = libraryRepository;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(OopApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        Library library = new Library();
        libraryRepository.save(library);

        Author author = new Author("John Doe", "Author Bio");
        authorRepository.save(author);

        Publisher publisher = new Publisher("Publisher Name", "Publisher Address");

        Book book = new Book();
        book.setTitle("Example Book");
        book.setAuthor(author);
        book.setPublisher(publisher);
        bookRepository.save(book);

        library.getBooks().add(book);
        libraryRepository.save(library);

        for (Book b : bookRepository.findAll()) {
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor().getName() +
                    ", Publisher: " + b.getPublisher().getName());
        }
    }
}
