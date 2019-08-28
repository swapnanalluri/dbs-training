package com.classpath.springsecurity.controller;

import com.classpath.springsecurity.model.User;
import com.classpath.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    //@PreAuthorize("hasAnyRole('ADMIN','USER')")
    @PostMapping("/")
    public User createUser(@RequestBody User user){
        String password = user.getPassword();
        user.setPassword(this.bCryptPasswordEncoder.encode(password));
        return this.userRepository.save(user);
    }

    @GetMapping("/")
    public List<User> listAllUsers(){
        return this.userRepository.findAll();
    }

    @PostMapping("/logout")
    public void logout(){
        HttpSession
    }

}