package com.prakhar.parwal.booksdetailsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@ComponentScan("com.prakhar.parwal.controller.rest, com.prakhar.parwal.service")
@EntityScan("com.prakhar.parwal.data")
@EnableJpaRepositories(basePackages = "com.prakhar.parwal.repositories")
public class BooksDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksDetailsServiceApplication.class, args);
	}

}
 