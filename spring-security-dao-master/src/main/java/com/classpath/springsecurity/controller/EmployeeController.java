package com.classpath.springsecurity.controller;

import com.classpath.springsecurity.model.Employee;
import com.classpath.springsecurity.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee save(@RequestBody Employee employee){
        return this.employeeService.save(employee);
    }

    @PutMapping("/{id")
    Employee update(@PathVariable("id") long id, @RequestBody Employee employee){
        return this.employeeService.update(id, employee);
    }

    @DeleteMapping("/{id")
    void delete(@PathVariable long id){
        System.out.println("Employee with id is getting deleted");
        this.employeeService.delete(id);
    }

    @GetMapping("/")
    List<Employee> listAll(){
        System.out.println("came inside the list all method");
        return this.employeeService.listAll();
    }

    @GetMapping("/{id}")
    Employee findByEmpId(@PathVariable("id") long id){
        return this.employeeService.findByEmpId(id);
    }
}