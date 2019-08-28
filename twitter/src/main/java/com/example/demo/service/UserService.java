package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Users;

public interface UserService {
	
	Users saveUsers(Users users);

    List<Users> listAll();

    Users findById(long userId);

    void deleteUser(long userId);

}
