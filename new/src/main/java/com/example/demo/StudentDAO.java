package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student, Integer>{


}
