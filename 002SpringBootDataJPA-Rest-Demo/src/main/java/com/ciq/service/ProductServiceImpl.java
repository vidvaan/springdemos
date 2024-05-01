package com.ciq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.Product;
import com.ciq.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(Integer pid) {

		Product product = null;

		Optional<Product> optional = productRepository.findById(pid);

		if (optional.isPresent()) {
			product = optional.get();
		}

		return product;
	}

	@Override
	public void save(Product product) {

		productRepository.save(product);

	}

	@Override
	public void update(Product product) {
		productRepository.save(product);
	}

	@Override
	public void deleteById(Integer pid) {
		productRepository.deleteById(pid);
	}

}
