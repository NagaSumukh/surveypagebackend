package com.swe.spring.swe645hw4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.swe.spring.swe645hw4")
public class Swe645hw4Application {

	public static void main(String[] args) {
		SpringApplication.run(Swe645hw4Application.class, args);
	}
}
