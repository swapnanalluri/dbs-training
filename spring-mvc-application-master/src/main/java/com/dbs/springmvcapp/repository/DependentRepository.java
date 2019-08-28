package com.dbs.springmvcapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.springmvcapp.model.Dependent;
import com.dbs.springmvcapp.model.Employee;

public interface DependentRepository extends JpaRepository<Dependent, Long>{
	
	Optional<Employee> findByName(String name);
    List<Dependent> findAll();

}
