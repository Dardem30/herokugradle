package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class GradleherokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleherokuApplication.class, args);
	}
}
