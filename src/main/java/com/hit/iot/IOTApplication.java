package com.hit.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main implementation class which serves two purpose in a spring boot application: Configuration and bootstrapping.
 */
@SpringBootApplication
public class IOTApplication {

	public static void main(String[] args) {
		SpringApplication.run(IOTApplication.class, args);
	}
}