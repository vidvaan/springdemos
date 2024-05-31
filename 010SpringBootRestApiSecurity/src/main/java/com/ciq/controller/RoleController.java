package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.bean.RoleBean;
import com.ciq.enitity.Role;
import com.ciq.service.RoleService;

@RestController
@RequestMapping("/rest/roles")
@CrossOrigin("*")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
 
     @PostMapping
     public ResponseEntity<Role> addRole(@RequestBody RoleBean roleBean){
		return ResponseEntity.ok(roleService.save(roleBean));
     }
}
