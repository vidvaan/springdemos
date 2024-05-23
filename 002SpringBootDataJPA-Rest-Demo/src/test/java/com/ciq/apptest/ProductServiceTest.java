package com.ciq.apptest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ciq.entity.Product;
import com.ciq.repository.ProductRepository;
import com.ciq.service.ProductServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

	@Mock
	private ProductRepository productRepository;

	@InjectMocks
	private ProductServiceImpl productServiceImpl;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testFindAllProducts() {
		List<Product> list = new ArrayList<Product>();
		Product p1 = new Product(1, "TV", 23000.00);
		Product p2 = new Product(2, "Laptop", 23000.00);
		Product p3 = new Product(3, "Mobile", 23000.00);

		list.add(p1);
		list.add(p2);
		list.add(p3);

		when(productRepository.findAll()).thenReturn(list);

		// test
		List<Product> prodList = productServiceImpl.findAll();

		assertEquals(3, prodList.size());
		verify(productRepository, times(1)).findAll();
	}

	@Test
	void testCreateOrSaveProduct() {
		Product product = new Product();
		product.setPname("TV");
		product.setPcost(30000.00);
		productServiceImpl.save(product);
		verify(productRepository, times(1)).save(product);
	}
	
	@Test
	void testUpdateProduct() {
		Product product = new Product();
		product.setPid(1);
		product.setPname("TV");
		product.setPcost(30000.00);
		productServiceImpl.update(product);
		verify(productRepository, times(1)).save(product);
	}
	
	@Test
	void testDeleteProduct() {
		productServiceImpl.deleteById(1);
		verify(productRepository, times(1)).deleteById(1);
	}

}
