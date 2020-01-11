package com.prakhar.parwal.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prakhar.parwal.data.BookReviewData;
import com.prakhar.parwal.service.BookReviewsService;

@RestController
public class BookReviewController {

	
	@Autowired 
	private BookReviewsService bookReviewDataService;
	
	@GetMapping("/book-review/{id}")
	public List<BookReviewData> getBookReview(@PathParam(value = "bookId") Integer bookId) {
		
		return bookReviewDataService.getBookReviews(bookId);
	}
}
