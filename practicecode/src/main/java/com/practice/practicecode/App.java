package com.practice.practicecode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

abstract class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Emp e1 = (Emp) context.getBean("clerk");
		Emp e2 = (Emp) context.getBean("programmer");
		Emp e3 = (Emp) context.getBean("manager");

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		e1.raiseSalary();
		e2.raiseSalary();
		e3.raiseSalary();

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}
}
