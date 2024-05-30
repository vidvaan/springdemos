package com.ciq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/public/home")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/public/about")
	public String about() {
		return "About";
	}
	
	@GetMapping("/private/findAll")
	public String findAll() {
		return "findAll";
	}
	
	@GetMapping("/private/findById")
	public String findById() {
		return "findById";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

}
