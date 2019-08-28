package com.demo.springdemo;

public class Student {
	
	
	private String name;
	private int roll;
	private Address address;
	public Student(int roll,String name,Address address) {
		super();
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	public String toString() {
		System.out.println("Name="+name );
		System.out.println("roll="+roll);
		System.out.println("address="+address);
		return "";
		
	}

}
