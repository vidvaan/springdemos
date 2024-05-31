package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.bean.UserBean;
import com.ciq.enitity.User;
import com.ciq.service.UserService;

@RestController
@RequestMapping("/rest/users")
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserService userService;
 
     @PostMapping
     public ResponseEntity<User> addUser(@RequestBody UserBean userBean){
		return ResponseEntity.ok(userService.save(userBean));
     }
}
