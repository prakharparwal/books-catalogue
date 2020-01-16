package com.prakhar.parwal.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prakhar.parwal.data.User;
import com.prakhar.parwal.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	public User getUser(@PathVariable("userId") int userId) {
		return userService.getUser(userId);
	}
	
	@PostMapping("/add")
	public void addUser() {
		
	}
	
}
