package com.demo.springdemo;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {

		/*
		 * Resource resource = new ClassPathResource("Beans.xml"); BeanFactory factory =
		 * new XmlBeanFactory(resource);
		 */

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Vehicle b1 = (Vehicle) context.getBean("v1");
		// Vehicle b2 = (Vehicle) context.getBean("v2");
		b1.start();
		b1.stop();
		// b2.start();
		// b2.stop();

		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e1);

		Student s1 = (Student) context.getBean("st");
		System.out.println(s1);

		context.close();
	}
}
