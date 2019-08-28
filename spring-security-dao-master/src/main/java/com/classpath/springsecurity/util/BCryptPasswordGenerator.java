package com.classpath.springsecurity.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordGenerator {
    public static void main(String[] args) {
        String password = "password";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String encodedPassword1 = passwordEncoder.encode(password);
        System.out.println(encodedPassword1);

        String encodedPassword2 = passwordEncoder.encode(password);
        System.out.println(encodedPassword2);

        boolean matches1 = passwordEncoder.matches("password", encodedPassword1);
        boolean matches2 = passwordEncoder.matches("password", encodedPassword2);
        System.out.println(matches1);
        System.out.println(matches2);

    }
}