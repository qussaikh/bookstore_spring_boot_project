package com.bookStore.service;

import java.util.List;

import com.bookStore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBookRepository mybook;
	
	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return mybook.findAll();
	}
	
	public void deleteById(int id) {
		mybook.deleteById(id);
	}

//	public double getTotalPriceForAllBooks() {
//		List<MyBookList> allBooks = getAllMyBooks();
//		double totalPrice = 0.0;
//
//		for (MyBookList book : allBooks) {
//			totalPrice += book.getPrice();
//		}
//
//		return totalPrice;
//	}
}
