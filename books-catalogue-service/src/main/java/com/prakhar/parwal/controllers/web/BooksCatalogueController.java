package com.prakhar.parwal.controllers.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

import com.prakhar.parwal.data.Book;
import com.prakhar.parwal.data.UserReviewData;

@Controller
public class BooksCatalogueController {

	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping("/books-catalogue")
	public ModelAndView showBooksCatalogue() {
		
		ModelAndView booksCatalogue = new ModelAndView("books-catalogue");
		return booksCatalogue;
	}
	
	@GetMapping("/books-catalogue/all-books") 
	public ModelAndView showAllBooks() {
		
		ModelAndView allBooks = new ModelAndView("all-books");
		
		//Books details service
		List<Book> books = webClientBuilder.build()
				.get()
				.uri("http://localhost:8082/books-details-service/books")
				.retrieve().toEntityList(Book.class).block().getBody();
		
		//Fetching book review details
		books.forEach((book) -> {
			book.setUserReviewData(webClientBuilder.build()
					.get()
					.uri("http://locahost:8084/book-review/"+book.getId())
					.retrieve().toEntityList(UserReviewData.class).block().getBody());
		});
	
		allBooks.addObject("allBooks", books);
		return allBooks;
	}
}
