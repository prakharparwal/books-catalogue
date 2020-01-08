package com.prakhar.parwal.bookscatalogueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.prakhar.parwal.controllers.*")
public class BooksCatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksCatalogueServiceApplication.class, args);
	}

}
