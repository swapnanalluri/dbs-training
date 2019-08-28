package com.demo.springdemo;

public class Employee {

	private String name;
	private int age;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public String toString() {
		System.out.println("Name=" + this.name);
		System.out.println("Age=" + this.age);
		System.out.println("Address=" + this.address);
		return "";
	}

}
