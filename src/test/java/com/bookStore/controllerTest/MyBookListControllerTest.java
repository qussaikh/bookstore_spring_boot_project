package com.bookStore.controllerTest;

import com.bookStore.controller.MyBookListController;
import com.bookStore.service.MyBookListService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MyBookListControllerTest {

    @Mock
    private MyBookListService myBookListServiceMock;

    @InjectMocks
    private MyBookListController myBookListController;

    @Test
    public void testDeleteMyList() throws Exception {
        int id = 123;
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(myBookListController).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/deleteMyList/{id}", id))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.redirectedUrl("/my_books"));

        verify(myBookListServiceMock, times(1)).deleteById(id);
    }
}
