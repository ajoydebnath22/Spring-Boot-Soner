package com.ajoy.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootSonerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSonerApplication.class, args);
	}

	
	@GetMapping("/message")
	public String welcomeMessage() {
		return "Message Spring Boot App Soner Message";
	}
	
}
