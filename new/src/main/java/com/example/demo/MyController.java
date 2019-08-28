package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@Autowired
	StudentDAO dao;

	@RequestMapping("/")
	public String register() {
		return "register.jsp";
	}
	
	@RequestMapping("/add")
	public String insert(Student student) {
		dao.save(student);
		return "register.jsp";
	}
	@RequestMapping("/delete")
	public String remove(int rollno) {
		dao.deleteById(rollno);
		return "register.jsp";
	}
	
}
