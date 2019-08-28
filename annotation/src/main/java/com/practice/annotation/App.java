package com.practice.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		Emp e1 = (Emp) context.getBean("myemp");
		System.out.println(e1);
		Emp e2 = (Emp) context.getBean("emp");
		System.out.println(e2);

		Person p1 = (Person) context.getBean("getPerson");
		System.out.println(p1);
		Person p2 = (Person) context.getBean("getPerson");
		System.out.println(p2);

		/*
		 * Student s1 = (Student) context.getBean("student"); System.out.println(s1);
		 */
	}
}
