package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
