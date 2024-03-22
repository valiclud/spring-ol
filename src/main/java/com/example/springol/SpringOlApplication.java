package com.example.springol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class SpringOlApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringOlApplication.class, args);
	}

}
