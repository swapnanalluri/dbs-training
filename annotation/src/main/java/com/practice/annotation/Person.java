package com.practice.annotation;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;*/

//@Component("human")
//@Scope("prototype")
public class Person {

	//@Value("Swapna")
	private String name;
	private int age;

	//@Autowired
	//@Qualifier("myaddr")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person() {
		System.out.println("person object created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		System.out.println("Person [name=" + name + ", age=" + age + "]");
		System.out.println("Address=" +address);
		return "";
	}

}
