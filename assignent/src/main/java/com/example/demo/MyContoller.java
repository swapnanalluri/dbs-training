package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyContoller {
	
	@Autowired
	private SuppRequestDao sdao;
	
	@Autowired
	private CustomersDao cdao;

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/add")
	public String insert(SUPP_REQUESTS student) {
		sdao.save(student);
		return "index.jsp";
	}
	
	@RequestMapping("/create")
	public String create(Customers cust) {
		cdao.save(cust);
		return "register.jsp";
	}

	@RequestMapping("/add")
	public ModelAndView loginProcess3(Customers user,SUPP_REQUESTS suser) {
		
		String sreq = suser.getEmail();
		ModelAndView mv= new ModelAndView();
		
		if(user.emails.contains("sreq")) {
			mv.addObject(suser);
		}
		else {
			mv.addObject(user);
		}
		return mv;
	}
}
