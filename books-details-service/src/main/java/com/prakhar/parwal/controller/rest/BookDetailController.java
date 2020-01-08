package com.prakhar.parwal.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prakhar.parwal.data.Book;
import com.prakhar.parwal.repositories.BookRepository;

@RestController
public class BookDetailController {

	@Autowired 
	private BookRepository bookRepository;
	
	@GetMapping("/books-details-service/books")
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();
		
		books = bookRepository.findAll();
		
		return books;
	} 
}
