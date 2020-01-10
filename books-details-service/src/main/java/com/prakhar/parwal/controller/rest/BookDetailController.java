package com.prakhar.parwal.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prakhar.parwal.data.Book;
import com.prakhar.parwal.service.BookService;

@RestController
public class BookDetailController {

	@Autowired 
	private BookService bookService;
	
	@GetMapping("/books-details-service/books")
	public List<Book> getAllBooks() {
		
		List<Book> books = new ArrayList<Book>();
		books = bookService.getAllBooks();
		return books;
	} 
	
	@RequestMapping(value = "/books-details-service/add", method = RequestMethod.POST,
			headers="Accept=application/json",consumes = MediaType.APPLICATION_JSON_VALUE) 
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	
}
