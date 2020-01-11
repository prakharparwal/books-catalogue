package com.prakhar.parwal.booksreviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.prakhar.parwal.controller, com.prakhar.parwal.service")
@EnableJpaRepositories("com.prakhar.parwal.repository")
@EntityScan("com.prakhar.parwal.data")
@SpringBootApplication
public class BooksReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksReviewServiceApplication.class, args);
	}

}
