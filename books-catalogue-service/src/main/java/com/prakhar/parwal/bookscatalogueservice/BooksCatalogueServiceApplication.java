package com.prakhar.parwal.bookscatalogueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan("com.prakhar.parwal.controllers.*")
public class BooksCatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksCatalogueServiceApplication.class, args);
	}
	
	@Bean 
	@LoadBalanced
	public WebClient.Builder getWebClientBuilder() {
		return WebClient.builder();
	}
	
	@Bean
	public ModelAndView getModelAndView() {
		return new ModelAndView();
	}
	

}
