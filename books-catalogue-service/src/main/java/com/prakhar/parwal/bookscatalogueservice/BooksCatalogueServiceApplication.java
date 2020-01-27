package com.prakhar.parwal.bookscatalogueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import reactor.netty.http.client.HttpClient;
import reactor.netty.tcp.TcpClient;

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
		
		TcpClient timeoutClient = TcpClient.create()
			    .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10000)
			    .doOnConnected(
			        c -> c.addHandlerLast(new ReadTimeoutHandler(100))
			              .addHandlerLast(new WriteTimeoutHandler(100)));
		
		return WebClient.builder()
				.clientConnector(new ReactorClientHttpConnector(HttpClient.from(timeoutClient)));
		                
		
		
	}
	
	@Bean
	public ModelAndView getModelAndView() {
		return new ModelAndView();
	}
	

}
