package com.bookStore.seviceTest;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;
import com.bookStore.service.MyBookListService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyBookServiceTest {

    @Mock
    private MyBookRepository myBookRepositoryMock;

    @InjectMocks
    private MyBookListService myBookService;

    @Test
    public void testSaveMyBooks() {
        MyBookList myBookList = new MyBookList();
        when(myBookRepositoryMock.save(myBookList)).thenReturn(myBookList);

        myBookService.saveMyBooks(myBookList);

        verify(myBookRepositoryMock, times(1)).save(myBookList);
    }

    @Test
    public void testGetAllMyBooks() {
        List<MyBookList> myBookLists = Arrays.asList(new MyBookList(), new MyBookList());
        when(myBookRepositoryMock.findAll()).thenReturn(myBookLists);

        List<MyBookList> result = myBookService.getAllMyBooks();

        assertEquals(2, result.size());
        verify(myBookRepositoryMock, times(1)).findAll();
    }

    @Test
    public void testDeleteById() {
        myBookService.deleteById(1);

        verify(myBookRepositoryMock, times(1)).deleteById(1);
    }
}
