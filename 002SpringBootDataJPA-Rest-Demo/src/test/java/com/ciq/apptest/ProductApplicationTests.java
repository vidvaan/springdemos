package com.ciq.apptest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ciq.controller.ProductController;
import com.ciq.repository.ProductRepository;
import com.ciq.service.ProductService;

@SpringBootTest
public class ProductApplicationTests {

	@Autowired
	private ProductController productController;

	@Autowired
	private ProductService productService;

	@Autowired
	private ProductRepository productRepository;

	@Test
	public void contextLoads() {
		
		Assertions.assertNotNull(productController);
		Assertions.assertNotNull(productService);
		Assertions.assertNotNull(productRepository);
		
	}

}
