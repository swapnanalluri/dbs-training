package com.classpath.springsecurity.service;

import com.classpath.springsecurity.model.Employee;
import com.classpath.springsecurity.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee update(long id, Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public void delete(long id) {
        Optional<Employee> optionalEmployee = this.employeeRepository.findById(id);
        if(optionalEmployee.get() != null) {
            this.employeeRepository.delete(optionalEmployee.get());
        }
    }

    @Override
    public List<Employee> listAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findByEmpId(long id) {
        return this.findByEmpId(id);
    }
}