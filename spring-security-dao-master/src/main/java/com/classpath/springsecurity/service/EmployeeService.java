package com.classpath.springsecurity.service;

import com.classpath.springsecurity.model.Employee;
import  java.util.List;


public interface EmployeeService {
    Employee save(Employee employee);
    Employee update(long id, Employee employee);
    void delete(long id);
    List<Employee> listAll();

    Employee findByEmpId(long id);
}