package com.bharath.spring.data;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.bharath.spring.data.entities.Product;
import com.bharath.spring.data.repository.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	void saveProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(1L);
		product.setName("Mac");
		product.setDescription("awesome");
		product.setPrice(1200d);
		productRepository.save(product);
		
		Optional<Product> optionalProduct = productRepository.findById(1L);
		if (optionalProduct.isPresent()) {
			product = optionalProduct.get();
		} else {
			product = null;
		}
		System.out.println("Product found: " + product);
		
		product.setPrice(1500d);
		
		productRepository.save(product);
		
		productRepository.findAll().forEach(p->{System.out.println(p.getPrice());});
		
		System.out.println(productRepository.findByName("Mac"));
		
		System.out.println(productRepository.findByPrice(1500d));
	}

}
