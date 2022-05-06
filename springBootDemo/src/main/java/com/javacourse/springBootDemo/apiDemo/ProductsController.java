package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	// MVC - Controller
	@GetMapping("/")
	public String get() {
	 return "Laptop";
 }
	@GetMapping("/products")
	public String get2() {
	 return "Laptop2";
 }
}
