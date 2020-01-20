package com.prakhar.parwal.controllers.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prakhar.parwal.data.User;
import com.prakhar.parwal.data.UserCredentials;
import com.prakhar.parwal.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable("userId") int userId) {
		return userService.getUser(userId);	
	}
	
	@PostMapping("user/add")
	public void addUser(@Valid User user, BindingResult result) {
		
		if(!result.hasErrors()) {
			userService.addUser(user);
		}
	}
	
	@GetMapping("/user/addTest")
	public String testAddUser() {
	
		System.out.println("Request came here ");
		UserCredentials uc = new UserCredentials(1, "admin", "pass_prakhar");
		User user = new User(1, "Admin", uc);
		userService.addUser(user);
		return "Ok";
	}
	
}
