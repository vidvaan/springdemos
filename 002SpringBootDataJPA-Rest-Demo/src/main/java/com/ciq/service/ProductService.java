package com.ciq.service;

import java.util.List;

import com.ciq.entity.Product;

public interface ProductService {
	
	public List<Product> findAll();
	
	public Product findById(Integer pid);
	
	public Product save(Product product);
	
	public void update(Product product);
	
	public void deleteById(Integer pid);

}
