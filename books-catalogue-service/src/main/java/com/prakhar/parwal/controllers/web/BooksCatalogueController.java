package com.prakhar.parwal.controllers.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

import com.prakhar.parwal.data.Book;
import com.prakhar.parwal.data.BookReviewData;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import reactor.netty.http.client.HttpClient;
import reactor.netty.tcp.TcpClient;

@Controller
public class BooksCatalogueController {

	
	@Autowired
	private ModelAndView modelAndView;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping("/books-catalogue")
	public ModelAndView showBooksCatalogue() {
		
		ModelAndView booksCatalogue = new ModelAndView("books-catalogue");
		return booksCatalogue;
	}
	
	@GetMapping("/books-catalogue/all-books") 
	public ModelAndView showAllBooks() {
		
		modelAndView.setViewName("all-books");
		
		//Books details service
		List<Book> books = webClientBuilder
								.build()
								.get()
								.uri("http://books-details-service/books-details-service/books")
								.retrieve().toEntityList(Book.class).block().getBody();
		
		//Fetching book review details
		
		books.forEach((book) -> { book.setUserReviewData(webClientBuilder.build()
		  .get()
		  .uri("http://books-review-service/book-review/"+book.getId())
		  .retrieve().toEntityList(BookReviewData.class).block().getBody());
			});
		
	
		modelAndView.addObject("allBooks", books);
		return modelAndView;
	}
	
	@GetMapping("/books-catalogue/search-by-user")
	public ModelAndView searchBookByUserName(@RequestParam(name = "userName") String userName) {
		
		modelAndView.setViewName("all-books");
		return modelAndView;
	}
	
	@GetMapping("/books-catalogue/search-by-book")
	public ModelAndView searchByBookName(@RequestParam("bookName") String bookName) {
		
		List<Book> books = webClientBuilder.build()
								.get()
								.uri("http://localhost:8082/books-details-service/book/"+bookName)
								.retrieve()
								.toEntityList(Book.class).block().getBody();
		
							
		modelAndView.setViewName("all-books");
		modelAndView.addObject("allBooks", books);
		return modelAndView;
	}
	
}
