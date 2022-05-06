package com.javacourse.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		// javayı rest api olarak kullanıyoruz.
		// We use java as rest api.
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
