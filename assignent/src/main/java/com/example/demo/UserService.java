package com.example.demo;

public interface UserService {

	public Customers findUserByEmail(String email);

	public void saveUser(Customers customers);
}
