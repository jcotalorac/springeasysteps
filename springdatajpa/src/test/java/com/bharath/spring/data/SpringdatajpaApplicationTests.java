package com.bharath.spring.data;

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
	}

}
