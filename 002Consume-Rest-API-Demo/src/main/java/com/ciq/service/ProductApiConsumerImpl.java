package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ciq.model.Product;
import com.ciq.model.ResponseObj;

@Service
public class ProductApiConsumerImpl implements ProductApiConsumer {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Product> getProducts() {
		String url = "http://localhost:9090/products";

		ResponseObj responseObj = restTemplate.getForObject(url, ResponseObj.class);


		return (List<Product>) responseObj.getResult();
	}

}
