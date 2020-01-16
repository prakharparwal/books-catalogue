package com.prakhar.parwal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakhar.parwal.data.User;
import com.prakhar.parwal.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User getUser(int id) {
		return userRepository.findById(id).orElse(null);
	}
	
}
