package com.bharath.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.spring.data.entities.Product;
import com.bharath.spring.data.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@GetMapping
	public Iterable<Product> getProducts() {
		return productRepository.findAll();
	}
}
