package com.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookStore.service.MyBookListService;


@Controller
public class MyBookListController {
	
	@Autowired
	private MyBookListService service;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/my_books";
	}

	// Endpoint för att hämta totalpriset för alla böcker
	@GetMapping("/totalPrice")
	public ResponseEntity<Double> getTotalPriceForAllBooks() {
		double totalPrice = service.getTotalPriceForAllBooks();
		return ResponseEntity.ok(totalPrice);
	}

}
