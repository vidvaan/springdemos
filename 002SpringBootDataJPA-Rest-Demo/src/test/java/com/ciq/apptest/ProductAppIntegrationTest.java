package com.ciq.apptest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ciq.controller.ProductController;
import com.ciq.entity.Product;
import com.ciq.model.ResponseObj;

@SpringBootTest
public class ProductAppIntegrationTest {

	@Autowired
	private ProductController productController;

	@Test
	public void testCreateReadDelete() {
		Product product = new Product();
		product.setPname("TV");
		product.setPcost(30000.00);
		ResponseObj responseObj = productController.save(product);
		assertEquals(200, responseObj.getStatusCode());
		Product productObj = (Product) responseObj.getResult();
		assertEquals("TV", productObj.getPname());

		Product productRead = (Product) productController.findById(productObj.getPid()).getResult();
		assertEquals("TV", productRead.getPname());
		assertEquals(30000.00, productRead.getPcost());

		responseObj = productController.deleteById(productObj.getPid());
		assertEquals("Deleted Successflly", responseObj.getResult().toString());

	}

}
