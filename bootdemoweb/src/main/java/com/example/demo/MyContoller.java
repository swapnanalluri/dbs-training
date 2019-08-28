package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyContoller {

	@RequestMapping("/xyz")
	@ResponseBody // if we are returning some text need to add Response body
	public String abc() {
		return "<h1>Welcome to web</h1><hr><h3>HI</h3>";
	}

	@RequestMapping("/greet") // here we are returning file no need of Response body
	public String demo() {
		return "welcome.html";
	}

	@RequestMapping("/")
	public String login() {
		return "login";
	}

	@RequestMapping("/welcome")
	@ResponseBody
	public String loginProcess(@RequestParam("username") String username, @RequestParam("password") String password) {

		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
		return "<h1> Welcome " + username + "</h1>";
	}

	/*
	 * @RequestMapping("/welcome")
	 * 
	 * @ResponseBody
	 * 
	 * @PostMapping public String loginProcessPost(@RequestParam("username") String
	 * username, @RequestParam("password") String password) {
	 * 
	 * System.out.println("Username : " +username); System.out.println("Password : "
	 * +password); return "<h1> Welcome" +username+ "</h1> <hr>Using post"; }
	 */

	@RequestMapping("/welcome2")
	public String loginProcess2(HttpServletRequest re) {

		String user = re.getParameter("username");
		String password = re.getParameter("password");
		
		HttpSession session = re.getSession();
		session.setAttribute("username", user);
		
		System.out.println("Username : " + user);
		System.out.println("Password : " + password);
		return "welcome";
	}
	
	@RequestMapping("/welcome3")
	public ModelAndView loginProcess3(User user) {
		
		ModelAndView mv= new ModelAndView();
		mv.addObject(user);
		
		if(user.getUsername().equals(user.getPassword()))
			mv.setViewName("welcome");
		else
			mv.setViewName("invalid8");
	
		return mv;
	}
}
