package com.dbs.emp_mgmt.service;

import com.dbs.emp_mgmt.dao.EmployeeDAO;
import com.dbs.emp_mgmt.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(@Qualifier("hibernateDAO") EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public List<Employee> listAll() {
        return this.employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(long empId)  {
        return this.employeeDAO.findById(empId);
    }

    @Override
    @Transactional
    public void deleteEmployee(long empId) {
        this.employeeDAO.deleteEmployee(empId);
    }
}