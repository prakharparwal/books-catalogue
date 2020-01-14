package com.prakhar.parwal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakhar.parwal.data.BookReviewData;
import com.prakhar.parwal.repository.BookReviewRepository;

@Service
public class BookReviewsService {

	@Autowired
	private BookReviewRepository bookReviewRepository;
	
	public List<BookReviewData> getBookReviews(Integer bookId) {
	
		List<BookReviewData> reviewData = new ArrayList<BookReviewData>();
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(bookId);
		
		
		System.out.println(bookId);
		
		bookReviewRepository.findAllById(ids).forEach(reviewData::add);
	//	bookReviewRepository.findAll().forEach(reviewData::add);
		return reviewData;
	}
	
	public void addBookReview(BookReviewData bookReviewData) {
		bookReviewRepository.save(bookReviewData);
	}
	
}
