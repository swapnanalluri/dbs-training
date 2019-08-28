package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Tweet;
import com.example.demo.model.Users;
import com.example.demo.repository.UserDAO;
import com.example.demo.service.UserServiceImpl;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
    private UserServiceImpl userService;
	@Autowired
    private UserDAO dao;
	
    @GetMapping(value = "/login")
    public String login(Model model){
        
        List<Users> listOfAllUsers  = userService.listAll();
        listOfAllUsers.forEach(user ->  System.out.println(user));
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model,Users user){
       
        if(dao.findByName(username) != null&&dao.findByPassword(password)!=null) {
        	model.addAttribute("user", username);
            return "success";
        }
        return "register";
    }

    @GetMapping("/listAll")
    public String listAllUsers(Model model){
        List<Users> users = this.userService.listAll();
        this.userService.listAll().forEach(System.out::println);
        model.addAttribute("users", users);
        return "list";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser( @Valid @ModelAttribute("user") Users user,
                                BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            System.out.println("Error "+bindingResult.toString());
            return "register";
        }
        
        List<String> urls = new ArrayList<String>();
        urls.add("a");
        urls.add("b");
        
        Tweet tweet = new Tweet();
        tweet.setMessage("tweet added");
        tweet.setMediaUrls(urls);
        
       user.addTweets(tweet);
 
        this.userService.saveUsers(user);
        
        return "dashboard";
    }
}
