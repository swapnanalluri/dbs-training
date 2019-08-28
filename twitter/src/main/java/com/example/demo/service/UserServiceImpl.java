package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

	@Override
	@Transactional
	public Users saveUsers(Users users) {
		  return userRepository.save(users);
	}

	@Override
	@Transactional
	public List<Users> listAll() {
		return this.userRepository.findAll();
	}

	@Override
	@Transactional
	public Users findById(long userId) {
		return this.userRepository.findById(userId).get();
	}

	@Override
	@Transactional
	public void deleteUser(long userId) {
		this.userRepository.delete(this.userRepository.findById(userId).get());
		
	}

}
