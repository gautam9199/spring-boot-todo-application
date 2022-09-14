package com.learning.springboottodoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learning.springboottodoapplication.controllers","com.learning.springboottodoapplication.config",
		"com.learning.springboottodoapplication.models","com.learning.springboottodoapplication.repositories"})
public class SpringBootTodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTodoApplication.class, args);
	}

}
