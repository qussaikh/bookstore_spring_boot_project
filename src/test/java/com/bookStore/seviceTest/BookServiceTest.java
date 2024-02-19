package com.bookStore.seviceTest;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;
import com.bookStore.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepositoryMock;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testSaveBook() {
        Book book = new Book();
        when(bookRepositoryMock.save(book)).thenReturn(book);

        bookService.save(book);

        verify(bookRepositoryMock, times(1)).save(book);
    }

    @Test
    public void testGetAllBooks() {
        List<Book> books = Arrays.asList(new Book(), new Book());
        when(bookRepositoryMock.findAll()).thenReturn(books);

        List<Book> result = bookService.getAllBook();

        assertEquals(2, result.size());
        verify(bookRepositoryMock, times(1)).findAll();
    }

    @Test
    public void testGetBookById() {
        Book book = new Book();
        when(bookRepositoryMock.findById(1)).thenReturn(Optional.of(book));

        Book result = bookService.getBookById(1);

        assertEquals(book, result);
        verify(bookRepositoryMock, times(1)).findById(1);
    }

    @Test
    public void testDeleteById() {
        bookService.deleteById(1);

        verify(bookRepositoryMock, times(1)).deleteById(1);
    }
}
