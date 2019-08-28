package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Bootdemo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Bootdemo2Application.class, args);
		Person p1 = context.getBean(Person.class);
		System.out.println(p1);
	}

}
