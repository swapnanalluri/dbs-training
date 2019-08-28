package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {
	
	Optional<Bank> findByUsername(String name);
	Optional<Bank> findByPassword(String password);
	List<Bank> findAll();

}
