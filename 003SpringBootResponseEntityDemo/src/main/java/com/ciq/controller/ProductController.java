package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Product;
import com.ciq.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<?> findAll() {
		return new ResponseEntity<List<Product>>(productService.findAll(), HttpStatus.OK);

	}

	@GetMapping("{pid}")
	public ResponseEntity<?> findById(@PathVariable("pid") Integer pid) {
		return new ResponseEntity<Product>(productService.findById(pid), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> save(@Valid @RequestBody Product product) {
		productService.save(product);
		return new ResponseEntity<String>("Insetrted Successflly", HttpStatus.CREATED);

	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody @Valid Product product) {
		productService.update(product);
		return new ResponseEntity<String>("Updated Successflly", HttpStatus.ACCEPTED);

	}

	@DeleteMapping("{pid}")
	public ResponseEntity<?> deleteById(@PathVariable("pid") Integer pid) {
		productService.deleteById(pid);
		return new ResponseEntity<String>("Updated Successflly", HttpStatus.OK);
	}
}
