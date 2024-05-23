package com.ciq.beantest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ciq.service.ProductService;

@SpringBootTest
public class BeanTest {

	@Autowired
	private ProductService productService;
	
	@Test
	public void testProductService() {
		assertNotNull(productService);
	}
}
