package de.neuefische.muc222booklibrary.service;

import de.neuefische.muc222booklibrary.model.Book;
import de.neuefische.muc222booklibrary.repository.BookRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    private BookRepository mockBookRepository = mock(BookRepository.class);
    private BookService bookService = new BookService(mockBookRepository);

    @Test
    void test_get(){
        //GIVEN
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("123", "Me", "Java");
        books.add(book1);

        when(mockBookRepository.getAllBooks()).thenReturn(books);

        //WHEN

        List<Book> result = bookService.getAllBooks();

        //THEN
        List<Book> expected = books;

        verify(mockBookRepository).getAllBooks();
        assertEquals(expected, result);
    }
}
