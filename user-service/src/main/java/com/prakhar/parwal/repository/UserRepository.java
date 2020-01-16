package com.prakhar.parwal.repository;

import org.springframework.data.repository.CrudRepository;

import com.prakhar.parwal.data.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	
}
