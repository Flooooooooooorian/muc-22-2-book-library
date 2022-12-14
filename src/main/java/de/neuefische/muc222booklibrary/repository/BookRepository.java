package de.neuefische.muc222booklibrary.repository;

import de.neuefische.muc222booklibrary.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    private List<Book> books;

    public BookRepository(List<Book> books) {
        this.books = books;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book addBook(Book newBook) {
        this.books.add(newBook);
        return newBook;
    }
}
