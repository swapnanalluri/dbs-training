package com.classpath.springsecurity.service;

import com.classpath.springsecurity.model.CustomUserDetails;
import com.classpath.springsecurity.model.User;
import com.classpath.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =  this.userRepository.findByUsername(username);
        CustomUserDetails userDetails = null;
        if(user != null){
            userDetails = new CustomUserDetails();
             userDetails.setUser(user);
        }else {
            throw new UsernameNotFoundException("User is not present");
        }
        return userDetails;
    }
}