package com.practice.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan(basePackages = "com.practice.annotation")
@PropertySource("resources.properites")
public class BeanConfig {
	
	@Autowired
	Address address;
	
	@Bean(name= {"myemp","emp"}) //if @Bean("myemp") - it is  by default taken as id attribute, if name="myemp" or name={"e","x"} then it is name attribute and can give many values
	public Emp getEmp() {
		return new Emp();
	}
	
	@Bean
	@Scope("prototype")
	public Person getPerson() {
		Person p1= new Person();
		//p1.setAddress(new Address());
		p1.setAddress(address);
		return p1;
		
	}
	@Bean
	public Address getAddress() {
		return new Address();
		
		
	}
	
}
