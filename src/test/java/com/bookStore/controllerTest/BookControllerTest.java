package com.bookStore.controllerTest;

import com.bookStore.controller.BookController;
import com.bookStore.entity.Book;
import com.bookStore.entity.MyBookList;
import com.bookStore.service.BookService;
import com.bookStore.service.MyBookListService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {

    @Mock
    private BookService bookServiceMock;

    @Mock
    private MyBookListService myBookListServiceMock;

    @InjectMocks
    private BookController bookController;

    @Test
    public void testGetAllBook() {
        List<Book> books = new ArrayList<>();
        when(bookServiceMock.getAllBook()).thenReturn(books);
        ModelAndView modelAndView = bookController.getAllBook();
        verify(bookServiceMock, times(1)).getAllBook();
        assert(modelAndView.getViewName().equals("bookList"));
        assert(modelAndView.getModel().get("book").equals(books));
    }

    @Test
    public void testGetMyBooks() {
        List<MyBookList> myBooks = new ArrayList<>();
        when(myBookListServiceMock.getAllMyBooks()).thenReturn(myBooks);
        Model model = mock(Model.class);
        String view = bookController.getMyBooks(model);
        verify(myBookListServiceMock, times(1)).getAllMyBooks();
        verify(model, times(1)).addAttribute("book", myBooks);
        assert(view.equals("myBooks"));
    }
}
