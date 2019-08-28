package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Users;

public interface UserDAO extends CrudRepository<Users, String>{
	
	Users findByName(String name);
	Users findByPassword(String password);

}
