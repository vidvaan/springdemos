package com.ciq.apptest;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ciq.entity.Product;
import com.ciq.repository.ProductRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DaoTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	public void testCreateReadDelete() {
		Product product = new Product();
		product.setPname("TV");
		product.setPcost(20000.00);

		productRepository.save(product);

		List<Product> products = productRepository.findAll();
		System.out.println(products);
		Assertions.assertEquals(products.size(), 1);

		productRepository.deleteAll();
		Assertions.assertEquals(productRepository.findAll().size(), 0);
	}
}