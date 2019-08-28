package com.practice.annotation;

import org.springframework.beans.factory.annotation.Value;

//@Component
public class Emp {
	
	@Value("${myCompany}")
	private String company;
	public Emp() {
		System.out.println("Emp object created");
	}

	private String name;
	private int age;
	@Override
	public String toString() {
		return "Emp [company=" + company + ", name=" + name + ", age=" + age + "]";
	}

	

}
