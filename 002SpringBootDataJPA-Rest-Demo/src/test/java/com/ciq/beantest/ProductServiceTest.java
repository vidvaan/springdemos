package com.ciq.beantest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ciq.entity.Product;
import com.ciq.service.ProductService;

@SpringBootTest
public class ProductServiceTest {

	@Autowired
	private  ProductService productService;

	
	@Test
	public void testSave() {
		Product product = new Product();
		product.setPname("Test");
		product.setPcost(200000.00);
		
		Product productRes =   productService.save(product);

		assertEquals("Test", productRes.getPname());
	}
	
	
	@Test
	public void testUpdate() {
		
		
		Product product = productService.findById(1);
		product.setPname("Test");
		product.setPcost(200000.00);
		
		productService.save(product);
		
		product = productService.findById(1);

		assertEquals("Test", product.getPname());
	}
	
	
	

}
