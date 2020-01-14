package com.prakhar.parwal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prakhar.parwal.data.BookReviewData;
import com.prakhar.parwal.service.BookReviewsService;

@RestController
public class BookReviewController {

	
	@Autowired 
	private BookReviewsService bookReviewDataService;
	
	@GetMapping("/book-review/{bookId}")
	public List<BookReviewData> getBookReview(@PathVariable("bookId") Integer bookId) {
		
		System.out.println(bookId);
		return bookReviewDataService.getBookReviews(bookId);
	}
}
